package GameOOP;

import GameOOP.Character;

import java.util.ArrayList;

public class Witcher extends Character {


    public Witcher(String name, int x, int y, String nameTeam) {
        super(name, new Place(x,y), nameTeam, "Human", 60, 60, 4, 4, 3, 3, 1, "Sword");

    }

    @Override
    public void getStep(ArrayList<Character> team, ArrayList<Character> friends) {

    }
    public  String getInfo(){
        return "Ведьмак";
    }
}


