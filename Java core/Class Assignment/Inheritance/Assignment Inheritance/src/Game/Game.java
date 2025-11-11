package Game;

// Superclass
class Character {
    String name;
    int level;
    double health;
    String gameMode; // now instance-based

    // Default constructor
    Character() {
        this.name = "Unknown";
        this.level = 1;
        this.health = 100.0;
        this.gameMode = "Adventure";
    }

    // Parameterized constructor
    Character(String name, int level, double health, String gameMode) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.gameMode = gameMode;
    }

    // Setters
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

    // Getters
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

    // Display character details
    void display() {
        System.out.println("Character Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
        System.out.println("Game Mode: " + gameMode);
        System.out.println("--------------------------------------");
    }

    // Basic attack
    void attack() {
        System.out.println(name + " attacks");
    }
}

// Subclass 1 - Warrior
class Warrior extends Character {
    double strength;
    String weapon;

    // Default constructor
    Warrior() {
        super();
        this.strength = 50.0;
        this.weapon = "Sword";
    }

    // Parameterized constructor
    Warrior(String name, int level, double health, String gameMode, double strength, String weapon) {
        super(name, level, health, gameMode);
        this.strength = strength;
        this.weapon = weapon;
    }

    // Setters
    void setWarrior(String name, int level, double health, String gameMode, double strength, String weapon) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.gameMode = gameMode;
        this.strength = strength;
        this.weapon = weapon;
    }

    // Getters
    double getStrength() {
        return this.strength;
    }

    String getWeapon() {
        return this.weapon;
    }

    // Override attack method
    void attack() {
        System.out.println(name + " swings their " + weapon + " with strength " + strength + "!");
    }

    // Display warrior details
    void display() {
        System.out.println("Character Type: Warrior");
        super.display();
        System.out.println("Weapon: " + weapon);
        System.out.println("Strength: " + strength);
        System.out.println("--------------------------------------");
    }
}

// Subclass 2 - Mage
class Mage extends Character {
    double mana;
    String spell;

    // Default constructor
    Mage() {
        super();
        this.mana = 120.0;
        this.spell = "Fireball";
    }

    // Parameterized constructor
    Mage(String name, int level, double health, String gameMode, double mana, String spell) {
        super(name, level, health, gameMode);
        this.mana = mana;
        this.spell = spell;
    }

    // Setters
    void setMage(String name, int level, double health, String gameMode, double mana, String spell) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.gameMode = gameMode;
        this.mana = mana;
        this.spell = spell;
    }

    // Getters
    double getMana() {
        return this.mana;
    }

    String getSpell() {
        return this.spell;
    }

    // Override attack method
    void attack() {
        System.out.println(name + " casts " + spell + " using " + mana + " mana!");
    }

    // Display mage details
    void display() {
        System.out.println("Character Type: Mage");
       super.display();
        System.out.println("Spell: " + spell);
        System.out.println("Mana: " + mana);
        System.out.println("--------------------------------------");
    }
}
 class TestGame {
    public static void main(String[] args) {

        Warrior w1 = new Warrior("Arthas", 10, 250.0, "Battle Mode", 80.0, "Great Sword");

        Mage m1 = new Mage("Merlin", 12, 180.0, "Magic Mode", 200.0, "Thunderbolt");

        // Display both
        w1.display();
        w1.attack();

        m1.display();
        m1.attack();
    }
}

