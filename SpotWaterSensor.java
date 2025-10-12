public class SpotWaterSensor extends WaterSensor{
    private String probeType;
    private Double cableLength;
    private Float alarmVolume;

    public String getProbeType() {
        return probeType;
    }

    public void setProbeType(String probeType) {
        this.probeType = probeType;
    }

    public Double getCableLength() {
        return cableLength;
    }

    public void setCableLength(Double cableLength) {
        this.cableLength = cableLength;
    }

    public Float getAlarmVolume() {
        return alarmVolume;
    }

    public void setAlarmVolume(Float alarmVolume) {
        this.alarmVolume = alarmVolume;
    }
}
