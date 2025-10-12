public class PhotoelectricSmokeSensor extends SmokeSensor {
    private String detectionPrinciple;
    private String nuisanceAlarmReduction;
    private String batteryType;

    public String getDetectionPrinciple() {
        return detectionPrinciple;
    }

    public void setDetectionPrinciple(String detectionPrinciple) {
        this.detectionPrinciple = detectionPrinciple;
    }

    public String getNuisanceAlarmReduction() {
        return nuisanceAlarmReduction;
    }

    public void setNuisanceAlarmReduction(String nuisanceAlarmReduction) {
        this.nuisanceAlarmReduction = nuisanceAlarmReduction;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }
}
