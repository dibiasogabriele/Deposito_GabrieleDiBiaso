public class DoubleBacon extends Hamburger {

    public DoubleBacon() {
        super("DoubleBacon");
    }

    @Override
    public void prepara() {
        System.out.println("Preparazione DoubleBacon: pane, doppia carne, bacon, cheddar, maionese");
    }
}
