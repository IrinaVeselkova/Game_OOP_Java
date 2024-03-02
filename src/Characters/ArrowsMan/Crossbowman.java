package Characters.ArrowsMan;

import Characters.ArrowsMan.ArrowsMan;

public class Crossbowman extends ArrowsMan {
    public Crossbowman(String name, int x, int y, String nameTeam, int arrows) {
        super(name, x, y, nameTeam, arrows);
    }


    public String getInfo() {
        return "Арбалетчик";
    }

}
