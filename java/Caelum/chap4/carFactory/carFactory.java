
class Engine{
    private int power;
    private String type;
    
    public Engine(int power, String type){
        this.power = power;
        this.type = type;
    }
    
    public int getPower(){
        return this.power;
    }
    
    public void setPower(int power){
        this.power = power;
    }
    
    public String getType(){
        return this.type;
    }
    
    public void setType(String type){
        this.type = type;
    }
}

class Car{
    private String color;
    private String model;
    private double maxSpeed;
    private double speed = 0;
    
    private Engine engine;
    
    private boolean on = false;
    
    public Car(String model, String color, double maxSpeed, int enginePower, String engineType){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        
        this.engine = new Engine(enginePower, engineType);
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getModel(){
        return this.model;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public double getSpeed(){
        return this.speed;
    }
    
    public boolean setSpeed(double speed){
        if(speed <= this.maxSpeed && this.on){
            this.speed = speed;
            return true;
        }
        else
            return false;
    }
    
    public double getMaxSpeed(){
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    
    public void turnOn(){
        this.on = true;
    }
    
    public void turnOff(){
        this.on = false;
    }
    
    public void accelerate(double value){
        if(!this.setSpeed(this.speed+value) && this.on)
            this.speed = this.maxSpeed;
    }
    
    public int catchMarch(){
        if(this.speed < 0)
            return -1;
        else if(this.speed < 40)
            return 1;
        else if(this.speed < 80)
            return 2;
        return 3;
    }
}

class carFactory{
    public static void main(String[] args){
        Car myCar = new Car("Fusca", "verde", 80, 160, "1.6");
        
        myCar.turnOn();
        myCar.accelerate(20);
        
        System.out.println(myCar.getSpeed());
    }
}
