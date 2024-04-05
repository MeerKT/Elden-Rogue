public class Weapon{

    private String type;
    private String name;
    private int runeCost;
    private int DEX;
    private int HP;
    private int END;
    private int STR;
    private int INT;
    private int FTH;

    public Weapon(String type, String name, int runeCost, int DEX, int HP, int END, int STR, int INT, int FTH) {
        this.type = type;
        this.name = name;
        this.runeCost = runeCost;
        this.DEX = DEX;
        this.HP = HP;
        this.END = END;
        this.STR = STR;
        this.INT = INT;
        this.FTH = FTH;
    }

    // Implementing abstract methods from Weapon class

    public String getType() {
        return type;
    }
    
    public String getName() {
        return name;
    }

    public int getRuneCost() {
        return runeCost;
    }

    public int getHP() {
        return HP;
    }

    public int getDEX() {
        return DEX;
    }

    public int getINT() {
        return INT;
    }

    public int getEND() {
        return END;
    }

    public int getSTR() {
        return STR;
    }

    public int getFTH() {
        return FTH;
    }
}
