public class UndergradStudent extends PSUStudent{
    private int currentYear;
    public UndergradStudent(int age, double gpa) {
        super(age, gpa);
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0.");
        }
        currentYear = 1;
}

    @Override
    public double revealGrade(){
        if (currentYear>=4){
            return gpa;
        }
        else{
            return 0;
        }
    }

    public void setCurrentYear(int z){
        currentYear = z;
    }
}
