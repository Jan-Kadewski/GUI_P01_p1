import java.util.concurrent.atomic.AtomicLong;

public class ParkingSpace {
    double width;
    double length;
    double usableArea;
    private static final AtomicLong idCounter = new AtomicLong();

    public ParkingSpace(double width,double length){
        this.width =width;
        this.length = length;
        this.usableArea = width *length;
    }
    public static String createID()
    {
        return String.valueOf(idCounter.getAndIncrement());
    }

    @Override
    public String toString() {
        return  createID() +" " +
                "width=" + width +
                ", length=" + length +
                ", usableArea=" + usableArea +
                '}';
    }
}
