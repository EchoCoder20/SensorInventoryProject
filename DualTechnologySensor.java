public class DualTechnologySensor extends MotionSensor {
    private String combinedTechnologies;
    private String falseAlarmImmunity;
    private String coveragePattern;

    public String getCombinedTechnologies() {
        return combinedTechnologies;
    }

    public void setCombinedTechnologies(String combinedTechnologies) {
        this.combinedTechnologies = combinedTechnologies;
    }

    public String getFalseAlarmImmunity() {
        return falseAlarmImmunity;
    }

    public void setFalseAlarmImmunity(String falseAlarmImmunity) {
        this.falseAlarmImmunity = falseAlarmImmunity;
    }

    public String getCoveragePattern() {
        return coveragePattern;
    }

    public void setCoveragePattern(String coveragePattern) {
        this.coveragePattern = coveragePattern;
    }
}
