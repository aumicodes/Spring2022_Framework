package Helper;

import Class1.Helper.Test;

public class Misc extends Test {

    public static void pause(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
