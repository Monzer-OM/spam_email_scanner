public class Bicycle implements CarbonFootprint{

    private double km_used;
    private double carbonFootprintAverage = 0.0; //  0 beacuse bicycle doesn't burn any fossil fuels
    private String model;
    private int wight;

    public Bicycle(double km_used, String model, int wight){
        this.model = model;
        this.km_used = km_used;
        this.wight = wight;
    }
    public String getModel(){
        return model;
    }
    public int getWight(){
        return wight;
    }

    @Override
    public void simpleInfo(){
        System.out.println("model: "+ model+"\nwight: "+ wight+" KG\n");
    }

    @Override
    public double getCarbonFootprint() { // it will return 0
        return km_used * carbonFootprintAverage;
    }
}
