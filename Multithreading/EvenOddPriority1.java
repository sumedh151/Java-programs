 class MyThread {

    public static void main(String[] args) {
        EvenNumber r = new EvenNumber();
        Thread t1 = new Thread(r);

        OddNumber r2 = new OddNumber();
        Thread t2 = new Thread(r2);

        t1.start();
		t2.start();
		t1.setPriority(Thread.MIN_PRIORITY);  
        t2.setPriority(Thread.MAX_PRIORITY);
    }
}

class EvenNumber implements Runnable{
    public void run()
	{
        for(int i=0;i<10;i+=2) {
                 System.out.println(i);
        }
    }
}

class OddNumber implements Runnable{
    public void run(){
        for(int i=1;i<=10;i+=2) {
           System.out.println(i);
        }
    }
}