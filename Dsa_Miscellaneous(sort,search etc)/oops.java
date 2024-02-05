public class oops{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.tip=2;
        p1.name="octane";
        p1.price=25;
        System.out.println(p1.tip);
    }
}

class Pen{
     int tip;
     String name;
     int price;
    }