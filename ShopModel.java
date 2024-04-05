import java.util.ArrayList;
import java.util.Iterator;

public class ShopModel {
    private ArrayList<Weapon> weapons;
    private int runes;

    public ShopModel() {
        weapons = new ArrayList<>();
        // Populate weapons array
        // Assuming you have a method to initialize weapons
        initializeWeapons();
        runes = 0; // Initialize runes
    }

    public boolean canAfford(Weapon weapon) {
        return runes >= weapon.getRuneCost();
    }

    public void buyWeapon(Weapon weapon) {
        runes -= weapon.getRuneCost();
        // Handle adding the weapon to the player's inventory or other logic here
    }

    // Other methods for managing runes and weapons...

    public Weapon findWeaponByName(String name) {
        for (Weapon weapon : weapons) {
            if (weapon.getName().equalsIgnoreCase(name)) {
                return weapon;
            }
        }
        return null; // Return null if weapon not found
    }

    // Method to initialize weapons
    private void initializeWeapons() {
        // Populate weapons array with your weapons
        weapons.add(new Weapon("Sword", "Short Sword", 1000, 13, 0, 15, 15, 15, 15));
        weapons.add(new Weapon("Sword", "Rogier's Rapier", 2000, 18, 10, 25, 35, 35, 35));
        weapons.add(new Weapon("Sword", "Coded Sword", 4000, 21, 20, 35, 40, 40, 40));
        weapons.add(new Weapon("Sword", "Sword of Night and Flame", 8000, 25, 30, 45, 55, 55, 55));
        weapons.add(new Weapon("Katana", "Uchigatana", 1875, 15, 20, 35, 30, 0, 0));
        weapons.add(new Weapon("Katana", "Moonveil", 3750, 20, 30, 40, 45, 0, 0));
        weapons.add(new Weapon("Katana", "Rivers of Blood", 7500, 25, 40, 45, 60, 0, 0));
        weapons.add(new Weapon("Katana", "Hand of Malenia", 15000, 30, 50, 50, 75, 0, 0));
        weapons.add(new Weapon("Whip", "Whip", 1500, 20, 15, 60, 20, 0, 0));
        weapons.add(new Weapon("Whip", "Urumi", 3000, 25, 20, 70, 40, 10, 0));
        weapons.add(new Weapon("Whip", "Thorned Whip", 5000, 30, 30, 80, 50, 0, 40));
        weapons.add(new Weapon("Whip", "Hoslow's Petal Whip", 10000, 35, 35, 90, 55, 20, 20));
        weapons.add(new Weapon("Great Sword", "Claymore", 3000, 9, 15, 10, 20, 0, 0));
        weapons.add(new Weapon("Great Sword", "Starscourage Greatsword", 6000, 14, 20, 15, 40, 0, 20));
        weapons.add(new Weapon("Great Sword", "Inseparable Sword", 12000, 19, 25, 20, 70, 60, 60));
        weapons.add(new Weapon("Great Sword", "Maliketh's Black Blade", 24000, 24, 30, 25, 80, 40, 60));
        weapons.add(new Weapon("Stave", "Astrologer's Staff", 2000, 12, 5, 20, 5, 25, 15));
        weapons.add(new Weapon("Stave", "Albinauric Staff", 4000, 14, 10, 30, 10, 45, 35));
        weapons.add(new Weapon("Stave", "Staff of the Guilty", 8000, 16, 15, 40, 15, 65, 60));
        weapons.add(new Weapon("Stave", "Carian Regal Scepter", 16000, 18, 20, 50, 20, 85, 75));
        weapons.add(new Weapon("Seal", "Finger Seal", 2500, 10, 10, 45, 0, 15, 20));
        weapons.add(new Weapon("Seal", "Godslayer's Seal", 5000, 12, 15, 50, 0, 35, 40));
        weapons.add(new Weapon("Seal", "Golden Order Seal", 10000, 14, 20, 55, 0, 65, 65));
        weapons.add(new Weapon("Seal", "Dragon Communion Seal", 15000, 18, 25, 60, 0, 75, 80));
    }
}


