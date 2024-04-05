import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameLobbyView {
    private JFrame lobbyFrame;
    private JLabel lobbyLbl, nameLbl, jobClassLbl, levelLbl, runeLbl;
    private JButton fastTravelBtn, lvlUpBtn, inventoryBtn, shopBtn, quitBtn;
    private GameController GameController;

    private CharacterCreateView CCView;

    public GameLobbyView(){
        this.lobbyFrame = new JFrame("Game Lobby");

        this.lobbyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.lobbyFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.lobbyFrame.getContentPane().setBackground(Color.black);
        this.lobbyFrame.setSize(400,400);

        this.lobbyLbl = new JLabel("Game Lobby");
        this.lobbyLbl.setPreferredSize(new Dimension(200,30));
        this.lobbyLbl.setFont(new Font("Times New Roman", Font.BOLD, 30));
        this.lobbyLbl.setForeground(Color.white);

        this.nameLbl = new JLabel(" ");
        this.nameLbl.setPreferredSize(new Dimension(200,30));
        this.nameLbl.setForeground(Color.white);

        this.jobClassLbl = new JLabel("Job Class: ");
        this.jobClassLbl.setPreferredSize(new Dimension(200,30));
        this.jobClassLbl.setForeground(Color.white);

        this.levelLbl = new JLabel("Level: ");
        this.levelLbl.setPreferredSize(new Dimension(200,30));
        this.levelLbl.setForeground(Color.white);

        this.runeLbl = new JLabel("Runes: ");
        this.runeLbl.setPreferredSize(new Dimension(200,30));
        this.runeLbl.setForeground(Color.white);

        this.fastTravelBtn = new JButton("Fast Travel");
        this.fastTravelBtn.setPreferredSize(new Dimension(200,30));
        this.lvlUpBtn = new JButton("Level Up");
        this.lvlUpBtn.setPreferredSize(new Dimension(200,30));
        this.inventoryBtn = new JButton("Inventory");
        this.inventoryBtn.setPreferredSize(new Dimension(200,30));
        this.shopBtn = new JButton("Shop");
        this.shopBtn.setPreferredSize(new Dimension(200,30));
        this.quitBtn = new JButton("Quit Game");
        this.quitBtn.setPreferredSize(new Dimension(200,30));

        this.lobbyFrame.add(lobbyLbl);
        this.lobbyFrame.add(fastTravelBtn);
        this.lobbyFrame.add(lvlUpBtn);
        this.lobbyFrame.add(inventoryBtn);
        this.lobbyFrame.add(shopBtn);
        this.lobbyFrame.add(quitBtn);


        

        this.lobbyFrame.setVisible(false);

       

        fastTravelBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        lvlUpBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        inventoryBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        shopBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        quitBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                GameController.toggleFrameGL_T();
            }
        });
    }


    public void setFrameVisibility(boolean visible) {
        lobbyFrame.setVisible(visible);
        }
    
    public void PassClass(GameController controller) {
            this.GameController = controller;
        }

    
}
