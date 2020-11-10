import java.util.Scanner;

public class Spiel {
    private Ring akt;

    public void erstellen(int pN) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welches Alter soll die 1. Person haben?");
        Ring first = new Ring(sc.nextInt());
        System.out.println("Welchen Namen soll die 1. Person haben?");
        first.getPerson().setName(sc.next());
        akt = first;
        for (int i = 2; i <= pN; i++) {
            System.out.println("Welches Alter soll die " + i + ". Person haben?");
            akt.setNachfolger(new Ring(sc.nextInt()));
            akt = akt.getNachfolger();
            System.out.println("Welchen Namen soll die " + i + ". Person haben?");
            akt.getPerson().setName(sc.next());
        }
        akt.setNachfolger(first);
        akt = akt.getNachfolger();
    }

    public Person game(int pN) {
        while (akt.getNachfolger() != akt) {
            for (int i = 1; i < pN; i++) {
                akt = akt.getNachfolger();
            }
            akt.setNachfolger(akt.getNachfolger().getNachfolger());
        }
        return akt.getPerson();
    }
}
