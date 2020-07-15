 class MyThread {

    public static void main(String[] args) {
        EvenNumber r = new EvenNumber();
        Thread t = new Thread(r);

        OddNumber r2 = new OddNumber();
        Thread t2 = new Thread(r2);

        t.start();
        t2.start();
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