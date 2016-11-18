package danil.gorchakov.com.structural.bridge;

public class StockExchange extends Program{
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stockexchange development in progress..");
        developer.writeCode();
    }
}
