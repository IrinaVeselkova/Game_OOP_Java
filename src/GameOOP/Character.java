package GameOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.sqrt;

public abstract class Character implements Step {

    protected Place pos;
    protected String name;
    protected String race;
    protected int health;
    protected int maxHealth;
    protected int strength;
    protected int magic;
    protected int defense;
    protected int speed;
    protected int level;
    protected String weapon;
    protected String nameTeam;


    //
    public Character(int x, int y, String name, String nameTeam, String race, int health, int maxHealth, int strength, int magic, int defense, int speed, int level, String weapon) {
        this.defense = defense;
        this.health = health;
        this.maxHealth = maxHealth;
        this.name = name;
        this.race = race;
        this.strength = strength;
        this.magic = magic;
        this.speed = speed;
        this.level = level;
        this.weapon = weapon;
        pos = new Place(x, y);
        this.nameTeam = nameTeam;


    }

    public String getRace() {
        return this.race;
    }

    public String getName() {
        return this.name;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public int getHealth() {
        return this.health;
    }

    private int setHealth(int health) {
        this.health = health;
        return this.health;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getMagic() {
        return this.magic;
    }

    public int getSpeeed() {
        return this.speed;
    }

    public int getDefense() {
        return this.defense;
    }

    private int setDefense(int defense) {
        this.defense = defense;
        return this.defense;
    }

    public String toAttack(Character character) {
        int damage = character.getStrength() - this.defense;
        if (damage <= 0) {
            character.setHealth(0);
            return ("Состояние " + character.getName() + " после атаки: герой умер");
        }
        toUpLevel();
        this.health = this.health - damage;
        return ("Состояние " + this.name + " после атаки: " + this.health);

    }

    public int toHeal(Character character) {
        if (this.health + character.magic > this.maxHealth) {
            this.health = this.maxHealth;
        } else this.health = this.health + this.magic;
        return this.health;
    }

    private int toUpLevel() {
        this.level = this.level + 1;
        this.strength = this.strength + 5;
        this.magic = this.magic + 5;
        this.defense = this.defense + 5;
        return this.level;
    }

    public static String getNewName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

    public Character getMinDistance(List<Character> team) {
        // написать метод по поиску рядом находящегося противника
        double minDistance = sqrt(200);
        Character nearEnemy = team.getFirst();
        for (Character character : team) {
            if (Place.getDistance(pos.getX(), pos.getY(), character.pos.getX(), character.pos.getY()) <= minDistance) {
                nearEnemy = character;
                minDistance = Place.getDistance(pos.getX(), pos.getY(), character.pos.getX(), character.pos.getY());
            }
        }

        return nearEnemy;
    }

    @Override
    public String toString() {
        return "Имя героя: " + this.name+ ", класс: " + getClass().getSimpleName() + "; Команда: " + Character.this.getNameTeam()
                + "\nПринадлежность героя: " + this.race + "; Текущее состояние здоровья: " + this.health
                + "; Координаты (" + pos.X + " : " + pos.Y + ")"+ "; Приоритет: " + getSpeeed()
                + "\n"+"-".repeat(20);
    }

    public String getNameTeam() {
        return this.nameTeam;
    }


}