public class RopeWaterSensor extends WaterSensor{
    private Float sensingCableLength;
    private Float coverageArea;
    private Boolean expandability;

    public Float getSensingCableLength() {
        return sensingCableLength;
    }

    public void setSensingCableLength(Float sensingCableLength) {
        this.sensingCableLength = sensingCableLength;
    }

    public Float getCoverageArea() {
        return coverageArea;
    }

    public void setCoverageArea(Float coverageArea) {
        this.coverageArea = coverageArea;
    }

    public Boolean getExpandability() {
        return expandability;
    }

    public void setExpandability(Boolean expandability) {
        this.expandability = expandability;
    }
}
