public  class ItemSelectedState implements VendingMachineState {
    
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected. Please insert coins.");
    }
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin inserted. Dispensing item...");
        machine.setState(machine.getDispensingState());
        machine.dispenseItem();
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insert coin first.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(machine.getOutOfOrderState());
    }
}