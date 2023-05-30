package View.tm;

public class ParkingTM {
    private String VehicleNumber;
    private String VehicleType;
    private String ParkingSlot;
    private String ParkingTime;


    public ParkingTM() {
    }

    public ParkingTM(String vehicleNumber, String vehicleType, String parkingSlot, String parkingTime) {
        this.setVehicleNumber(vehicleNumber);
        this.setVehicleType(vehicleType);
        this.setParkingSlot(parkingSlot);
        this.setParkingTime(parkingTime);
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getParkingSlot() {
        return ParkingSlot;
    }

    public void setParkingSlot(String parkingSlot) {
        ParkingSlot = parkingSlot;
    }

    public String getParkingTime() {
        return ParkingTime;
    }

    public void setParkingTime(String parkingTime) {
        ParkingTime = parkingTime;
    }
}
