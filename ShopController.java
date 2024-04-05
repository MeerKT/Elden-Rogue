import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShopController {
    private ShopModel model;
    private ShopView view;

    public ShopController(ShopModel model, ShopView view) {
        this.model = model;
        this.view = view;
        this.view.getBuyButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String weaponName = view.getWeaponName();
                Weapon weapon = model.findWeaponByName(weaponName);
                if (weapon != null && model.canAfford(weapon)) {
                    // If the weapon exists and the player can afford it, buy the weapon
                    model.buyWeapon(weapon);
                    // You may want to update the view here to reflect the purchase
                    view.displayMessage("Weapon purchased successfully!");
                } else {
                    view.displayMessage("Unable to purchase weapon.");
                }
            }
        });
    }
}
