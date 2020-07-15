 class MyThread {

    public static void main(String[] args) {
        EvenNumber r = new EvenNumber();
        Thread t = new Thread(r);

        OddNumber r2 = new OddNumber();
        Thread t2 = new Thread(r2);

        t.start();
		t.setName("Thread Even");
        t2.start();
		t2.setName("Thread Odd");
    }
}

class EvenNumber implements Runnable{
    public void run()
	{
        for(int i=0;i<10;i+=2) {
                 System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

class OddNumber implements Runnable{
    public void run(){
        for(int i=1;i<=10;i+=2) {
           System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}