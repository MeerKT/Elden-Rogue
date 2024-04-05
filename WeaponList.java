public class WeaponList {
    public static void main(String[] args) {


        Weapon weapon1 = new Weapon("Sword", "Short Sword", 1000, 13, 0, 15, 15, 15, 15);
        Weapon weapon2 = new Weapon("Sword", "Rogier's Rapier", 2000, 18, 10, 25, 35, 35, 35);
        Weapon weapon3 = new Weapon("Sword", "Coded Sword", 4000, 21, 20, 35, 40, 40, 40);
        Weapon weapon4 = new Weapon("Sword", "Sword of Night and Flame", 8000, 25, 30, 45, 55, 55, 55);
        
        Weapon weapon5 = new Weapon("Katana", "Uchigatana", 1875, 15, 20, 35, 30, 0, 0);
        Weapon weapon6 = new Weapon("Katana", "Moonveil", 3750, 20, 30, 40, 45, 0, 0);
        Weapon weapon7 = new Weapon("Katana", "Rivers of Blood", 7500, 25, 40, 45, 60, 0, 0);
        Weapon weapon8 = new Weapon("Katana", "Hand of Malenia", 15000, 30, 50, 50, 75, 0, 0);
        
        Weapon weapon9 = new Weapon("Whip", "Whip", 1500, 20, 15, 60, 20, 0, 0);
        Weapon weapon10 = new Weapon("Whip", "Urumi", 3000, 25, 20, 70, 40, 10, 0);
        Weapon weapon11 = new Weapon("Whip", "Thorned Whip", 5000, 30, 30, 80, 50, 0, 40);
        Weapon weapon12 = new Weapon("Whip", "Hoslow's Petal Whip", 10000, 35, 35, 90, 55, 20, 20);

        Weapon weapon13 = new Weapon("Great Sword", "Claymore", 3000, 9, 15, 10, 20, 0, 0);
        Weapon weapon14 = new Weapon("Great Sword", "Starscourage Greatsword", 6000, 14, 20, 15, 40, 0, 20);
        Weapon weapon15 = new Weapon("Great Sword", "Inseparable Sword", 12000, 19, 25, 20, 70, 60, 60);
        Weapon weapon16 = new Weapon("Great Sword", "Maliketh's Black Blade", 24000, 24, 30, 25, 80, 40, 60);

        Weapon weapon17 = new Weapon("Stave", "Astrologer's Staff", 2000, 12, 5, 20, 5, 25, 15);
        Weapon weapon18 = new Weapon("Stave", "Albinauric Staff", 4000, 14, 10, 30, 10, 45, 35);
        Weapon weapon19 = new Weapon("Stave", "Staff of the Guilty", 8000, 16, 15, 40, 15, 65, 60);
        Weapon weapon20 = new Weapon("Stave", "Carian Regal Scepter", 16000, 18, 20, 50, 20, 85, 75);

        Weapon weapon21 = new Weapon("Seal", "Finger Seal", 2500, 10, 10, 45, 0, 15, 20);
        Weapon weapon22 = new Weapon("Seal", "Godslayer's Seal", 5000, 12, 15, 50, 0, 35, 40);
        Weapon weapon23 = new Weapon("Seal", "Golden Order Seal", 10000, 14, 20, 55, 0, 65, 65);
        Weapon weapon24 = new Weapon("Seal", "Dragon Communion Seal", 15000, 18, 25, 60, 0, 75, 80);
        
        Weapon[] weapons = {weapon1, weapon2, weapon3, weapon4,
                            weapon5, weapon6, weapon7, weapon8,
                            weapon9, weapon10, weapon11, weapon12,
                            weapon13, weapon14, weapon15, weapon16,
                            weapon17, weapon18, weapon19, weapon20,
                            weapon21, weapon22, weapon23, weapon24};
        
        for (Weapon weapon : weapons) {
            System.out.println("Weapon Type: " + weapon.getType());
            System.out.println("Name: " + weapon.getName());
            System.out.println("Rune Cost: " + weapon.getRuneCost());
            System.out.println("DEX: " + weapon.getDEX());
            System.out.println("HP: " + weapon.getHP());
            System.out.println("END: " + weapon.getEND());
            System.out.println("STR: " + weapon.getSTR());
            System.out.println("INT: " + weapon.getINT());
            System.out.println("FTH: " + weapon.getFTH());
            System.out.println();
        }
    }
}