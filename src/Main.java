class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Gun extends Weapon {
    public Gun(String name, int damage) {
        super(name, damage);
    }
}

class Sword extends Weapon {
    public Sword(String name, int damage) {
        super(name, damage);
    }
}

class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public void attack(Villain villain, Weapon weapon) {
        int damage = weapon.getDamage();
        villain.takeDamage(damage);
        System.out.println(name + " attacks " + villain.getName() + " with " + weapon + " for " + damage + " damage.");
    }
}

class Villain {
    private String name;
    private int health;

    public Villain(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(name + " takes " + damage + " damage. Remaining health: " + health);
    }

    public void attack(Hero hero, Gun gunTwo) {
    }
}

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("src.Hero");
        Villain villain = new Villain("src.Villain");

        Gun gunOne = new Gun("gunOne", 30);
        Gun gunTwo = new Gun("gunTwo", 50);

        hero.attack(villain, gunOne);
        villain.attack(hero, gunTwo);
    }
}