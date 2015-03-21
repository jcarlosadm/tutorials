package gumballmachine;

public class GumballMachine {
    
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;
    
    private State state = this.soldOutState;
    private int count = 0;
    
    public GumballMachine(int numberGumballs) {
        this.soldOutState = new SoldOutState();
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);
        
        this.count = numberGumballs;
        
        if(count > 0){
            this.state = this.noQuarterState;
        }
    }
    
    public void insertQuarter(){
        
        this.state.insertQuarter();
    }
    
    public void ejectQuarter(){
        
        this.state.ejectQuarter();
    }
    
    public void turnCranck(){
        
        this.state.turnCrank();
        this.state.dispense();
    }
    
    State getSoldOutState() {
        return this.soldOutState;
    }

    State getNoQuarterState() {
        return this.noQuarterState;
    }

    State getHasQuarterState() {
        return this.hasQuarterState;
    }

    State getSoldState() {
        return this.soldState;
    }
    
    State getWinnerState(){
        return this.winnerState;
    }
    
    int getCount(){
        return this.count;
    }

    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot");
        if(this.count != 0){
            this.count -= 1;
        }
    }
    
    @Override
    public String toString(){
        return "state: " + this.state.getString() + ". count:" + this.count + ".";
    }
    
    void setState(State state){
        this.state = state;
    }
    
}
