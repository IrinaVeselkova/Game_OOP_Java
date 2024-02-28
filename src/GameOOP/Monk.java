package GameOOP;

import java.util.ArrayList;

public class Monk extends Character {
    public Monk(String name, int x, int y, String nameTeam){
        super(name, new Place(x,y),nameTeam,"Human",20, 20, 2, 10, 3, 1, 1, "Null");
    }
   /* Реализовать метод step() пехоты. Первое проверяем живы ли мы,
   потом ищем ближайшего противника. Если противник в соседней клетке,
   наносим повреждение. Иначе двигаемся в сторну противника. Алгоритм движения,
   если dX>dY двигаемся по x иначе по y. dX и dY (разница наших координат и ближайшего противника)
   знаковые, от знака зависит направление. По своим не ходить!
        */
    @Override
    public void getStep(ArrayList<Character> team, ArrayList<Character> friend) {
    }

    public  String getInfo(){
        return "Монах";
    }
}
