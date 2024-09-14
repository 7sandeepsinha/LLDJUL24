package MC_solidPrinciples.builder;

import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        Student student = Student.builder()
                                    .name("Raj")
                                    .age(20)
                                    .id(1)
                                    .psp(83.2)
                                    .gradYear(2023)
                                    .universityName("ABCD College")
                                    .build();

        Calendar calendar = new Calendar.Builder()
                                .setCalendarType("iso8601")
                                .setDate(2024, 12, 30)
                                .setTimeOfDay(12, 56, 00)
                                .build();

        // FIREBASE -> JPA Spring
    }
}
// Are we creating student object before validation -> NO
// Readability for object creation -> YES
// Immutable Object -> object post creation, no changes in the values are allowed
// Cant create empty Student object
// Since we dont have any setters the Student object becomes immutable

// Validation passes -> Builder object[eligible for GC immediately] and Student object
// Validation fails -> Builder object[eligible for GC immediately]


/*
    Inner classes -> Class inside a class

    Normal inner -> Class inside a class
    class A {
           class B {
           }
    }
    A a = new A();
    B b = a.new B();
    *** NEED FOR OBJECT OF OUTER CLASS

    Static Inner Class -> Static class inside a normal class ---> USE
    B b = A.new B();
    *** NO NEED FOR OBJECT OF OUTER CLASS

    Local Inner Class -> Class inside a method
 */