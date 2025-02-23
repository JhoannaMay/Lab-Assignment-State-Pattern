public class IdleState implements VendingMachineState {
    
    public void selectItem(VendingMachine machine) {
        System.out.println("Item selected. Please insert coins.");
        machine.setState(machine.getItemSelectedState());
    }
    public void insertCoin(VendingMachine machine) {
        System.out.println("Cannot insert coins without selecting an item first.");
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("No item selected to dispense.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(machine.getOutOfOrderState());
    }
}