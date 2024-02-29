package GameOOP;

import GameOOP.Character;

import java.util.ArrayList;

public class Peasant extends Character {
    boolean flag;
    protected int arrows;

    public Peasant(String name,int x, int y, String nameTeam){
        super(name, new Place(x,y), nameTeam,"Human", 20, 20, 2, 0, 1, 1, 1, "Sword");;
    flag=false;
    arrows=10;
    }
    @Override
    public void getStep(ArrayList<Character> team, ArrayList<Character> friend) {
        if (health<=0) return;
        flag=false;

    }


    public  String getInfo(){
        return "Фермер";
    }
}