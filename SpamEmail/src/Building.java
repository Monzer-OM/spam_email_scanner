public class Building implements CarbonFootprint{


    private double area;

    private double kWhMonthly;
    private double carbonIntensity;
    private String city;

    public Building(double area, double kWhMonthly, double carbonIntensity, String city){
        this.area = area;
        this.kWhMonthly = kWhMonthly;
        this.carbonIntensity = carbonIntensity; // (0.436 CO2/kWh)   according The U.S. Environmental Protection Agency (EPA) 2020
        this.city = city;
    }
    @Override
    public void simpleInfo(){
        System.out.println("the area of this house: "+ area + "m\nlocated in: "+ city+"\n");
    }

    @Override
    public double getCarbonFootprint() {
        return kWhMonthly * carbonIntensity * 12;
    }


}
