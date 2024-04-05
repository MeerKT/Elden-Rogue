import java.util.ArrayList;

public class GameModel {

    private ArrayList<JobClass> jobClasses = new ArrayList<JobClass>();
    private String message;
    private boolean FrameVisible;

    public GameModel(){
        FrameVisible = false;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public boolean isFrameVisible() {
        return FrameVisible;
    }

    public void setFrameVisible(boolean visible) {
        FrameVisible = visible;
    }

    public ArrayList<JobClass> JobClassAdd(){ 
        jobClasses.add(new Vagabond());
        jobClasses.add(new Samurai());
        jobClasses.add(new Warrior());
        jobClasses.add(new Hero());
        jobClasses.add(new Astrologer());
        jobClasses.add(new Prophet());

        return  jobClasses;
    }

    public ArrayList<JobClass> getJobClasses(){
        return jobClasses;
    }
}
