public class PassiveInfraredSensor extends MotionSensor {
    private Double range;
    private Boolean petImmunity;



    public Double getRange() {
        return range;
    }

    public void setRange(Double range) {
        this.range = range;
    }

    public Boolean getPetImmunity() {
        return petImmunity;
    }

    public void setPetImmunity(Boolean petImmunity) {
        this.petImmunity = petImmunity;
    }
}
