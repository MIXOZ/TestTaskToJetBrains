package main;

import java.util.regex.Pattern;

public class MatchClass {

    private static final int EXECUTION_TIME = 5000;

    private static String regex = "";
    private static String text = "";
    private static boolean result = false;

    private static class FunctionThread extends Thread {
        @Override
        public void run() {
            try {
                result = Pattern.compile(regex).matcher(text).matches();
            } catch (Throwable e) {
                result = false;
            }
        }
    }

    private static class TimerThread extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(EXECUTION_TIME);
            } catch (InterruptedException ignored) {
            }
        }
    }

    public static boolean matches(String _text, String _regex) {
        text = _text;
        regex = _regex;
        Thread th1 = new FunctionThread();
        Thread th2 = new TimerThread();
        try {
            th1.start();
            th2.start();
            while (true) {
                if (!th1.isAlive() || !th2.isAlive()) {
                    return result;
                }
            }
        } catch (Throwable e) {
            return false;
        }
    }
}
