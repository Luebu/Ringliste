import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Spiel g = new Spiel();
	    Scanner s = new Scanner(System.in);
	    System.out.println("Wie viele?");
	    g.erstellen(s.nextInt());
	    System.out.println("Welche stelle?");
	    System.out.println(g.game(s.nextInt()));
    }
}
