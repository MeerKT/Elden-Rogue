import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JobClassView {

    private JFrame mainFrame;
    private GameController gameController;
    private GameModel gameModel;

    private JLabel feedbackLbl, titleLbl;
    private ArrayList<JButton> menuList = new ArrayList<>();

    private ArrayList<JobClass> jobClasses = new ArrayList<>();

    public JobClassView() {
        this.mainFrame = new JFrame("Character Creation");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.mainFrame.getContentPane().setBackground(Color.black);
        this.mainFrame.setSize(400, 400);

        this.titleLbl = new JLabel("Select a Job Class");
        this.titleLbl.setForeground(Color.white);
        this.titleLbl.setPreferredSize(new Dimension(220, 30));

        this.mainFrame.add(titleLbl);
        this.mainFrame.setVisible(false);

        feedbackLbl = new JLabel();

        // Initialize jobClasses from model
        jobClasses.add(new Vagabond());
        jobClasses.add(new Samurai());
        jobClasses.add(new Warrior());
        jobClasses.add(new Hero());
        jobClasses.add(new Astrologer());
        jobClasses.add(new Prophet());


        // Create menu items and listeners from controller logic
        Iterator<JobClass> i = jobClasses.iterator();
        while (i.hasNext()) {
            JobClass jc = i.next();
            ActionListener al = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    feedbackLbl.setText("You Chose " + jc.getClass().getName());
                    gameController.toggleFrameJC_CC();
                }
            };
            setButtonMenuItem(jc.getJobClassName(), al);
        }

        composeMenuList();
    }


    public void setButtonMenuItem(String btnLbl, ActionListener actionListener){
        JButton menuItem = new JButton(btnLbl);
        menuItem.addActionListener(actionListener);
            menuItem.setPreferredSize(new Dimension(220, 30));
            menuList.add(menuItem);
    }

    public void composeMenuList(){
        Iterator<JButton> i = menuList.iterator();

        while(i.hasNext()){
            this.mainFrame.add(i.next());
        }

        this.mainFrame.add(feedbackLbl);
    }

    public void setFeebackLabel(String s){
        feedbackLbl.setText(s);
    }

    public void setFrameVisibility(boolean visible) {
        this.mainFrame.setVisible(visible);
    }

    public void PassClass(GameController controller) {
        this.gameController = controller;
    }

}
