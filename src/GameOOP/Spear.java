package GameOOP;

import java.util.ArrayList;



public class Spear extends Character {
        public Spear(String name,int x, int y, String nameTeam){

            super(name, x,y, nameTeam,"Elf", 60, 60, 6, 2, 5, 4, 1,"Spear");
        }
    @Override
    public void getStep(ArrayList<Character > enemy, ArrayList<Character> friend) {
        if (health<=0) return;

        Character target = super.getMinDistance(enemy);
        if (Place.getDistance(target.place, place) < 2){

            System.out.println(this.name + " атаковал! ("+ place.X + ":" + place.Y+")");
            this.toAttack(target);
            return;
        }
        Place diff = Place.getDifference(place,target.place);

        Place newposition = new Place(place.X, place.Y);

        if (Math.abs(diff.X) > Math.abs(diff.Y)){

            newposition.X += diff.X < 0 ? 1 : -1;}
        else
        {newposition.Y += diff.Y < 0 ? 1 : -1;}

        for (Character unit : friend) {
            if (unit.place.equals(newposition)) {
                unit.place.X=this.place.X;
                unit.place.Y=this.place.Y;

            }

        }
        this.place = newposition;
        System.out.println(this.name + " текущая позиция ("+ place.X + ":" + place.Y+")");



    }
    }

