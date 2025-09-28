public class Child extends Person {
    private Person guardian;
    private int age;
    private int height;
    private double weight;

    public Child(int a, int h, double w){
        age = a;
        height = h;
        weight = w;
    }

    public void setGuardian(Person guardian) {
        this.guardian = guardian;
    }

    public Person getGuardian(){
        return guardian;
    }
}
