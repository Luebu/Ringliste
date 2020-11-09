import java.util.Scanner;

public class Spiel {
    private Ring akt;
    private Ring first;

    public void erstellen(int pN) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welches Alter soll die Person haben?");
        first = new Ring(sc.nextInt());
        System.out.println("Welchen Namen soll die Person haben?");
        first.getPerson().setName(sc.next());
        akt = first;
        for (int i = 2; i <= pN; i++) {
            System.out.println("Welches Alter soll die Person haben?");
            akt.setNachfolger(new Ring(sc.nextInt()));
            akt = akt.getNachfolger();
            System.out.println("Welchen Namen soll die Person haben?");
            akt.getPerson().setName(sc.next());
        }
        akt.setNachfolger(first);
        akt = akt.getNachfolger();
    }

    public Person game(int pN) {
        Ring temp = akt;
        while (akt.getNachfolger() != akt) {
            for (int i = 0; i < pN; i++) {
                akt = akt.getNachfolger();
            }
            while (temp.getNachfolger() != akt) {
                temp = temp.getNachfolger();

            }
            temp.setNachfolger(akt.getNachfolger());
            akt = temp.getNachfolger();
        }
        return akt.getPerson();
    }
}
