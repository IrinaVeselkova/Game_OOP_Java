package Characters.ArrowsMan;
public class Sniper extends ArrowsMan {

    public Sniper(String name, int x, int y, String nameTeam, int arrows) {
        super(name, x, y, nameTeam, arrows);
    }
    public  String getInfo(){
        return "Стрелок";
    }
}

