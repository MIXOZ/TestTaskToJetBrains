package main;

public class Main {

    public static boolean matches(String text, String regex) {
        return MatchClass.matches(text, regex);
    }

    public static void main(String[] args) {
        System.out.println(matches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "(a|aa)+"));
        System.exit(0);
    }
}