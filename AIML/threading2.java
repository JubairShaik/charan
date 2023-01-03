class mythread2 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Inside run");
        }
    }
}
class threading2{
    public static void main(String[] args) {
        mythread2 obj1=new mythread2();
        Thread obj1=new Thread();
        obj1.start();
        for(int j=0;j<=5;j++){
            System.out.println("Inside main");
        }
    }
}