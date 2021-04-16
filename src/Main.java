public class Main {
    public static void main(String[] args) {

        Warehouse wh = new Warehouse(10,50,50,130);
        Warehouse wh1 = new Warehouse(10,50,50,8,5,3);
        Warehouse wh2 = new Warehouse(10,50,50,150);
        Warehouse wh3 = new Warehouse(10,50,50,12,5,8);
        Warehouse wh4 = new Warehouse(10,50,50,4,5,6);
        Warehouse wh5 = new Warehouse(10,50,50,12);
        Warehouse wh6 = new Warehouse(10,50,50,99);
        System.out.println(wh);
        System.out.println(wh1);
        System.out.println(wh2);
        System.out.println(wh3);
        System.out.println(wh4);
        System.out.println(wh5);
        System.out.println(wh6);



        ParkingSpace ps = new ParkingSpace(1,2);
        ParkingSpace ps1 = new ParkingSpace(7.5,4);
        ParkingSpace ps2 = new ParkingSpace(3,8);
        ParkingSpace ps3 = new ParkingSpace(1,2);
        ParkingSpace ps4 = new ParkingSpace(87,2);
        System.out.println(ps);
        System.out.println(ps1);
        System.out.println(ps2);
        System.out.println(ps3);
        System.out.println(ps4);


        Person p1 = new Person("Jan","K",true);


    }
}
