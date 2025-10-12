public class SmokeSensor extends Sensors {
    private Double smokeDetectionRange;
    private String sensitivityLevel;

    public Double getSmokeDetectionRange() {
        return smokeDetectionRange;
    }

    public void setSmokeDetectionRange(Double smokeDetectionRange) {
        this.smokeDetectionRange = smokeDetectionRange;
    }

    public String getSensitivityLevel() {
        return sensitivityLevel;
    }

    public void setSensitivityLevel(String sensitivityLevel) {
        this.sensitivityLevel = sensitivityLevel;
    }
}
