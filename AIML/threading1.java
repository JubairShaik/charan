class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Inside run");
        }
    }
}
public class threading1{
    public static void main(String[] args) {
        Thread1 obj=new Thread1();
        obj.start();
        for(int j=0;j<=5;j++){
            System.out.println("Inside main");
        }
    }
}