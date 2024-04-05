import javax.swing.*;
import java.awt.*;

public class TitleView {
    private JFrame mainFrame;
    private JLabel messageLabel, titleLbl, gameTitle;
    private JButton startBtn, exitBtn;

    public TitleView() {
        this.mainFrame = new JFrame("Grp 158-Elden Rogue MCO2");

        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.mainFrame.getContentPane().setBackground(Color.black);
        this.mainFrame.setSize(400,400); 

        this.gameTitle = new JLabel("ELDEN ROGUE");
        this.gameTitle.setFont(new Font("Times New Roman", Font.BOLD, 50));
        this.gameTitle.setForeground(Color.cyan);

        this.titleLbl = new JLabel("Choose an Option");
        this.titleLbl.setPreferredSize(new Dimension(220,30));
        this.titleLbl.setForeground(Color.white);
        
        this.messageLabel = new JLabel();
        this.messageLabel.setPreferredSize(new Dimension(220,30));
        this.messageLabel.setForeground(Color.white);

        this.startBtn = new JButton("Start Game");
        this.startBtn.setPreferredSize(new Dimension(220,30));
        this.exitBtn = new JButton("Exit Game");
        this.exitBtn.setPreferredSize(new Dimension(220,30));

        

        this.mainFrame.add(gameTitle);
        this.mainFrame.add(titleLbl);
		this.mainFrame.add(startBtn);
		this.mainFrame.add(exitBtn);
		this.mainFrame.add(messageLabel);
    

		this.mainFrame.setVisible(true);
    }

    public void setMessage(String message) {
        this.messageLabel.setText(message);
    }

    public JButton getStartButton() {
        return startBtn;
    }

    public JButton getExitButton() {
        return exitBtn;
    }

    public void setFrameVisibility(boolean visible) {
        mainFrame.setVisible(visible);
    }
}
