package Windows;

import java.io.IOException;

public class KillProcssChromedriver {

    public static void main(String[] args) {
//chromedriver.exe msedge.exe msedgewebview2.exe
        try {
            Runtime.getRuntime().exec("taskkill /F /IM  chromedriver.exe /T");
            System.out.println("Killing of Chromedriver done successfully !!!");
        } catch (IOException e) {

            System.out.println("Something went wrong"+e.getMessage());
        }

    }




    public void killchromedriverprocess()
    {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
            System.out.println("Killing of Chromedriver done successfully !!!");
        } catch (IOException e) {

            System.out.println("Something went wrong"+e.getMessage());
        }
    }



    public void KillProcess_mac()
    {
        try {
            Runtime.getRuntime().exec("pkill Chrome");
            System.out.println("Killing of Chromedriver done successfully !!!");
        } catch (IOException e) {

            System.out.println("Something went wrong"+e.getMessage());
        }
    }

    public KillProcssChromedriver()
    {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
            System.out.println("Killing of Chromedriver done successfully !!!");
        } catch (IOException e) {

            System.out.println("Something went wrong"+e.getMessage());
        }
    }

    public KillProcssChromedriver(String a, int z) {

        System.out.println(a);
    }




}
