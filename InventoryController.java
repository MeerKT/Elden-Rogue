import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventoryController {
    private InventoryModel model;
    private InventoryView view;

    public InventoryController(InventoryModel model, InventoryView view) {
        this.model = model;
        this.view = view;
        this.view.getSelectButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Assuming you have a method to get the selected weapon from the view
                Weapon selectedWeapon = view.getSelectedWeapon();
                if (selectedWeapon != null && selectedWeapon.getDEX() >= 15) {
                    // If the selected weapon exists and user's DEX is >= 15, equip the weapon
                    // You may want to add logic to equip the weapon here
                    view.displayMessage("Weapon equipped successfully!");
                } else {
                    view.displayMessage("Unable to equip weapon. Required DEX >= 15.");
                }
            }
        });

        this.view.getBackButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Assuming you have a method to hide the inventory view and return to lobby
                view.hideInventoryView();
            }
        });
    }
}
