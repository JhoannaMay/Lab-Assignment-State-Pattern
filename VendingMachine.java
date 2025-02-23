public class VendingMachine {
    
    private VendingMachineState idleState = new IdleState();
    private VendingMachineState itemSelectedState = new ItemSelectedState();
    private VendingMachineState dispensingState = new DispensingState();
    private VendingMachineState outOfOrderState = new OutOfOrderState();
    private VendingMachineState state = idleState;
    
    public void setState(VendingMachineState state) { this.state = state; }
    public VendingMachineState getIdleState() { return idleState; }
    public VendingMachineState getItemSelectedState() { return itemSelectedState; }
    public VendingMachineState getDispensingState() { return dispensingState; }
    public VendingMachineState getOutOfOrderState() { return outOfOrderState; }
    
    public void selectItem() { state.selectItem(this); }
    public void insertCoin() { state.insertCoin(this); }
    public void dispenseItem() { state.dispenseItem(this); }
    public void setOutOfOrder() { state.setOutOfOrder(this); 
    }
}