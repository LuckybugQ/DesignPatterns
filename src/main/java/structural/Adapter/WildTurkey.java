package structural.Adapter;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("gobble!");
    }
}