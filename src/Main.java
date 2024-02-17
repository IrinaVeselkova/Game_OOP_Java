import GameOOP.*;
import GameOOP.Character;

import java.util.*;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        List<Character> team1 = createTeam(10,0);
        List<Character> team2 = createTeam(10,9);

//

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
// ищем в команде лучника (crossbowman) и находим к нему ближайшего противника
        for (Character cbm : team1) {
            if (cbm.getClass().getSimpleName().equals("Crossbowman")||cbm.getClass().getSimpleName().equals("Sniper")) {
                System.out.println("Ближайший к\n" + cbm + "\nпротивник: =>\n" + cbm.getMinDistance(team2));
                System.out.println();
            }
        }

    }

    static List<Character> createTeam(int quantityHeroes, int y) {
        List<Character> team = new ArrayList<>();
        for (int i = 0; i < quantityHeroes; i++) {
            switch (new Random().nextInt(1, 8)) {
                case 1:
                    team.add(new Witcher(Character.getName(), i, y));
                    break;
                case 2:
                    team.add(new Bandit(Character.getName(), i, y));
                    break;
                case 3:
                    team.add(new Crossbowman(Character.getName(), i, y));
                    break;
                case 4:
                    team.add(new Peasant(Character.getName(), i, y));
                    break;
                case 5:
                    team.add(new Sniper(Character.getName(), i, y));
                    break;
                case 6:
                    team.add(new Spear(Character.getName(), i, y));
                    break;
                case 7:
                    team.add(new Monk(Character.getName(), i, y));
                    break;
            }
        }
    return team;
    }

}