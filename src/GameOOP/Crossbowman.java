package GameOOP;

import java.util.ArrayList;
import java.util.List;

public class Crossbowman extends Character {
    protected int arrows;

    public Crossbowman(String name, int x, int y, String nameTeam, int arrows) {
        super(name, new Place(x,y), nameTeam, "Elf", 30, 30, 4, 5, 1, 5, 1, "Arbalet");
        this.arrows = arrows;
    }

    public void getStep(ArrayList<Character> enemy, ArrayList<Character> friend) {
        Character target = super.getMinDistance(enemy);
        if (target==null) return;
        if (getHealth() > 0) {
            if (this.getArrows() > 0) {
                this.toAttack(target);
                for(Character unit: friend){
                    if (unit.getInfo().equals("Фермер")&&!((Peasant)unit).flag) {
                        ((Peasant)unit).flag=true;
                        return;
                    }
                }
                this.arrows--;

            }
        }
    }
//    @Override
//    public void getStep(ArrayList<Character> enemy, ArrayList<Character> friend) {
//        if ((health <= 0) || (arrows == 0)) return;
//        Character target = super.getMinDistance(enemy);
//           if (target == null) return;
//        target.toAttack(this);
//        arrows--;
//    }
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
