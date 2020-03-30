

public class MethodSinkronisasi extends Thread{
    public MethodSinkronisasi(String name) 
    {
        super(name); 
    }

    public static synchronized void tampil (String nama)
    {
        for(int i=1;i<6;i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //TODO: handle exception
                e.printStackTrace();
            }
            System.out.println("Thread : "+nama+" Posisi : "+i);
        }
    }

    public void run()
    {
        tampil(getName());
    }

    public static void main(String args[])
    {
        Thread l1 = new Thread(new MethodSinkronisasi("l1"));
        Thread l3 = new Thread(new MethodSinkronisasi("l3"));
        l1.start();
        l3.start();
    }
}

