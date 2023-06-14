public class ThreadOneToTenRunnable implements Runnable
{
    public void run()
    {

        for(int i=1; i<=10; i++)
        {
            System.out.println("Print OneTo10 using Runnable Interface : " + i);
        }
    }

    public static void main(String args[])
    {
        ThreadOneToTenRunnable myt =new ThreadOneToTenRunnable();
        Thread t=new Thread(myt);
        t.start();
    }

}