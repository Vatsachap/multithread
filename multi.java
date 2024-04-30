public class multi {
public static void main(String[] args) {
    for(int i=0;i<7;i++){
        multi2 mything = new multi2(i);
        Thread myt = new Thread(mything);
        myt.start();

    }
    //
    //
    //
    
    
  
}
    
}