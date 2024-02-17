import GameOOP.*;
import GameOOP.Character;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Character withcer = new Witcher("Lilia");
        Character peasant = new Peasant("Petr");
        Character spear = new Spear("Goban");
        Character sniper = new Sniper("Fortuna");
        Character bandit = new Bandit("Trop");
        Character monk = new Monk("Anatol");
        Character crossbowman = new Crossbowman("Trifani");

        Set<Character> heroes = new HashSet<>();
        heroes.add(withcer);
        heroes.add(peasant);
        heroes.add(spear);
        heroes.add(sniper);
        heroes.add(bandit);
        heroes.add(monk);
        heroes.add(crossbowman);

        for (Character character: heroes) {

            System.out.println(character.toString());
            System.out.println();

        }


//        System.out.println(character1);
//        character1.toHeal(character3);
//        System.out.println(character1);
//        System.out.println(character3.toAttack(character1));
//        System.out.println(character1);
//        System.out.println(character4.getName());

    }



}