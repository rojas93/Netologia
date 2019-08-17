package L6.Hw3;

public class TruckType extends VehicleTypeByPurpose{

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
