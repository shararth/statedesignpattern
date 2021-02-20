public class VendingMachine {
 
	State soldOutState;
	State noDollarState;
	State hasDollarState;
	State soldState;
 
	State state;
	int count = 0;
 
	public VendingMachine(int NumberOfItems) {
		soldOutState = new SoldOutState(this);
		noDollarState = new NoDollarState(this);
		hasDollarState = new HasDollarState(this);
		soldState = new SoldState(this);

		this.count = NumberOfItems;
 		if (NumberOfItems > 0) {
			state = noDollarState;
		} else {
			state = soldOutState;
		}
	}
 
	public void insertDollar() {
		state.insertDollar();
	}
 
	public void ejectDollar() {
		state.ejectDollar();
	}
 
	public void PressButton() {
		state.pressButton();
		state.dispense();
	}
 
	void ReleaseItem() {
		System.out.println("The Item comes rolling out the slot...");
		if (count > 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("The Vending machine was just refilled; its new count is: " + this.count);
		state.refill();
	}

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoDollarState() {
        return noDollarState;
    }

    public State getHasDollarState() {
        return hasDollarState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nIndian Vending, Inc.");
		result.append("\nJava-enabled Standing Vending Model #202@");
		result.append("\nInventory: " + count + " Item");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}