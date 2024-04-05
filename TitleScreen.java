import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Font;


public class TitleScreen {
    private JFrame mainFrame;
    private JLabel feedbackLbl, titleLbl, gameTitle;
    private JButton startBtn, exitBtn;

    public TitleScreen(){
        //set up Frame
        this.mainFrame = new JFrame("Grp 158-Elden Rogue MCO2");

        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.mainFrame.getContentPane().setBackground(Color.black);
        this.mainFrame.setSize(250,400);

        this.gameTitle = new JLabel("ELDEN ROGUE");
        this.gameTitle.setFont(new Font("Times New Roman", Font.BOLD, 50));
        this.gameTitle.setForeground(Color.cyan);

        this.titleLbl = new JLabel("Choose an Option");
        this.titleLbl.setPreferredSize(new Dimension(200,30));
        this.titleLbl.setForeground(Color.white);
        
        this.feedbackLbl = new JLabel();
        this.feedbackLbl.setPreferredSize(new Dimension(220,30));
        this.feedbackLbl.setForeground(Color.white);

        this.startBtn = new JButton("Start Game");
        this.startBtn.setPreferredSize(new Dimension(220,30));
        this.exitBtn = new JButton("Exit Game");
        this.exitBtn.setPreferredSize(new Dimension(220,30));

        this.mainFrame.add(gameTitle);
        this.mainFrame.add(titleLbl);
		    this.mainFrame.add(startBtn);
		    this.mainFrame.add(exitBtn);
		    this.mainFrame.add(feedbackLbl);
    

		this.mainFrame.setVisible(true);

        //set up logic for buttons when pressed
        this.startBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              feedbackLbl.setText("Starting Game...");
            }
          });

          this.exitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              System.exit(0);
            }
          });

    }
    
}
