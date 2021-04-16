import java.util.Date;

public class Warehouse {
    double spaceForClientTiresAndCarsPart;
    double costOfRentSpace;
    Date dateLeftTheCar;
    double priceForRentSpaceAfterRepair;
    public Warehouse(double spaceForClientTiresAndCarsPart, double costOfRentSpace,double priceForRentSpaceAfterRepair){
        this.spaceForClientTiresAndCarsPart = spaceForClientTiresAndCarsPart;
        this.costOfRentSpace = costOfRentSpace;
        this.priceForRentSpaceAfterRepair = priceForRentSpaceAfterRepair;

    }
}
