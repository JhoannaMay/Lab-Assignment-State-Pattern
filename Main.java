public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.selectItem();  // Transition to ItemSelectedState
        machine.insertCoin();  // Transition to DispensingState -> then back to IdleState
        machine.setOutOfOrder();  // Transition to OutOfOrderState
        machine.insertCoin();  // No operation allowed
    }
}