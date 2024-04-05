import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleController {
    private TitleModel model;
    private TitleView view;
    

    private JobClassModel jCModel;
    private JobClassView jCView;

    private CharacterCreation characterCreation;

    public TitleController(TitleModel model, TitleView view, JobClassView jCView) {
        this.model = model;
        this.view = view;
        this.jCView = jCView;
        
        // Initialize the characterCreation object
        this.characterCreation = new CharacterCreation();

        initView();
    }

    public void initView() {
        view.getStartButton().addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                updateModelAndView("Starting Game...");
                
                // Call the Main method of characterCreation
                //characterCreation.Main();
                toggleFrame();
                
            }
        });

        view.getExitButton().addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                updateModelAndView("Exiting Game...");
                System.exit(0);
            }
        });
    }

    private void updateModelAndView(String message) {
        model.setMessage(message);
        view.setMessage(model.getMessage());
    }


    public void toggleFrame() {
        boolean currentVisibility = model.isFrameVisible();
        view.setFrameVisibility(currentVisibility);
        jCView.setFrameVisibility(!currentVisibility);
    }

}
