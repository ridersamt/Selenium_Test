package Windows;

import Windows.KillProcssChromedriver;

public class DemoKillProcess {

    public static void main(String[] args) {

        System.out.println("Kill process");

        KillProcssChromedriver obj1=new KillProcssChromedriver();

        KillProcssChromedriver obj2=new KillProcssChromedriver("Welcome", 2);

        obj1.killchromedriverprocess();

       // obj2.KillProcess_mac();


    }
}
