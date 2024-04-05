import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;


public class CharacterCreation {
    private JFrame mainframe;
    private JPanel mainPanel;
    private JPanel NamePanel, JCPanel;
    private  JTextField playerName;
    private JButton confirmBtn, backBtn, inputNameBtn, selectjcBtn, SubmitBtn;

    ArrayList<Player> userName = new ArrayList<>();

    public CharacterCreation(){
        this.mainframe = new JFrame("Character Creation");
        this.mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainframe.setSize(400,300);

        this.mainPanel = new JPanel();
        JButton inputNameBtn = new JButton("Input Name");
        JButton  selectjcBtn = new JButton("Select Job Class");
        JButton confirmBtn = new JButton("Confirm");
        JButton backBtn = new JButton("Back");

        //Job Class Selection
        JButton vBtn = new JButton("Vagabond");
        JButton sBtn = new JButton("Samurai");
        JButton  wBtn = new JButton("Warrior");
        JButton hBtn = new JButton("Hero");
        JButton aBtn = new JButton("Astrologer");
        JButton pBtn = new JButton("Prophet");


        this.mainPanel.add(inputNameBtn);
        this.mainPanel.add(selectjcBtn);
        this.mainPanel.add(confirmBtn);
        this.mainPanel.add(backBtn);

        this.NamePanel  = new JPanel();
        this.playerName = new JTextField(25);
        SubmitBtn = new JButton("Submit");
        this.NamePanel.add(new JLabel("Please Input Your Name: "));
        this.NamePanel.add(playerName);
        this.NamePanel.add(SubmitBtn);
        JLabel userText = new JLabel(" ");

        inputNameBtn.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                mainframe.setContentPane(NamePanel);
                mainframe.validate();
             

            }
        });

        SubmitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                userName.add(new Player(playerName.getText().toString()) );

                userText.setText(userName.get(userName.size()-1).toString());


                mainPanel.add(userText);
                //mainframe.setContentPane(mainPanel);
                //mainframe.validate();
            }
        });

        JLabel jcSelectText = new JLabel("Pick a Character ");
        this.JCPanel  = new JPanel();
        this.JCPanel.add(jcSelectText);
        this.JCPanel.add(vBtn);
        this.JCPanel.add(sBtn);
        this.JCPanel.add(wBtn);
        this.JCPanel.add(hBtn);
        this.JCPanel.add(aBtn);
        this.JCPanel.add(pBtn);
        


        selectjcBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
                mainframe.setContentPane(JCPanel);
                mainframe.validate();

                vBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        JLabel vText = new JLabel("Vagabond ");
                        mainPanel.add(vText);
                        //mainframe.setContentPane(mainPanel);
                        //mainframe.validate();

                    }
                });

                sBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){
                        JLabel sText = new JLabel("Samurai");
                        mainPanel.add(sText);
                        //mainframe.setContentPane(mainPanel);
                        //mainframe.validate();

                    }
                });

                wBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){
                        JLabel wText = new JLabel("Warrior");
                        mainPanel.add(wText);
                        //mainframe.setContentPane(mainPanel);
                        //mainframe.validate();

                    }
                });

                hBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){
                        JLabel hText = new JLabel("Hero");
                        mainPanel.add(hText);
                        //mainframe.setContentPane(mainPanel);
                        //mainframe.validate();

                    }
                });

                aBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){
                        JLabel aText = new JLabel("Astrologer");
                        mainPanel.add(aText);
                        //mainframe.setContentPane(mainPanel);
                        //mainframe.validate();

                    }
                });

                pBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){
                        JLabel pText = new JLabel("Prophet");
                        mainPanel.add(pText);
                        //mainframe.setContentPane(mainPanel);
                        //mainframe.validate();

                    }
                });
            }
        });

        /*confirmBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                //add logic to go back Start Screen
            }
        });*/

        /*BackBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                //add logic to go back Start Screen
            }
        });*/



        this.mainframe.setContentPane(mainPanel);
        this.mainframe.setVisible(false);

    }

    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //new CharacterCreation();
            }
        });
    }
}
