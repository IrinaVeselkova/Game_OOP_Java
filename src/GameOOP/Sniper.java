package GameOOP;

import java.util.ArrayList;

public class Sniper extends Character{
    protected int arrows;
    public Sniper(String name, int x, int y, String nameTeam, int arrows){
        super(x,y,name, nameTeam,"Goblin", 6, 24, 6, 1, 8, 5, 1, "Sniper");
    this.arrows=arrows;
    }

    @Override
    public void Step(ArrayList<Character> team) {

    }

}