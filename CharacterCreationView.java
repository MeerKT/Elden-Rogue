import java.awt.*;
import java.util.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class CharacterCreationView {
    private JFrame mainFrame;

    private JLabel feedbackLbl, titleLbl;
    private ArrayList<JButton> menuList = new ArrayList<JButton>();

    public CharacterCreationView(){
        this.mainFrame = new JFrame("Character Creation");

        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.mainFrame.setSize(250, 400);

        this.titleLbl = new JLabel("Choose an Option");
        this.titleLbl.setPreferredSize(new Dimension(220,30));

        this.mainFrame.add(titleLbl);
        this.mainFrame.setVisible(true);

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
}
