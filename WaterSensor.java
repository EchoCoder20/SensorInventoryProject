public class WaterSensor extends Sensors {
    private Double accuracy;
    private Double responceTime;

    public Double getPowerNeeded() {
        return responceTime;
    }

    public void setPowerNeeded(Double powerNeeded) {
        this.responceTime = powerNeeded;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }
}
