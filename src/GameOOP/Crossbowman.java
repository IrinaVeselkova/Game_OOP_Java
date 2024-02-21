package GameOOP;

import java.util.ArrayList;
import java.util.List;

public class Crossbowman extends Character {
    protected int arrows;

    public Crossbowman(String name, int x, int y, String nameTeam, int arrows) {
        super(x, y, name, nameTeam, "Elf", 2, 2, 8, 5, 1, 5, 1, "Arbalet");
        this.arrows = arrows;
    }
    public void Step(ArrayList<Character> team) {
        if (Crossbowman.this.getHealth() > 0) {
            if (Crossbowman.this.getArrows() > 0) {
                toAttack(getMinDistance(team));
                System.out.println("Атаковали!!!");
                this.arrows--;
                Crossbowman.this.setArrows(this.arrows);
            } else {
                System.out.println("Give me more arrows!!!");
            }
        }
    }
    private void setArrows(int arrows) {
        this.arrows = arrows;
    }
    private int getArrows() {
        return this.arrows;
    }

}
