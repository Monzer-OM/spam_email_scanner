public class Car implements CarbonFootprint{

    private double km_used;
    private double CO2PerKm = 2.3; // the average CO2 produces  for 1L of gasoline
    private double literPerKM; // gasoline in liter for each KM  take it from user (7 L/KM)
    String model;


    public Car(String model ,double km_used, double literPerKM){
        this.km_used = km_used;
        this.literPerKM = literPerKM;
        this.model = model;
    }

    @Override
    public void simpleInfo(){
        System.out.println("model: "+ model+"\nuses "+literPerKM+"L/km"+"\n");
    }
    @Override
    public double getCarbonFootprint() {
    return ((km_used / literPerKM ) * CO2PerKm);
    }
}
