package lldmodule1.advancedJavaTopics;

public class AnimalJump<A> {
    private A animalJumpAttribute; //

    public void jump(){
        System.out.println("Animal is jumping : " + animalJumpAttribute);
    }

    public A getAnimalJumpAttribute() {
        return animalJumpAttribute;
    }

    public void setAnimalJumpAttribute(A animalJumpAttribute) {
        this.animalJumpAttribute = animalJumpAttribute;
    }
}
