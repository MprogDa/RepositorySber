package unit4;

public class Command {

    private String name;
    private String Descr;

    public void setName(String str){
        name = str;
    }

    public void setDescr(String str){
        Descr = str;
    }

    public String getName(){
        return name;
    }

    public String getDescr(){
        return Descr;
    }

    public boolean commandPass() {
        return false;
    }
}
