package gumballmachine;

import java.util.Random;

class HasQuarterState implements State {

    private Random randomWinner = new Random(System.currentTimeMillis());
    private GumballMachine gumballMachine;
    
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = this.randomWinner.nextInt(10);
        if(winner == 0 && this.gumballMachine.getCount() > 1){
            this.gumballMachine.setState(this.gumballMachine.getWinnerState());
        }else{
            this.gumballMachine.setState(this.gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String getString() {
        return "has quarter";
    }

}
