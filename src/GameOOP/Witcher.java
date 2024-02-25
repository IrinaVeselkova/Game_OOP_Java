package GameOOP;

import GameOOP.Character;

import java.util.ArrayList;

public class Witcher extends Character {


    public Witcher(String name, int x, int y, String nameTeam) {
        super(name, x,y, nameTeam, "Human", 60, 60, 10, 10, 10, 3, 1, "Sword");

    }

    @Override
    public void getStep(ArrayList<Character> team, ArrayList<Character> friends) {

    }

}


