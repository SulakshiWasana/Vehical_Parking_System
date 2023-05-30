package Model;

public class Parking {
    private String vehiNum;
    private String vehiType;
    private String parkSlot;
    private String parkTime;

    public Parking() {
    }

    public Parking(String vehiNum,String vehiType,String parkSlot,String parkTime) {
        this.setVehiNum(vehiNum);
        this.setVehiType(vehiType);
        this.setParkSlot(parkSlot);
        this.setParkTime(parkTime);
    }

    public String getVehiNum() {
        return vehiNum;
    }

    public void setVehiNum(String vehiNum) {
        vehiNum = vehiNum;
    }

    public String getVehiType() {
        return vehiType;
    }

    public void setVehiType(String vehiType) {
        vehiType = vehiType;
    }

    public String getParkSlot() {
        return parkSlot;
    }

    public void setParkSlot(String parkSlot) {
        parkSlot = parkSlot;
    }

    public String getParkTime() {
        return parkTime;
    }

    public void setParkTime(String parkTime) {
        parkTime = parkTime;
    }
}
