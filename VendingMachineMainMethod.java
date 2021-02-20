public class VendingMachineMainMethod {

	public static void main(String[] args) {
		VendingMachine VendingMachine = new VendingMachine(2);

		System.out.println(VendingMachine);

		VendingMachine.insertDollar();
		VendingMachine.PressButton();

		System.out.println(VendingMachine);

		VendingMachine.insertDollar();
		VendingMachine.PressButton();
		VendingMachine.insertDollar();
		VendingMachine.PressButton();
		
		VendingMachine.refill(10);
		VendingMachine.insertDollar();
		VendingMachine.PressButton();

		System.out.println(VendingMachine);
	}
}