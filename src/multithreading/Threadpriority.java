package multithreading;

class ThreadPriority extends Thread {
    public void run(){
        for (int i=0 ; i<5 ; i++){
            System.out.println(Thread.currentThread().getName() + ":"+ Thread.currentThread().getPriority() );
        }
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() +":" + Thread.currentThread().getPriority());
        ThreadPriority threadPriority = new ThreadPriority();
        threadPriority.setName("child-thread");
        threadPriority.setPriority(7);
        threadPriority.start();
    }
}
//op
//        main:5
//        child-thread:7
//        child-thread:7
//        child-thread:7
//        child-thread:7
//        child-thread:7
//op -end


//default priority is 5
//Max priority is  10
//Min priority is 1