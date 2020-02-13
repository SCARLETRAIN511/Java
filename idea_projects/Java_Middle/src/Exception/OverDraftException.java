package Exception;

public class OverDraftException extends Exception{
    private double deficit;
    public double getDeficit(){
        return this.deficit;
    }
    public OverDraftException(String msg,double deficit){
        super(msg);
        this.deficit=deficit;
    }
}
