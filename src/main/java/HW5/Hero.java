package HW5;

public class Hero {
    private String name;
    private int hp;

    public Hero() {
        this("Paratrooper", 100);
    }

    public Hero(String name, int hp) {
        this.name = name;
        if (hp > 200) {
            this.hp = 200;
        } else if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class BFG {
    private int ammo;
    private int damage;
    private String name;

    public BFG(int ammo, int damage, String name) {
        this.ammo = ammo;
        this.damage = damage;
        this.name = name;
    }

    public BFG(int ammo, int damage) {
        this(ammo, damage, "BFG");
    }

    public BFG(int ammo) {
        this(ammo, 50, "BFG");
    }

    public BFG() {
        this(1000, 50, "BFG");
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + ", ammo: " + this.ammo + ", damage: " + this.damage;
    }
}