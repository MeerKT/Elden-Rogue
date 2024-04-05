

public abstract class JobClass {
    private String jobClassName;

    public JobClass(String name){
        this.jobClassName = name;
    }

    public String getJobClassName(){
        return this.jobClassName;
    }

    public void setJobClassName(String name){
        this.jobClassName = name;
    }

    //methods inherited from other classes
    //public abstract...;

    public abstract int getLevel();
    public abstract int getHP();
    public abstract int getDEX();
    public abstract int getINT();
    public abstract int getEND();
    public abstract int getSTR();
    public abstract int getFTH();
    
}
