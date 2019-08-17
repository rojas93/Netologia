package L6.Hw3;

import java.util.List;

public class AdsService {
    private List<VehicleAd> adList;

    public void setAdList(List<VehicleAd> adList) {
        this.adList = adList;
    }

    public void filterByVehicleTypeByPurpose(VehicleTypeByPurpose vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByPurpose().equals(vehicleType)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + vehicleType.getTypeName() + ", критерий- " +
                        vehicleType.getAttributeOfType() + ", так как имеет тип авто " +
                        ad.getVehicleTypeByPurpose().getTypeName());
            }
        }
    }

    public void filterByVehicleTypeByBodyTypes(VehicleTypeByBodyTypes vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByPurpose().equals(vehicleType)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + vehicleType.getTypeName() + ", критерий- " +
                        vehicleType.getAttributeOfType() + ", так как имеет тип авто " +
                        ad.getVehicleTypeByPurpose().getTypeName());
            }
        }
    }

    public void filterByVehicleTypeByFuelTypes(VehicleTypeByFuelTypes vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByPurpose().equals(vehicleType)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + vehicleType.getTypeName() + ", критерий- " +
                        vehicleType.getAttributeOfType() + ", так как имеет тип авто " +
                        ad.getVehicleTypeByPurpose().getTypeName());
            }
        }
    }
}
