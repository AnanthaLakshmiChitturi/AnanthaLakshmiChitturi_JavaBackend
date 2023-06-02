

class PolyMain{
    void run()
    {
        System.out.println("running");
    }
}
class Splendor extends PolyMain
{
    void run()
    {
        System.out.println("running safely with 60km");
    }
    public static void main(String args[])
    {
        PolyMain b = new PolyMain();//upcasting
        b.run();
    }
}