package GameOOP;

import java.util.ArrayList;
import java.util.List;

public class Crossbowman extends Character {
    protected int arrows;

    public Crossbowman(String name, int x, int y, String nameTeam, int arrows) {
        super(name,x,y, nameTeam, "Elf", 30, 30, 8, 5, 1, 5, 1, "Arbalet");
        this.arrows = arrows;
    }

    public void getStep(ArrayList<Character> team, ArrayList<Character> friend) {
        if (getHealth() > 0) {
            if (Crossbowman.this.getArrows() > 0) {
                System.out.println(this.name + " атаковал!");
                toAttack(getMinDistance(team));
                this.arrows--;
                Crossbowman.this.setArrows(this.arrows);
            } else {
                System.out.println(this.name + " нужны стрелы!!!");
            }
        }
    }

    private void setArrows(int arrows) {
        this.arrows = arrows;
    }

    private int getArrows() {
        return this.arrows;
    }

    @Override
    public String toString() {
        return "Имя героя: " + getName() + ", класс: " + getClass().getSimpleName() + "; Команда: " + getNameTeam()
                + "\nПринадлежность героя: " + getRace() + "; Текущее состояние здоровья: " + getHealth() + "; Стрелы: " + getArrows()
                + "; Координаты (" + place.getX() + " : " + place.getY() + ")" + "; Приоритет: " + getSpeeed()
                + "\n" + "-".repeat(20);
    }

}
