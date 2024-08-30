package demo;

public class ElectricCar extends Car{

    private String motorName;

    public ElectricCar(int id, String name, String motorName) {
        super(id, name);
        this.motorName = motorName;
    }

    public ElectricCar(ElectricCar electricCar){
        this(electricCar.getId(), electricCar.getName(), electricCar.getMotorName());
    }

    public String getMotorName() {
        return motorName;
    }

    public void setMotorName(String motorName) {
        this.motorName = motorName;
    }
}
