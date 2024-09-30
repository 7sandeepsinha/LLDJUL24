package lldmodule3.parkinglot.service.strategy.billCalculation;

import lldmodule3.parkinglot.model.constant.ParkingSpotType;
import lldmodule3.parkinglot.model.constant.VehicleType;

public class SimpleBillCalculationStrategy implements BillCalculationStrategy{



    @Override
    public double generateBillAmount(int numberOfMinutes, VehicleType vehicleType, ParkingSpotType parkingSpotType) {
        return 0;
    }
}
