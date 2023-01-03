class mythread16 extends Thread{
    public void run(){
        System.out.println("inside run");
    }
}
class threading16{
    public static void main(String[] args) {
        try{
            for(int i=0;i<=5;i++){
                Thread.sleep(2000);
                System.out.println("inside main"+i);
            }
        }
        catch(Exception e){
            System.out.println("there is an error");
        }
    }
}