abstract class Character {
    String name;
    int hp;
    int maxHp;
    String race;
    String gender;
    int speed;
    int armor;
    int damage;
    boolean alive = true;

    public Character(String name, Integer hp, String race, String gender, int speed, int armor, int damage) {
        maxHp = hp;
    }

    int go(Integer place) {
        return place - speed;
    }

    public void attack(Character character) {
        if (character.hp - damage <= 0) {
            character.hp = 0;
            character.alive = false;
        } else {
            character.hp -= damage;
        }
    }

    public void getDamage(Character character) {
        if (hp - character.damage <= 0) {
            hp = 0;
            alive = false;
        } else {
            hp -= character.damage;
        }

    }

    void retreat() {
        System.out.println("персонаж сбежал с поля боя");
    }

}
