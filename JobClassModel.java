import java.util.ArrayList;


public class JobClassModel{
    
    private ArrayList<JobClass> jobClasses = new ArrayList<JobClass>();  //List of all available Jobs for the character to choose from.

    public JobClassModel(){ //initialize jobClasses
        jobClasses.add(new Vagabond());
        jobClasses.add(new Samurai());
        jobClasses.add(new Warrior());
        jobClasses.add(new Hero());
        jobClasses.add(new Astrologer());
        jobClasses.add(new Prophet());
    }

    public ArrayList<JobClass> getJobClasses(){
        return jobClasses;
    }
}