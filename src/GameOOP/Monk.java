package GameOOP;

import java.util.ArrayList;

public class Monk extends Character {
    public Monk(String name, int x, int y, String nameTeam){
        super(x,y,name, nameTeam,"Human",5, 20, 2, 10, 3, 1, 1, "Null");
    }
    @Override
    public void Step(ArrayList<Character> team) {

    }

}
