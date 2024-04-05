

public class Main {
    
    public static void main(String[] args){
        GameModel model = new GameModel();
        TitleView titleView = new TitleView();
        TitleModel titleModel = new TitleModel();
        JobClassView jcview = new JobClassView();
        InputNameView INView = new InputNameView();
        GameLobbyView GLView = new GameLobbyView();
        CharacterCreateView CCView = new CharacterCreateView();
        
        GameController gameController = new GameController(model, titleView, jcview, CCView, INView, GLView);

        jcview.PassClass(gameController);
        CCView.PassClass(gameController);
        INView.PassClass(gameController);
        GLView.PassClass(gameController);
        

       


        
    }
}
