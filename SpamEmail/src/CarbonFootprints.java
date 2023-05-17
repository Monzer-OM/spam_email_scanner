import java.util.ArrayList;


public class CarbonFootprints {

    public static void main(String[] args){
        ArrayList<CarbonFootprint> carbonFootprintList = new ArrayList<>();

        Car myCar = new Car("BMW",1000, 0.07);
        //System.out.println(myCar.getCarbonFootprint()+ " KG");
        carbonFootprintList.add(myCar);

        Building myBuilding = new Building(150, 500, 0.436, "NYC");
        carbonFootprintList.add(myBuilding);
        //System.out.println(myBuilding.getCarbonFootprint() + "Kg ");
        //myBuilding.simpleInfo();


        Bicycle myBike = new Bicycle(100, "china", 35);
        carbonFootprintList.add(myBike);
        //System.out.println(myBike.getCarbonFootprint() + "KG");



        for (int i=0; i < carbonFootprintList.size(); i++){

            CarbonFootprint item = carbonFootprintList.get(i);
            System.out.println(item.getClass().getSimpleName()+ ":");
            System.out.format("Annual  Carbon Footprint: %.2f ", item.getCarbonFootprint());
            System.out.println("\nSome information about it: ");
            item.simpleInfo();
        }





    }
}
