package lldmodule2.desingPatterns.builder;

public class Main {
    public static void main(String[] args) {
        Student studentObj = Student.builder()
                                        .id(1)
                                        .psp(100)
                                        .phoneNumber("1234567890")
                                        .name("Vivek")
                                        .batchName("Batch232")
                                        .gradYear(2022)
                                        .age(27)
                                        .build();

        // use-cases -
        // Gauva library
        // Locale Builder
        // Database connection classes
        // Auth filter builders -> Spring Security
    }
}

//Problems

//1. Reability problem -> solved

//2. 2 extra objects -> StudentHelper, Student when validation fails
    // put a validation method in Student, call the constructor only if validation passes
// extra object is created, no matter validation fails or passes

// Builder object is extra being built, but we are not creating an extra object of the actual class
// If validation fails, marked for garbage collection

//3. StudentHelper is outside of Student -> Solved

/* Builder breakdown -
1. The actual class contains the following -
    a. all the attributes
    b. contains a static inner class which has the same attributes as the main/outer class  -> builder
        i. Builder class contains only setters, each setter method returns the same object which called
        the setter method, basically    "return this;"
        ii. Builder class contains a build method, which first validates the data, and then
        creates the object of the actual class, and returns the same.
2. Outer class or main class would contain a static method to get the builder object -> builder()
3. Outer class constructor should be private, so that all object construction goes through builder


4. Builders are easy to make into immutable, hence post creation validation,
 no need to validate again and again

Lombok -> @Builder
 */
