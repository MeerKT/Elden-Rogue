public class LevelUpModel {
    // Assuming initial values for player's stats
    private int health;
    private int endurance;
    private int dexterity;
    private int strength;
    private int intelligence;
    private int faith;

    public LevelUpModel(int health, int endurance, int dexterity, int strength, int intelligence, int faith){
        this.health = health;
        this.endurance = endurance;
        this.dexterity = dexterity;
        this.strength = strength;
        this.intelligence = intelligence;
        this.faith = faith;
    }

    public int levelUpHealth() {
        health += 10;
        return health;
    }

    public int levelUpEndurance() {
        endurance += 10;
        return endurance;
    }

    public int levelUpDexterity() {
        dexterity += 10;
        return dexterity;
    }

    public levelUpStrength() {
        strength += 10;
        return strength;
    }

    public levelUpIntelligence() {
        intelligence += 10;
        return intelligence;
    }

    public levelUpFaith() {
        faith += 10;
        return faith;
    }
}
