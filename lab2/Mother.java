public class Mother extends Parent {
    private Father husband;

    public Mother(){
    }

    @Override
    public String getFirstName(){
        return "Ms."+firstName;
    }

}
