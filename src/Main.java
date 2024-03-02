
import Characters.ArrowsMan.*;
import Characters.Healers.*;
import Characters.Helpers.*;
import Characters.Infantry.*;
import GameOOP.Character;

import java.util.*;

import static java.lang.Math.abs;

public class Main {
    public static ArrayList<Character> holyTeam = createTeam(10, 10, "holyTeam");
    public static ArrayList<Character> darkTeam = createTeam(10, 1, "darkTeam");
    public static ArrayList<Character> allTeam = new ArrayList<>();


    public static void main(String[] args) {
        // объединяем их в одну общую команду
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        allTeam.sort((o1, o2) -> o2.getSpeeed() - o1.getSpeeed());
        Scanner scanner = new Scanner(System.in);
        while (true) {

            View.view();
            scanner.nextLine();
            int count1 = 0;
            int count2 = 0;
            for (Character holy : holyTeam) {
                count1 += holy.getHealth();
            }
            for (Character dark : holyTeam) {
                count2 += dark.getHealth();
            }
            if (count2 <= 0) {
                System.out.println("Победила команда holy!");
                break;
            }
            if (count1 <= 0) {
                System.out.println("Победила команда dark!");

                break;
            }
            for (Character unit : allTeam) {
                if (holyTeam.contains(unit)) unit.getStep(darkTeam, holyTeam);
                else unit.getStep(holyTeam, darkTeam);
            }
        }
    }

    static ArrayList<Character> createTeam(int quantityHeroes, int y, String nameTeam) {
        ArrayList<Character> team = new ArrayList<>();
        for (int i = 1; i < quantityHeroes + 1; i++) {
            switch (new Random().nextInt(1, 8)) {
                case 1:
                    team.add(new Witcher(Character.getNewName(), i, y, nameTeam));
                    break;
                case 2:
                    team.add(new Bandit(Character.getNewName(), i, y, nameTeam));
                    break;
                case 3:
                    team.add(new Crossbowman(Character.getNewName(), i, y, nameTeam, 30));
                    break;
                case 4:
                    team.add(new Peasant(Character.getNewName(), i, y, nameTeam));
                    break;
                case 5:
                    team.add(new Sniper(Character.getNewName(), i, y, nameTeam, 30));
                    break;
                case 6:
                    team.add(new Spear(Character.getNewName(), i, y, nameTeam));
                    break;
                case 7:
                    team.add(new Monk(Character.getNewName(), i, y, nameTeam));
                    break;
            }
        }
        return team;
    }
}