public class VegBurger extends Hamburger {

    public VegBurger() {
        super("VegBurger");
    }

    @Override
    public void prepara() {
        System.out.println("Preparazione VegBurger: pane integrale, burger vegetale, insalata, pomodoro");
    }
}
