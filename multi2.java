public class multi2 implements Runnable {
    int Threadnumber;
   
    public multi2(int threadnumber) {
       this.Threadnumber = threadnumber;
    }

    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i + "From threadnum" + Threadnumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
         
        }
    }
}
