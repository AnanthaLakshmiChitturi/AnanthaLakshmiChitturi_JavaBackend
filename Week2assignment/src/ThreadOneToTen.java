public class ThreadOneToTen extends Thread{

    public void run() {

        for(int i=1; i<=10; i++) {
            System.out.println("OneTo10 : " + i);
        }
    }

    public static void main(String args[])
    {
        ThreadOneToTen mt=new ThreadOneToTen();
         mt.start();
    }

}




