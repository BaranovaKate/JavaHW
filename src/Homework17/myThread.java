package Homework17;

class myThread extends Thread{
    public myThread(String name){
        super(name);
    }

    public void run(){
        System.out.println("Thread" + getName() + "is running");
    }
}