public class Cheeseburger extends Hamburger {

    public Cheeseburger() {
        super("Cheeseburger");
    }

    @Override
    public void prepara() {
        System.out.println("Preparazione Cheeseburger: pane, carne, formaggio, ketchup");
    }
}
