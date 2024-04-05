import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InputNameView {

    private JButton submitBtn;
    ArrayList<Player> userName = new ArrayList<>();
    private JFrame frame;
    private JLabel feedbackLbl, titleLbl;
    private JTextField playerName;
    private GameController gameController;

    public InputNameView() {
        frame = new JFrame("Character Creation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().setBackground(Color.black);
        frame.setSize(400,400); 

        titleLbl = new JLabel("Input Your Name");
        titleLbl.setForeground(Color.white);
        titleLbl.setPreferredSize(new Dimension(220, 30));
        frame.add(titleLbl);

        playerName = new JTextField(25);
        frame.add(playerName);

        submitBtn = new JButton("Submit");
        frame.add(submitBtn);

        feedbackLbl = new JLabel();
        frame.add(feedbackLbl);

        JLabel userText = new JLabel(" ");

        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userName.add(new Player(playerName.getText()));
                userText.setText(userName.get(userName.size() - 1).toString());
                gameController.toggleFrameIN_CC();
                frame.add(userText); // This line might cause issues, we'll address it later
            }
        });

        frame.setVisible(false);
    }

    public void setFrameVisibility(boolean visible) {
        frame.setVisible(visible);
    }

    public void PassClass(GameController controller) {
        this.gameController = controller;
    }
}
