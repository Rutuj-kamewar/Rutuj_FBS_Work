package gameAbstract;

// Superclass
abstract class Character {
    String name;
    int level;
    double health;
    String gameMode;

    Character() {
        this.name = "Unknown";
        this.level = 1;
        this.health = 100.0;
        this.gameMode = "Adventure";
    }

    Character(String name, int level, double health, String gameMode) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.gameMode = gameMode;
    }

    void setName(String name) {
        this.name = name;
    }

    void setLevel(int level) {
        this.level = level;
    }

    void setHealth(double health) {
        this.health = health;
    }

    void setGameMode(String mode) {
        this.gameMode = mode;
    }

    String getName() {
        return this.name;
    }

    int getLevel() {
        return this.level;
    }

    double getHealth() {
        return this.health;
    }

    String getGameMode() {
        return this.gameMode;
    }

    // ABSTRACT attack + toString
    abstract void attack();
    public abstract String toString();
}

// Subclass 1 - Warrior
class Warrior extends Character {
    double strength;
    String weapon;

    Warrior() {
        super();
        this.strength = 50.0;
        this.weapon = "Sword";
    }

    Warrior(String name, int level, double health, String gameMode, double strength, String weapon) {
        super(name, level, health, gameMode);
        this.strength = strength;
        this.weapon = weapon;
    }

    void setWarrior(String name, int level, double health, String gameMode, double strength, String weapon) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.gameMode = gameMode;
        this.strength = strength;
        this.weapon = weapon;
    }

    double getStrength() {
        return this.strength;
    }

    String getWeapon() {
        return this.weapon;
    }

    void attack() {
        System.out.println(name + " swings their " + weapon + " with strength " + strength + "!");
    }

    public String toString() {
        return "Character Type: Warrior" +
               "\nName: " + name +
               "\nLevel: " + level +
               "\nHealth: " + health +
               "\nGame Mode: " + gameMode +
               "\nWeapon: " + weapon +
               "\nStrength: " + strength;
    }
}

// Subclass 2 - Mage
class Mage extends Character {
    double mana;
    String spell;

    Mage() {
        super();
        this.mana = 120.0;
        this.spell = "Fireball";
    }

    Mage(String name, int level, double health, String gameMode, double mana, String spell) {
        super(name, level, health, gameMode);
        this.mana = mana;
        this.spell = spell;
    }

    void setMage(String name, int level, double health, String gameMode, double mana, String spell) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.gameMode = gameMode;
        this.mana = mana;
        this.spell = spell;
    }

    double getMana() {
        return this.mana;
    }

    String getSpell() {
        return this.spell;
    }

    void attack() {
        System.out.println(name + " casts " + spell + " using " + mana + " mana!");
    }

    public String toString() {
        return "Character Type: Mage" +
               "\nName: " + name +
               "\nLevel: " + level +
               "\nHealth: " + health +
               "\nGame Mode: " + gameMode +
               "\nSpell: " + spell +
               "\nMana: " + mana;
    }
}

class TestGame {
    public static void main(String[] args) {

        Character w1 = new Warrior("Arthas", 10, 250.0, "Battle Mode", 80.0, "Great Sword");
        Character m1 = new Mage("Merlin", 12, 180.0, "Magic Mode", 200.0, "Thunderbolt");

        System.out.println(w1);
        w1.attack();

        System.out.println("\n-------------------------------\n");

        System.out.println(m1);
        m1.attack();
    }
}
