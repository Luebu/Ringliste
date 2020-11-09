import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Spiel g = new Spiel();
		Scanner s = new Scanner(System.in);
	    System.out.println("Wie viele?");
	    int tmp=s.nextInt();
	    if(tmp>1) {
			g.erstellen(tmp);
		}else{
	    	System.out.println("Die Zahl muss größer als 2 sein");
	    	return;
		}
	    System.out.println("Welche stelle?");
	    System.out.println(g.game(s.nextInt()));
    }
}
