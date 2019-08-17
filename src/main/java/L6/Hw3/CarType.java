package L6.Hw3;

public class CarType extends VehicleTypeByPurpose {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
