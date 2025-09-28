public class Parent extends Person{
    protected Child child;
    protected int money;


    public Parent(){
        
    }


    public Parent(int m){
        money = m;
    }

    public void setChild(Child childd){
        child = childd;
    }

    public Child getChild(){
        return child;
    }
}
