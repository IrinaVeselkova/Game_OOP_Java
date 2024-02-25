package GameOOP;

import GameOOP.Character;

import java.util.ArrayList;

public class Peasant extends Character {

    public Peasant(String name,int x, int y, String nameTeam){
        super(name, x,y, nameTeam,"Human", 30, 30, 5, 0, 1, 2, 1, "Sword");;
    }
    @Override
    public void getStep(ArrayList<Character> team, ArrayList<Character> friend) {

    }

}