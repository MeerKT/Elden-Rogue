import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.Iterator;

public class JobClassController{
    private JobClassModel jCModel;
    private JobClassView jCView;

        public JobClassController(JobClassView jCView, JobClassModel jCModel){
            this.jCModel = jCModel;
            this.jCView = jCView;

            Iterator<JobClass> i = jCModel.getJobClasses().iterator();
            while(i.hasNext()){
                JobClass jc = i.next();
                ActionListener al = new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        jCView.setFeebackLabel("You Chose " +jc.getClass().getName());

                    }
                };
                jCView.setButtonMenuItem(jc.getJobClassName(), al);

            }

            jCView.composeMenuList();
        }

}