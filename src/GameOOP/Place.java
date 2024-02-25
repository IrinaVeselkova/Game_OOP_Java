package GameOOP;


import static java.lang.Math.sqrt;

public class Place {

    int X, Y;

    public Place(int x, int y) {
        X = x;
        Y = y;
    }

    int getX() {
        return X;
    }

    int getY() {
        return Y;
    }

    public static double getDistance(Place place1, Place place2) {
        return sqrt((place2.X - place1.X) * (place2.X - place1.X) + (place2.Y - place1.Y) * (place2.Y - place1.Y));
    }

    public static Place getDifference(Place place1, Place place2) {

        return new Place(place1.X - place2.X, place1.Y - place2.Y);
    }
    public boolean equals (Place place){
        return this.X == place.X && this.Y == place.Y;
    }

}
