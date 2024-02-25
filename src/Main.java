import GameOOP.*;
import GameOOP.Character;

import java.util.*;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        // создаем две команды и объединяем их в одну общую команду
        ArrayList<Character> team1 = createTeam(10, 9, "team1");
        ArrayList<Character> team2 = createTeam(10, 9, "team2");
        ArrayList<Character> allTeam = new ArrayList<>(team1);
        allTeam.addAll(team2);

        System.out.println("-".repeat(16));
        // сортируем всех игроков по скорости (приоритету)
        allTeam.sort((o1, o2) -> o2.getSpeeed() - o1.getSpeeed());
        // проверяем сортировку
        allTeam.forEach(n -> System.out.println(n));

//
//        for (Character cbm : allTeam) {
//            if (cbm.getNameTeam().equals("team1") && (cbm.getClass().getSimpleName().equals("Crossbowman") || cbm.getClass().getSimpleName().equals("Sniper"))) {
//
//                cbm.getStep(team2, team1);
//                System.out.println(cbm);
//            }
//
//            if (cbm.getNameTeam().equals("team2") && (cbm.getClass().getSimpleName().equals("Crossbowman") || cbm.getClass().getSimpleName().equals("Sniper"))) {
//
//                cbm.getStep(team1, team2);
//                System.out.println(cbm);
//            }
//        }
        Scanner scanner = new Scanner(System.in);

        while (true || allTeam.size()>1) {
            scanner.nextLine();

            for (Character unit : allTeam) {
                if (team1.contains(unit)) unit.getStep(team2, team1);
                else unit.getStep(team1, team2);
                            }
            team1.removeIf(hero -> hero.getHealth() == 0);
            team2.removeIf(hero1 -> hero1.getHealth() == 0);
            allTeam.clear();
            allTeam.addAll(team1);
            allTeam.addAll(team2);

            System.out.println("После атаки осталось: " + allTeam.size() + " героев");
        }
        for (Character t:allTeam) t.toString();
            }

    static ArrayList<Character> createTeam(int quantityHeroes, int y, String nameTeam) {
        ArrayList<Character> team = new ArrayList<>();
        for (int i = 0; i < quantityHeroes; i++) {
            switch (new Random().nextInt(1, 8)) {
                case 1:
                    team.add(new Witcher(Character.getNewName(), i, y, nameTeam));
                    break;
                case 2:
                    team.add(new Bandit(Character.getNewName(), i, y, nameTeam));
                    break;
                case 3:
                    team.add(new Crossbowman(Character.getNewName(), i, y, nameTeam, 5));
                    break;
                case 4:
                    team.add(new Peasant(Character.getNewName(), i, y, nameTeam));
                    break;
                case 5:
                    team.add(new Sniper(Character.getNewName(), i, y, nameTeam, 5));
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