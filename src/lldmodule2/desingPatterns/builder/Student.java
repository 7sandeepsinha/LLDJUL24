package lldmodule2.desingPatterns.builder;

import javax.lang.model.element.Name;

public class Student {
    private final int id;
    private final String name;
    private final String batchName;
    private final int age;
    private final int gradYear;
    private final double psp;
    private final String phoneNumber;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getAge() {
        return age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public double getPsp() {
        return psp;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Builder builder(){
        return new Builder();
    }

    private Student(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.batchName = builder.batchName;
        this.age = builder.age;
        this.gradYear = builder.gradYear;
        this.psp = builder.psp;
        this.phoneNumber = builder.phoneNumber;
    }

    static class Builder {
        private int id;
        private String name;
        private String batchName;
        private int age;
        private int gradYear;
        private double psp;
        private String phoneNumber;

        public Builder() {
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder batchName(String batchName) {
            this.batchName = batchName;
            return this;
        }


        public Builder age(int age) {
            this.age = age;
            return this;
        }


        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder psp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        private void validate(Builder builder){
            if(builder.age < 20){
                throw new InvalidAgeException("Age cant be less than 20");
            }
            if(builder.gradYear > 2024){
                throw new InvalidGradYearException("Grad year cant be more than current year");
            }
        }

        public Student build(){
            validate(this);
            return new Student(this);
        }
    }
}
