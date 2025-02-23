public class DispensingState implements VendingMachineState {
    
    public void selectItem(VendingMachine machine) {
        System.out.println("Currently dispensing. Please wait.");
    }
    public void insertCoin(VendingMachine machine) {
        System.out.println("Cannot insert coins while dispensing.");
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Item dispensed. Returning to idle state.");
        machine.setState(machine.getIdleState());
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(machine.getOutOfOrderState());
    }
}