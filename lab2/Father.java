public class Father extends Parent {
    protected Mother wife;
    public Father(Mother w){
        wife = w;
    }

    public Mother getWife(){
        return wife;
    }

    @Override
    public String getFirstName(){
        return "Mr."+firstName;
    }
}
