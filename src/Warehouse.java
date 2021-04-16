import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class Warehouse {
    double spaceForClientTiresAndCarsPart;
    double costOfRentSpace;
    double priceForRentSpaceAfterRepair;
    double width;
    double length;
    double height;
    double usableArea;
    Date dateLeftTheCar; // this date has to be less than 14 days;
    private static final AtomicLong idCounter = new AtomicLong();

    public Warehouse(double spaceForClientTiresAndCarsPart, double costOfRentSpace,double priceForRentSpaceAfterRepair,double width,double length,double height){
        this.spaceForClientTiresAndCarsPart = spaceForClientTiresAndCarsPart;
        this.costOfRentSpace = costOfRentSpace;
        this.priceForRentSpaceAfterRepair = priceForRentSpaceAfterRepair;
        this.width =width;
        this.length = length;
        this.height = height;
        this.usableArea = width*length*height;
    }

    public Warehouse(double spaceForClientTiresAndCarsPart, double costOfRentSpace,double priceForRentSpaceAfterRepair,double usableArea){
        this.spaceForClientTiresAndCarsPart = spaceForClientTiresAndCarsPart;
        this.costOfRentSpace = costOfRentSpace;
        this.priceForRentSpaceAfterRepair = priceForRentSpaceAfterRepair;
        this.usableArea = usableArea;
    }

    public static String createID()
    {
        return String.valueOf(idCounter.getAndIncrement());
    }

    public static void rentSpace(Date startRentDay,Date endRentDay){
        if(endRentDay.after(startRentDay));
        // nie znam mozliwych dni wynajmu
    }










    @Override
    public String toString() {
        return  "(" +createID() + ") " + "Warehouse{" +
                "spaceForClientTiresAndCarsPart=" + spaceForClientTiresAndCarsPart +
                ", costOfRentSpace=" + costOfRentSpace +
                ", dateLeftTheCar=" + dateLeftTheCar +
                ", priceForRentSpaceAfterRepair=" + priceForRentSpaceAfterRepair + " UsableArea:" +usableArea +
                '}';
    }


}
