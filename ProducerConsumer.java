public class ProducerConsumer {

    public static void main(String[] args) {
        MyArray buff = new MyArray(20);

        Producer producer1 = new Producer("Producer 1" , buff );
        Thread thread1 = new Thread(producer1) ;
        Producer producer2 = new Producer("Producer 2" , buff );
        Thread thread2 = new Thread(producer2) ;
        Producer producer3 = new Producer("Producer 3" , buff );
        Thread thread3 = new Thread(producer3) ;
        Producer producer4 = new Producer("Producer 4" , buff );
        Thread thread4 = new Thread(producer4) ;

        Consumer consumer1 = new Consumer("Consumer 1", buff);
        Thread thread5 = new Thread(consumer1);
        Consumer consumer2 = new Consumer("Consumer 2", buff);
        Thread thread6 = new Thread(consumer2);
        Consumer consumer3 = new Consumer("Consumer 3", buff);
        Thread thread7 = new Thread(consumer3);
        Consumer consumer4 = new Consumer("Consumer 4", buff);
        Thread thread8 = new Thread(consumer4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
    }
}

class MyArray {
    private char[] buff;
    private int size;

    public MyArray( int length) {
        buff = new char[length];
        this.size = 0;
    }

    public boolean isEmpty(){
        if(size==0) return true;
        else return false;
    }

    public boolean isfull() {
        if(size == 20) return true;
        else return false;
    }

    public void add(char ch){
        buff[size] = ch;
        size++;
    }

    public char remove(){
        char ch = buff[size-1];
        size--;
        return ch;
    }

    void waitUntilFree() {
        while(size == 20){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void waitUntilFilled() {
        while(size == 0){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer implements Runnable {
    String name;
    MyArray buff;

    public Producer(String name, MyArray buff) {
        this.name = name;
        this.buff = buff;
    }

    private synchronized void  produce() {
        int num = (int) Math.ceil(Math.random() * 26);
        char ch = (char)(num + 96);
        if(buff.isfull()){
            System.out.println("The buffer is full. " + this.name + " is waiting for consumer.");
            buff.waitUntilFree();
        }
        buff.add(ch);
        System.out.println(this.name + " produced: " + ch);


    }

    @Override
    public void run() {
        long t= System.currentTimeMillis();
        long end = t+30000;
        while(System.currentTimeMillis() < end) {
            produce();
            try {
                Thread.sleep( 50 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    String name;
    MyArray buff;

    public Consumer(String name, MyArray buff) {
        this.name = name;
        this.buff = buff;
    }

    private synchronized void  consume() {
        if(buff.isEmpty()){
            System.out.println("The buffer is empty. " + this.name + " is waiting for producer.");
            buff.waitUntilFilled();
        }

        System.out.println(this.name + " consumed: " + buff.remove());
    }

    @Override
    public void run() {
        long t= System.currentTimeMillis();
        long end = t+30000;
        while(System.currentTimeMillis() < end) {
            consume();
            try {
                Thread.sleep( 50 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
