public class NoDollarState implements State {
    VendingMachine vendingMachine;
 
    public NoDollarState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
 
	public void insertDollar() {
		System.out.println("You inserted a dollar");
		vendingMachine.setState(vendingMachine.getHasDollarState());
	}
 
	public void ejectDollar() {
		System.out.println("You haven't inserted a dollar");
	}
 
	public void pressButton() {
		System.out.println("You turned, but there's no dollar");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "waiting for dollar";
	}
}