package org.factoryPattern;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicleType){
        if(vehicleType.equals("car")){
            return new Car();
        }else if(vehicleType.equalsIgnoreCase("bike")){
            return new Bike();
        }
        return null;
    }


}
