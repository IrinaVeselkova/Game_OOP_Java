package GameOOP;

import java.util.ArrayList;
import java.util.List;

public class Crossbowman extends Character {
    protected int arrows;

    public Crossbowman(String name, int x, int y, String nameTeam, int arrows) {
        super(name, new Place(x,y), nameTeam, "Elf", 30, 30, 8, 5, 1, 5, 1, "Arbalet");
        this.arrows = arrows;
    }

    public void getStep(ArrayList<Character> team, ArrayList<Character> friend) {
        if (getHealth() > 0) {
            if (Crossbowman.this.getArrows() > 0) {
                super.toAttack(getMinDistance(team));
                this.arrows--;
                Crossbowman.this.setArrows(this.arrows);
            }
        }
    }

    private void setArrows(int arrows) {
        this.arrows = arrows;
    }

    private int getArrows() {
        return this.arrows;
    }

    public String toString() {
        return super.toString() + " \u27b6" + this.arrows;
    }

    public String getInfo() {
        return "Арбалетчик";
    }

}
