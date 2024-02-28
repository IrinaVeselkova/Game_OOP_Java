package GameOOP;

import java.util.ArrayList;

public class Sniper extends Character{
    protected int arrows;
    public Sniper(String name, int x, int y, String nameTeam, int arrows){
        super(name, new Place(x,y), nameTeam,"Goblin", 20, 20, 6, 1, 5, 5, 1, "Sniper");
    this.arrows=arrows;
    }

    public void getStep(ArrayList<Character> team, ArrayList<Character> friend) {
        if (Sniper.this.getHealth() > 0) {
            if (Sniper.this.getArrows() > 0) {
                toAttack(getMinDistance(team));
                this.arrows--;
                Sniper.this.setArrows(this.arrows);
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
        return super.toString()+" \u27b6" + this.arrows;
    }
    public  String getInfo(){
        return "Стрелок";
    }
}