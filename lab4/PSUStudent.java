public abstract class PSUStudent {
    protected int age;
    protected double gpa;

    public PSUStudent(int age, double gpa){
        this.age = age;
        this.gpa = gpa;
    }


    public int getAge(){
        return age;
    }

    public void setAge(int z){
        age = z;
    }

    public abstract double revealGrade();
}
