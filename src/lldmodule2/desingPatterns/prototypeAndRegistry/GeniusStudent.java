package lldmodule2.desingPatterns.prototypeAndRegistry;

public class GeniusStudent extends Student{
    private int iq;

    @Override
    public Student clone() {
        GeniusStudent student = new GeniusStudent();
        student.iq = this.iq;
        return student;
    }
}
