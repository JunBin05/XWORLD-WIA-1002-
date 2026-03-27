package W1.TUTO.Q4;
public abstract class Vehicle{
    private double maxSpeed;
    protected double currentSpeed;
    public Vehicle(double maxSpeed){
        this.maxSpeed=maxSpeed;
    }
    public abstract void accelerate();
    public double getCurrentSpeed(){
        return this.currentSpeed;
    }
    public double getMaxSpeed(){
        return this.maxSpeed;
    }
    public void pedalToTheMetal(){
        while (getCurrentSpeed()!=getMaxSpeed()){
            accelerate();
        }
    }
 }

 //cannot create instance of Vehicle because it is abstract class