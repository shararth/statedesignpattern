public class SoldState implements State {
 
    VendingMachine vendingMachine;
 
    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
       
	public void insertDollar() {
		System.out.println("Please wait, we're already giving you a Item");
	}
 
	public void ejectDollar() {
		System.out.println("Sorry, you already pressed the button");
	}
 
	public void pressButton() {
		System.out.println("Pressing Button twice doesn't get you another Item!");
	}
 
	public void dispense() {
		vendingMachine.ReleaseItem();
		if (vendingMachine.getCount() > 0) {
			vendingMachine.setState(vendingMachine.getNoDollarState());
		} else {
			System.out.println("Oops, out of Items!");
			vendingMachine.setState(vendingMachine.getSoldOutState());
		}
	}
	
	public void refill() { }
 
	public String toString() {
		return "dispensing an Item";
	}
}