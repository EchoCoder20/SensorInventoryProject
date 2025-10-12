public class SmartWaterSensor extends WaterSensor{
    private Boolean leakNotification;
    private Boolean temperatureSensing;
    private Boolean automaticWaterShutoffCompatibility;

    public Boolean getLeakNotification() {
        return leakNotification;
    }

    public void setLeakNotification(Boolean leakNotification) {
        this.leakNotification = leakNotification;
    }

    public Boolean getTemperatureSensing() {
        return temperatureSensing;
    }

    public void setTemperatureSensing(Boolean temperatureSensing) {
        this.temperatureSensing = temperatureSensing;
    }

    public Boolean getAutomaticWaterShutoffCompatibility() {
        return automaticWaterShutoffCompatibility;
    }

    public void setAutomaticWaterShutoffCompatibility(Boolean automaticWaterShutoffCompatibility) {
        this.automaticWaterShutoffCompatibility = automaticWaterShutoffCompatibility;
    }
}
