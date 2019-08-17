package L6.Hw3;

public class PassengerType extends VehicleTypeByPurpose {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }

}
