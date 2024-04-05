import javax.swing.*;
import java.awt.*;

public class LevelUpView {
    private JFrame lvlUpFrame;
    private JLabel optionLbl, runeCostLbl, runesLbl, healthLbl, enduranceLbl, dexterityLbl, strengthLbl, intelligenceLbl, faithLbl;
    private JButton healthBtn, enduranceBtn, dexterityBtn, strengthBtn, intelligenceBtn, faithBtn, backBtn;
    private GameController GameController;

    public LevelUpView(){
        this.lvlUpFrame = new JFrame("Level Up");

        this.lvlUpFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.lvlUpFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.lvlUpFrame.getContentPane().setBackground(Color.black);
        this.lvlUpFrame.setSize(400,400);

        this.optionLbl = new JLabel("Choose an Option");
        this.optionLbl.setPreferredSize(new Dimension(200,30));
        this.optionLbl.setForeground(Color.white);
        this.optionLbl.setHorizontalAlignment(JLabel.CENTER);

        this.runeCostLbl = new JLabel("Rune Cost: ");
        this.runeCostLbl.setPreferredSize(new Dimension(200,30));
        this.runeCostLbl.setForeground(Color.white);
        this.runeCostLbl.setHorizontalAlignment(JLabel.CENTER);

        this.runesLbl = new JLabel("Runes: ");
        this.runesLbl.setPreferredSize(new Dimension(200,30));
        this.runesLbl.setForeground(Color.white);
        this.runesLbl.setHorizontalAlignment(JLabel.CENTER);

        this.healthLbl = new JLabel("Health: ");
        this.healthLbl.setPreferredSize(new Dimension(200,30));
        this.healthLbl.setForeground(Color.white);
        this.healthLbl.setHorizontalAlignment(JLabel.CENTER);

        this.enduranceLbl = new JLabel("Endurance: ");
        this.enduranceLbl.setPreferredSize(new Dimension(200,30));
        this.enduranceLbl.setForeground(Color.white);
        this.enduranceLbl.setHorizontalAlignment(JLabel.CENTER);

        this.dexterityLbl = new JLabel("Dexterity: ");
        this.dexterityLbl.setPreferredSize(new Dimension(200,30));
        this.dexterityLbl.setForeground(Color.white);
        this.dexterityLbl.setHorizontalAlignment(JLabel.CENTER);

        this.strengthLbl = new JLabel("Strength: ");
        this.strengthLbl.setPreferredSize(new Dimension(200,30));
        this.strengthLbl.setForeground(Color.white);
        this.strengthLbl.setHorizontalAlignment(JLabel.CENTER);

        this.intelligenceLbl = new JLabel("Intelligence: ");
        this.intelligenceLbl.setPreferredSize(new Dimension(200,30));
        this.intelligenceLbl.setForeground(Color.white);
        this.intelligenceLbl.setHorizontalAlignment(JLabel.CENTER);

        this.faithLbl = new JLabel("Faith: ");
        this.faithLbl.setPreferredSize(new Dimension(200,30));
        this.faithLbl.setForeground(Color.white);
        this.faithLbl.setHorizontalAlignment(JLabel.CENTER);

        this.healthBtn = new JButton("Level Health");
        this.healthBtn.setPreferredSize(new Dimension(200,30));
        this.enduranceBtn = new JButton("Level Endurance");
        this.enduranceBtn.setPreferredSize(new Dimension(200,30));
        this.dexterityBtn = new JButton("Level Dexterity");
        this.dexterityBtn.setPreferredSize(new Dimension(200,30));
        this.strengthBtn = new JButton("Level Strength");
        this.strengthBtn.setPreferredSize(new Dimension(200,30));
        this.intelligenceBtn = new JButton("Level Intelligence");
        this.intelligenceBtn.setPreferredSize(new Dimension(200,30));
        this.faithBtn = new JButton("Level Faith");
        this.faithBtn.setPreferredSize(new Dimension(200,30));
        this.backBtn = new JButton("Back");
        this.backBtn.setPreferredSize(new Dimension(200,30));

        this.lvlUpFrame.add(optionLbl);
        this.lvlUpFrame.add(healthBtn);
        this.lvlUpFrame.add(enduranceBtn);
        this.lvlUpFrame.add(dexterityBtn);
        this.lvlUpFrame.add(strengthBtn);
        this.lvlUpFrame.add(intelligenceBtn);
        this.lvlUpFrame.add(faithBtn);
        this.lvlUpFrame.add(backBtn);

        this.lvlUpFrame.setVisible(true);
    }
    
    public JButton getHealthButton() {
        return healthBtn;
    }

    public JButton getEnduranceButton() {
        return enduranceBtn;
    }

    public JButton getDexterityButton() {
        return dexterityBtn;
    }

    public JButton getStrengthButton() {
        return strengthBtn;
    }

    public JButton getIntelligenceButton() {
        return intelligenceBtn;
    }

    public JButton getFaithButton() {
        return faithBtn;
    }

    public JButton getBackButton() {
        return backBtn;
    }

    public JLabel getRuneCostLabel() {
        return runeCostLbl;
    }

    public JLabel getRunesLabel() {
        return runesLbl;
    }

    public JLabel getHealthLabel() {
        return healthLbl;
    }

    public JLabel getEnduranceLabel() {
        return enduranceLbl;
    }

    public JLabel getDexterityLabel() {
        return dexterityLbl;
    }

    public JLabel getStrengthLabel() {
        return strengthLbl;
    }

    public JLabel getIntelligenceLabel() {
        return intelligenceLbl;
    }

    public JLabel getFaithLabel() {
        return faithLbl;
    }

    public int getRuneCostFormula(int playerLevel) {
        return (playerLevel * 100) / 2;
    }

    public void setFrameVisibility(boolean visible) {
        lvlUpFrame.setVisible(visible);
    }

    public void PassClass(GameController controller) {
        this.GameController = controller;
    }
}
