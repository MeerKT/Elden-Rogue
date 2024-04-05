import javax.swing.*;
import java.awt.*;

public class InventoryView {
    private JFrame inventoryFrame;
    private JLabel optionLbl;
    private JButton selectBtn, backBtn, equipBtn;
    private JComboBox<String> weaponComboBox; // Adding JComboBox for weapons
    private GameController GameController;

    public InventoryView() {
        this.inventoryFrame = new JFrame("Inventory");

        this.inventoryFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.inventoryFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.inventoryFrame.getContentPane().setBackground(Color.black);
        this.inventoryFrame.setSize(400,400);

        this.optionLbl = new JLabel("Choose an Option");
        this.optionLbl.setPreferredSize(new Dimension(200,30));
        this.optionLbl.setForeground(Color.white);
        this.optionLbl.setHorizontalAlignment(JLabel.CENTER);

        this.weaponComboBox = new JComboBox<>();
        this.weaponComboBox.setPreferredSize(new Dimension(200, 30));

        this.selectBtn = new JButton("Select Weapon");
        this.selectBtn.setPreferredSize(new Dimension(200,30));
        this.backBtn = new JButton("Back");
        this.backBtn.setPreferredSize(new Dimension(200,30));
        this.equipBtn = new JButton("Equip");
        this.equipBtn.setPreferredSize(new Dimension(200, 30));

        this.inventoryFrame.add(optionLbl);
        this.inventoryFrame.add(weaponComboBox);
        this.inventoryFrame.add(selectBtn);
        this.inventoryFrame.add(backBtn);
        this.inventoryFrame.add(equipBtn);

        this.inventoryFrame.setVisible(true);
    }

    // Method to populate the JComboBox with weapon names
    public void setWeaponList(String[] weaponNames) {
        this.weaponComboBox.setModel(new DefaultComboBoxModel<>(weaponNames));
    }

    // Getter for the selected weapon from JComboBox
    public String getSelectedWeapon() {
        return (String) weaponComboBox.getSelectedItem();
    }

    public JButton getSelectButton() {
        return selectBtn;
    }

    public JButton getBackButton() {
        return backBtn;
    }

    public JButton getEquipButton() {
        return equipBtn;
    }

    public void displayMessage(String string) {
        JOptionPane.showMessageDialog(null, message);
    }


    public void setFrameVisibility(boolean visible) {
        inventoryFrame.setVisible(visible);
    }

    public void PassClass(GameController controller) {
        this.GameController = controller;
    }
}
