import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.Iterator;

/*
public class CharacterCreationView{
    
    private CharacterCreationModel cCModel;
    private CharacterCreationView cCView;

        public CharacterCreationController(CharacterCreationView cCView, CharacterCreationModel cCModel){
            this.cCModel = cCModel;
            this.cCView = cCView;

            Iterator<CharacterCreate > i = cCModel.getJobClasses().iterator();
            while(i.hasNext()){
                CharacterCreate cC = i.next();
                ActionListener al = new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        cCView.setFeebackLabel("You Chose " +cC.getClass().getName());

                    }
                };
                cCView.setButtonMenuItem(cC.getJobClassName(), al);

            }

            cCView.composeMenuList();
        }

}
*/