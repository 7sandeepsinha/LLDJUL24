package lldmodule3.parkinglot.service.strategy.billCalculation;

import lldmodule3.parkinglot.model.constant.ParkingSpotType;
import lldmodule3.parkinglot.model.constant.VehicleType;

public interface BillCalculationStrategy {
    static final double TWO_WHEELER_RATE = 1;
    static final double FOUR_WHEELER_RATE = 2;
    static final double THREE_WHEELER_RATE = 1.5;
    static final double LUXURY_MULTIPLIER = 10;
    static final double EV_MULTIPLIER = 5;

    double generateBillAmount(int numberOfMinutes,
                              VehicleType vehicleType,
                              ParkingSpotType parkingSpotType);
}
