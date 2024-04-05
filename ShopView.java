import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ShopView {
    private JFrame shopFrame;
    private JLabel optionLbl, inputWeaponLbl, swordLbl, katanaLbl, whipLbl, greatSwordLbl, staveLbl, sealLbl;
    private JTextField weaponTf;
    private ImageIcon swordIcon, katanaIcon, whipIcon, greatSwordIcon, staveIcon, sealIcon;
    private JButton buyBtn;
    private GameController GameController;

    public ShopView() {
        this.shopFrame = new JFrame("Shop");

        this.shopFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.shopFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.shopFrame.getContentPane().setBackground(Color.black);
        this.shopFrame.setSize(500,500);

        this.optionLbl = new JLabel("Choose a Weapon");
        this.optionLbl.setPreferredSize(new Dimension(200,30));
        this.optionLbl.setForeground(Color.white);
        this.optionLbl.setHorizontalAlignment(JLabel.CENTER);

        this.swordLbl = new JLabel("Swords:");
        this.swordLbl.setIcon(swordIcon);
        this.swordLbl.setVerticalTextPosition(JLabel.TOP);
        this.swordLbl.setHorizontalTextPosition(JLabel.LEFT);
        this.swordLbl.setPreferredSize(new Dimension(200,30));
        this.swordLbl.setForeground(Color.white);
        this.swordLbl.setHorizontalAlignment(JLabel.LEFT);

        this.katanaLbl = new JLabel("Katanas:");
        this.katanaLbl.setIcon(katanaIcon);
        this.katanaLbl.setVerticalTextPosition(JLabel.TOP);
        this.katanaLbl.setHorizontalTextPosition(JLabel.LEFT);
        this.katanaLbl.setPreferredSize(new Dimension(200,30));
        this.katanaLbl.setForeground(Color.white);
        this.katanaLbl.setHorizontalAlignment(JLabel.LEFT);

        this.whipLbl = new JLabel("Whips:");
        this.whipLbl.setIcon(whipIcon);
        this.whipLbl.setVerticalTextPosition(JLabel.TOP);
        this.whipLbl.setHorizontalTextPosition(JLabel.LEFT);
        this.whipLbl.setPreferredSize(new Dimension(200,30));
        this.whipLbl.setForeground(Color.white);
        this.whipLbl.setHorizontalAlignment(JLabel.LEFT);

        this.greatSwordLbl = new JLabel("Great Swords:");
        this.greatSwordLbl.setIcon(greatSwordIcon);
        this.greatSwordLbl.setVerticalTextPosition(JLabel.TOP);
        this.greatSwordLbl.setHorizontalTextPosition(JLabel.LEFT);
        this.greatSwordLbl.setPreferredSize(new Dimension(200,30));
        this.greatSwordLbl.setForeground(Color.white);
        this.greatSwordLbl.setHorizontalAlignment(JLabel.LEFT);

        this.staveLbl = new JLabel("Staves:");
        this.staveLbl.setIcon(staveIcon);
        this.staveLbl.setVerticalTextPosition(JLabel.TOP);
        this.staveLbl.setHorizontalTextPosition(JLabel.LEFT);
        this.staveLbl.setPreferredSize(new Dimension(200,30));
        this.staveLbl.setForeground(Color.white);
        this.staveLbl.setHorizontalAlignment(JLabel.LEFT);

        this.sealLbl = new JLabel("Seals:");
        this.sealLbl.setIcon(sealIcon);
        this.sealLbl.setVerticalTextPosition(JLabel.TOP);
        this.sealLbl.setHorizontalTextPosition(JLabel.LEFT);
        this.sealLbl.setPreferredSize(new Dimension(200,30));
        this.sealLbl.setForeground(Color.white);
        this.sealLbl.setHorizontalAlignment(JLabel.LEFT);

        this.inputWeaponLbl = new JLabel("Weapon to purchase:");
        this.inputWeaponLbl.setPreferredSize(new Dimension(200,30));
        this.inputWeaponLbl.setForeground(Color.white);
        this.inputWeaponLbl.setHorizontalAlignment(JLabel.CENTER);
        this.weaponTf = new JTextField();
        this.weaponTf.setColumns(10);

        this.buyBtn = new JButton("Buy Weapon");
        this.buyBtn.setPreferredSize(new Dimension(200,30));
    }

    public JButton getBuyButton() {
        return buyBtn;
    }

    public String getWeaponName(Weapon name) {
        return weaponTf.getText();
    }

    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(shopFrame, message);
    }

    public void setFrameVisibility(boolean visible) {
        shopFrame.setVisible(visible);
    }

    public void PassClass(GameController controller) {
        this.GameController = controller;
    }
}
