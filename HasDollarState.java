public class HasDollarState implements State {
	VendingMachine vendingMachine;
 
	public HasDollarState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
  
	public void insertDollar() {
		System.out.println("You can't insert another dollar");
	}
 
	public void ejectDollar() {
		System.out.println("Dollar returned");
		vendingMachine.setState(vendingMachine.getNoDollarState());
	}
 
	public void pressButton() {
		System.out.println("You turned...");
		vendingMachine.setState(vendingMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No Item dispensed");
    }
    
    public void refill() { }
 
	public String toString() {
		return "waiting for press of the button";
	}
}