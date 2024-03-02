package Characters.ArrowsMan;

import GameOOP.Character;
import Characters.Helpers.Peasant;
import GameOOP.Place;

import java.util.ArrayList;

public abstract class ArrowsMan extends Character {
    protected  int arrows;
    public ArrowsMan(String name, int x, int y, String nameTeam, int arrows) {
        super(name, new Place(x,y), nameTeam,"Goblin", 20, 20, 3, 1, 5, 5, 1, "Sniper");
        this.arrows=arrows;
    }

    @Override
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

    private int getArrows() {
        return this.arrows;
    }
    private void setArrows(int arrows) {
        this.arrows = arrows;
    }
    @Override
    public String toString() {
        return super.toString()+" \u27b6" + this.arrows;
    }
}
