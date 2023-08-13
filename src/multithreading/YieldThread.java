package multithreading;

public class YieldThread extends  Thread{
    @Override
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + ":"+ Thread.currentThread().getPriority() );
            //Thread.yield();   // if we comment this line then chances of completing main thread is high
        }
    }
}

//Pause current execution of thread for giving the chance of remaining waiting thread of same priority

//op if line commented
//       yield-thread:5
//        main:5
//        yield-thread:5
//        main:5
//        yield-thread:5
//        main:5
//        yield-thread:5
//        main:5
//        yield-thread:5
//        main:5

//line not commented
//        main:5
//        main:5
//        main:5
//        main:5
//        main:5
//        yield-thread:5
//        yield-thread:5
//        yield-thread:5
//        yield-thread:5