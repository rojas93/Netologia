package L6.Hw3;

public class HybridType extends VehicleTypeByFuelTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}
