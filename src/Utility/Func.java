package Utility;

public class Func {
    public static void Wait(int sn) {
        try {
            Thread.sleep(sn * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
