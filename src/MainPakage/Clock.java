package MainPakage;

import java.util.Calendar;
import java.util.Formatter;

public class Clock extends Thread {
    boolean first = true;
    @Override
    public void run(){
        for(;;){
            Formatter ft = new Formatter();
            ft.format("Time: %tr", Calendar.getInstance());
            System.out.print(ft);
            first = false;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(!first){
                for(byte i=0; i< String.valueOf(ft).length(); i++)
                    System.out.print('\b');
            }
        }
    }
}
