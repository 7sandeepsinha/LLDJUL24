package MC_solidPrinciples.prototypeAndRegistry;

public class IntelligentStudent extends Student{
    private int iq;

    @Override
    public Student clone() {
         IntelligentStudent copy = new IntelligentStudent();
         copy.setId(this.getId());
         copy.setName(this.getName());
         copy.setMarks(this.getMarks());
         copy.iq = this.iq;
         return copy;
    }
}
