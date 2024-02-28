package GameOOP;

import GameOOP.Character;

import java.util.ArrayList;

public class Peasant extends Character {

    public Peasant(String name,int x, int y, String nameTeam){
        super(name, new Place(x,y), nameTeam,"Human", 20, 20, 5, 0, 1, 1, 1, "Sword");;
    }
    @Override
    public void getStep(ArrayList<Character> team, ArrayList<Character> friend) {

    }
    public  String getInfo(){
        return "Фермер";
    }
}