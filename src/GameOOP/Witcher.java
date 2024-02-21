package GameOOP;

import GameOOP.Character;

import java.util.ArrayList;

public class Witcher extends Character {


    public Witcher(String name,int x, int y, String nameTeam){
        super(x,y,name, nameTeam,"Human", 70, 100, 10, 10, 10, 3, 1, "Sword");

    }
    @Override
    public void Step(ArrayList<Character> team) {

    }

}


