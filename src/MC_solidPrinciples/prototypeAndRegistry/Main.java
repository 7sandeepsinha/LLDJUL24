package MC_solidPrinciples.prototypeAndRegistry;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("Sandeep");
        student.setMarks(100);

        Student copy = student.clone();

        Student newStudent = getStudent();
        Student copyNewStudent = newStudent.clone();
    }

    public static Student getStudent(){
        int n = (int)(Math.random() * 100);
        if(n % 2 ==0){
            return new Student();
        } else {
            return new IntelligentStudent();
        }
    }
}
