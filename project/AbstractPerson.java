public abstract class AbstractPerson {
    protected int age;
    protected String name;

    public AbstractPerson(int z, String x){
        age = z;
        name = x;
    }

    public String getName(){
        return name;
    } 

    public int getAge(){
        return age;
    }
}