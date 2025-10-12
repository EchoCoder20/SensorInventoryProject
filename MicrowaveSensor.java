public class MicrowaveSensor extends MotionSensor {
    private Double operatingFrequency;
    private Double sensitivityAdjustment;
    private Boolean penetratesObstacles;

    public Double getOperatingFrequency() {
        return operatingFrequency;
    }

    public void setOperatingFrequency(Double operatingFrequency) {
        this.operatingFrequency = operatingFrequency;
    }

    public Double getSensitivityAdjustment() {
        return sensitivityAdjustment;
    }

    public void setSensitivityAdjustment(Double sensitivityAdjustment) {
        this.sensitivityAdjustment = sensitivityAdjustment;
    }

    public Boolean getPenetratesObstacles() {
        return penetratesObstacles;
    }

    public void setPenetratesObstacles(Boolean penetratesObstacles) {
        this.penetratesObstacles = penetratesObstacles;
    }
}
