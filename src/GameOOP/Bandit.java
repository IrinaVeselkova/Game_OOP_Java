package GameOOP;

import java.util.ArrayList;

public class Bandit extends Character {

    public Bandit(String name, int x, int y, String nameTeam){
        super(x,y,name, nameTeam,"Goblin", 30, 30, 4, 0, 6, 2, 1, "Pistol");

    }

    @Override
    public void getStep(ArrayList<Character> team) {

    }
}
