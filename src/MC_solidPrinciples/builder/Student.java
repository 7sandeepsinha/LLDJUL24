package MC_solidPrinciples.builder;

public class Student {
    private int id;
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private int gradYear;
    private String phoneNumber;

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.psp = builder.psp;
        this.universityName = builder.universityName;
        this.gradYear = builder.gradYear;
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder builder(){ // use this method to get Builder object
        return new Builder();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public String getUniversityName() {
        return universityName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class Builder {
        // has exact same attributes as the main Student class
        private int id;
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private int gradYear;
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

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder psp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder universityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public void validate(Builder builder) throws Exception {
            if(builder.age < 20){
                throw new Exception("Invalid Age");
            }
            if(builder.gradYear > 2024){
                throw new Exception("Invalid Grad Year");
            }
            if(builder.name == null ||
                    builder.name.isBlank() ||
                    builder.name.isEmpty()){
                throw new Exception("Invalid Name");
            }
        }

        public Student build() throws Exception {
            validate(this);
            return new Student(this);
        }
    }
}
