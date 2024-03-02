package Characters.Healers;

import Characters.Infantry.Infantry;
public class Witcher extends Infantry {

    public Witcher(String name, int x, int y, String nameTeam) {
        super(name, x, y, nameTeam);
    }
    public  String getInfo(){
        return "Ведьмак";
    }
}


