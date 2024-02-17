import GameOOP.*;
import GameOOP.Character;

import java.util.*;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        List<Character> team1 = new ArrayList<>();
        List<Character> team2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(1,8)) {
                case 1:
                    team1.add(new Witcher(Character.getName(), i, 0));
                    team2.add(new Witcher(Character.getName(), i, 9));
                    break;
                case 2:
                    team1.add(new Bandit(Character.getName(), i, 0));
                    team2.add(new Bandit(Character.getName(), i, 9));
                    break;
                case 3:
                    team1.add(new Crossbowman(Character.getName(), i, 0));
                    team2.add(new Crossbowman(Character.getName(), i, 9));
                    break;
                case 4:
                    team1.add(new Peasant(Character.getName(), i, 0));
                    team2.add(new Peasant(Character.getName(), i, 9));
                    break;
                case 5:
                    team1.add(new Sniper(Character.getName(), i, 0));
                    team2.add(new Sniper(Character.getName(), i, 9));
                    break;
                case 6:
                    team1.add(new Spear(Character.getName(), i, 0));
                    team2.add(new Spear(Character.getName(), i, 9));
                    break;
                case 7:
                    team1.add(new Monk(Character.getName(), i, 0));
                    team2.add(new Monk(Character.getName(), i, 9));
                    break;
            }
        }

        for (Character character: team1) {
            System.out.println("team1");
            System.out.println(character.toString());
            System.out.println();
        }
        for (Character character: team2) {
            System.out.println("team2");
            System.out.println(character.toString());
            System.out.println();
        }

        System.out.println("Ближайший к\n" + team1.get(1) + "\nпротивник: =>\n" + team1.get(1).getMinDistance(team2));

    }
}