package GameOOP;

import java.util.ArrayList;

public class Spear extends Character {
        public Spear(String name,int x, int y, String nameTeam){

            super(name, x,y, nameTeam,"Elf", 40, 40, 6, 2, 5, 5, 1,"Spear");
        }
    @Override
    public void getStep(ArrayList<Character > enemy, ArrayList<Character> friend) {
        if (health<=0) return;

        Character target = super.getMinDistance(enemy);
        if (Place.getDistance(target.place, place) < 2){
            System.out.println(this.name + " атаковал!");
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
            if (unit.place.equals(newposition)) return;

        }
        this.place = newposition;



    }
    }

