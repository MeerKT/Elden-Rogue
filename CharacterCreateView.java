import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;





public class CharacterCreateView{
    private GameController GameController;
    private JFrame frame;
    private JLabel greetingTxt;
    private  JTextField playerName;
    private JButton confirmBtn, backBtn, inputNameBtn, selectjcBtn, SubmitBtn;

     private ArrayList<JobClass> jobClasses = new ArrayList<>();
     private JLabel feedbackLbl;

    ArrayList<Player> userName = new ArrayList<>();
    
    private JLabel JobClassLbl;


public CharacterCreateView(){
    greetingTxt = new JLabel("Character Creation");
    greetingTxt.setPreferredSize(new Dimension(300,50));
    greetingTxt.setFont(new Font("Times New Roman", Font.BOLD, 30));
    greetingTxt.setForeground(Color.WHITE);

        frame = new JFrame();
        frame.setVisible(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        greetingTxt.setPreferredSize(new Dimension(220, 30));
        greetingTxt.setForeground(Color.white);
        frame.add(this.greetingTxt);
        frame.setSize(400,400); 
        frame.getContentPane().setBackground(Color.black);

        JButton inputNameBtn = new JButton("Input Name");
        JButton  selectjcBtn = new JButton("Select Job Class");
        JButton confirmBtn = new JButton("Confirm");
        JButton backBtn = new JButton("Back");

        inputNameBtn.setPreferredSize(new Dimension(200,30));
        selectjcBtn.setPreferredSize(new Dimension(200,30));
        confirmBtn.setPreferredSize(new Dimension(200,30));
        backBtn.setPreferredSize(new Dimension(200,30));


        frame.add(inputNameBtn);
        frame.add(selectjcBtn);
        frame.add(confirmBtn);
        frame.add(backBtn);

       

        inputNameBtn.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                
                GameController.toggleFrameCC_IN();

            }
        });

        


        selectjcBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                GameController.toggleFrameCC_JC();
            }

        });

        confirmBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                //add game lobby (condition)
                GameController.toggleFrameCC_GL();

            }
        });

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
               GameController.toggleFrameCC_T();
            }
        });

        
}



public void setFrameVisibility(boolean visible) {
    frame.setVisible(visible);
    }

public void PassClass(GameController controller) {
        this.GameController = controller;
    }

    



}

