package GameOOP;

import java.util.ArrayList;
import java.util.Comparator;

public class Monk extends Character {
    int mana;
    public Monk(String name, int x, int y, String nameTeam){
        super(name, new Place(x,y),nameTeam,"Human",20, 20, 2, 10, 3, 1, 1, "Null");
    mana=10;
    }
   /* Реализовать метод step() пехоты. Первое проверяем живы ли мы,
   потом ищем ближайшего противника. Если противник в соседней клетке,
   наносим повреждение. Иначе двигаемся в сторну противника. Алгоритм движения,
   если dX>dY двигаемся по x иначе по y. dX и dY (разница наших координат и ближайшего противника)
   знаковые, от знака зависит направление. По своим не ходить!
        */
    @Override
    public void getStep(ArrayList<Character> team, ArrayList<Character> friend) {
        if (getHealth()<=0) return;
        if (mana <=2){
            mana++;
            return;
        }
        ArrayList<Character> sortedlist = new ArrayList<>(friend);
        ArrayList<Character> deadlist = new ArrayList<>(friend);
        sortedlist.sort((Comparator.comparingInt(Character::getHealth)));
        int countdead =0;
        for (Character character : sortedlist) {
            if (character.getHealth()==0) {
                deadlist.add(character);
                countdead++;}
        }
        if (countdead>=3){
            if (mana<10){
                mana++;
                return;
            }
            else{
                deadlist.sort(((o1, o2) -> o2.speed - o1.speed));
                deadlist.getFirst().health = maxHealth;
                mana=0;
                System.out.println("Воскресил: " + deadlist.getFirst().getInfo());
                return;
            }

        }

        sortedlist.getFirst().health+=10;
        mana-=2;
    }

    public  String getInfo(){
        return "Монах";
    }
}
