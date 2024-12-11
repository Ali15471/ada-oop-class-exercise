public abstract class Monkey extends Mammal{

    private String monkeyType;
    private float climbingHeight;

    public Monkey(String species, String habitat, boolean isNocturnal, int gestationPeriodInWeeks, float bodyTemperature, float furDensity, String monkeyType , float climbingHeight){
        super(species, habitat, isNocturnal, gestationPeriodInWeeks, furDensity, bodyTemperature);
        this.monkeyType = monkeyType;
        this.climbingHeight = climbingHeight;
    }

    public String getType(){
        return monkeyType;
    }

    public float getClimbingHeight(){
        return climbingHeight;
    }

    public void setClimbingHeight (float climbingHeight){
        this.climbingHeight = climbingHeight;
    }

    public String showInfo() {
        return "Monkey: {" + '\n' +
                "type='" + monkeyType + '\n' +
                ", climbing height=" + climbingHeight + '\n' +
                ", gestationPeriodInWeeks=" + getGestationPeriodInWeeks() + '\n' +
                ", bodyTemperature=" + getBodyTemperature() + '\n' +
                ", species='" + getSpecies() + '\n' +
                ", habitat='" + getHabitat() + '\n' +
                ", isNocturnal=" + isNocturnal() + '\n' +
                '}';
    }

}
