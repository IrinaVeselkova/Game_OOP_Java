package GameOOP;

import javax.swing.text.Position;
import java.util.ArrayList;

public class Bandit extends Character {

    public Bandit(String name, int x, int y, String nameTeam){
        super( name, x,y,nameTeam,"Goblin", 30, 30, 4, 0, 6, 2, 1, "Pistol");

    }


        @Override
        public void getStep(ArrayList<Character > enemy, ArrayList<Character> friend) {
            //f (health<=0) return;

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
