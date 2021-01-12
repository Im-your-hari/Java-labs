class Display{
    public synchronized void print(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(100);

        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("]");
    }
    
}
class SyncExp extends Thread{
    private Display d;
    private String msg;

    public SyncExp(Display d,String msg){
        this.d=d;
        this.msg=msg;
    }
    public void run(){
        d.print(msg);
    }
}
class ThreadSync{
    public static void main(String[] args) {
        Display d = new Display();
        SyncExp t1 = new SyncExp(d,"Hello");
        SyncExp t2 = new SyncExp(d,"World");
        t1.start();
        t2.start();
    }
}