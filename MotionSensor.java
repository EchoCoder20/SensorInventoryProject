public class MotionSensor extends Sensors {
    private Double detectionAngle;
    private String sensorType;

    public Double getDetectionAngle() {
        return detectionAngle;
    }

    public void setDetectionAngle(Double detectionAngle) {
        this.detectionAngle = detectionAngle;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }
}
