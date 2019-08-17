package L6.Hw3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());
        VehicleAd bwmAd = new VehicleAd("BWM", "50", new CarType(),
                new SedanType(), new PetrolType());



        adsService.setAdList(Arrays.asList(volvoAd, kamazAd, bwmAd));

        adsService.filterByVehicleTypeByPurpose(new PassengerType());

        adsService.filterByVehicleTypeByPurpose(new TruckType());

        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
    }
}

