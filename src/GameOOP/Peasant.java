package GameOOP;

import GameOOP.Character;

import java.util.ArrayList;

public class Peasant extends Character {

    public Peasant(String name,int x, int y, String nameTeam){
        super(x,y,name, nameTeam,"Human", 10, 30, 2, 0, 1, 2, 1, "Sword");;
    }
    @Override
    public void Step(ArrayList<Character> team) {

    }

}