public class GradStudent extends PSUStudent{
    protected boolean passThesis;

    public GradStudent(int age, double gpa) {
        super(age, gpa);
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0.");
        }
        passThesis = false;
}

    @Override
    public double revealGrade(){
        if (passThesis == true){
            return gpa;
        }
        else{
            return 0;
        }
    }

    public void setPassThesis(boolean z){
        passThesis = z;
    }
}
