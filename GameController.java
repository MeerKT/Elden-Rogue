import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

public class GameController {
    
    private GameModel model;
    private TitleView Tview;
    private JobClassView jCView;
    private CharacterCreateView CCView;
    private InputNameView INView;
    private GameLobbyView GLView;

    

    public GameController(GameModel model, TitleView Tview, JobClassView jCView, CharacterCreateView CCView,  InputNameView INView, 
    GameLobbyView GLView){
        this.model = model;
        this.Tview = Tview;
        this.jCView = jCView;
        this.CCView = CCView;
        this.INView = INView;
        this.GLView = GLView;

        initView();
    }

    public void initView() {
        Tview.getStartButton().addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                updateModelAndView("Back Again?...");
                toggleFrameT_CC();
                
            }
        });

        Tview.getExitButton().addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                updateModelAndView("Exiting Game...");
                System.exit(0);
            }
        });
    }


    private void updateModelAndView(String message) {
        model.setMessage(message);
        Tview.setMessage(model.getMessage());
    }

    //Title Screen
    public void toggleFrameT_CC() { //TitleScreen->CharacterCreate
        boolean currentVisibility = model.isFrameVisible();
        Tview.setFrameVisibility(currentVisibility);
        CCView.setFrameVisibility(!currentVisibility);
    }

    public void toggleFrameCC_T() {//CharacterCreate->TitleScreen
        boolean currentVisibility = model.isFrameVisible();
        Tview.setFrameVisibility(!currentVisibility);
        CCView.setFrameVisibility(currentVisibility);

    }

    //Job Class

    public void toggleFrameCC_JC() {//CharacterCreate->JobClass
        boolean currentVisibility = model.isFrameVisible();
        CCView.setFrameVisibility(currentVisibility);
        jCView.setFrameVisibility(!currentVisibility);
        
    }

    public void toggleFrameJC_CC() {//JobClass->CharacterCreate
        boolean currentVisibility = model.isFrameVisible();
        CCView.setFrameVisibility(!currentVisibility);
        jCView.setFrameVisibility(currentVisibility);
    }

    //Input name
    public void toggleFrameIN_CC() {//InputName->CharacterCreate
        boolean currentVisibility = model.isFrameVisible();
        CCView.setFrameVisibility(!currentVisibility);
        INView.setFrameVisibility(currentVisibility);
    }

    public void toggleFrameCC_IN() {//CharacterCreate->InputName
        boolean currentVisibility = model.isFrameVisible();
        CCView.setFrameVisibility(currentVisibility);
        INView.setFrameVisibility(!currentVisibility);
    }

    //Game Lobby
    public void toggleFrameCC_GL(){//Character Create->Game Lobby
        boolean currentVisibility = model.isFrameVisible();
        CCView.setFrameVisibility(currentVisibility);
        GLView.setFrameVisibility(!currentVisibility);

    }

    public void toggleFrameGL_T(){//Game Lobby->Title Screen
        boolean currentVisibility = model.isFrameVisible();
        GLView.setFrameVisibility(currentVisibility);
        Tview.setFrameVisibility(!currentVisibility);

    }


   
}
