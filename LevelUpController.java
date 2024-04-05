import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LevelUpController {
    private LevelUpModel model;
    private LevelUpView view;

    public LevelUpController(LevelUpModel model, LevelUpView view) {
        this.model = model;
        this.view = view;

        this.view.getHealthButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int newHealth = model.levelUpHealth();
                view.getHealthLabel().setText("Health: " + newHealth);
            }
        });

        this.view.getEnduranceButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int newEndurance = model.levelUpEndurance();
                view.getEnduranceLabel().setText("Endurance: " + newEndurance);
            }
        });

        this.view.getDexterityButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int newDexterity = model.levelUpDexterity();
                view.getDexterityLabel().setText("Dexterity: " + newDexterity);
            }
        });

        this.view.getStrengthButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int newStrength = model.levelUpStrength();
                view.getStrengthLabel().setText("Strength: " + newStrength);
            }
        });

        this.view.getIntelligenceButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int newIntelligence = model.levelUpIntelligence();
                view.getIntelligenceLabel().setText("Intelligence: " + newIntelligence);
            }
        });

        this.view.getFaithButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int newFaith = model.levelUpFaith();
                view.getFaithLabel().setText("Faith: " + newFaith);
            }
        });

        this.view.getBackButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Assuming you have a method to hide the level up view and return to the lobby
                view.hideLevelUpView();
            }
        });
    }
}

