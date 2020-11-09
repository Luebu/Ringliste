public class Spiel {
    private Ring akt;
    private Ring first;

    public void erstellen(int pN) {
        first = new Ring(1);
        akt = first;
        for (int i = 2; i <= pN; i++) {
            akt.setNachfolger(new Ring(i));
            akt = akt.getNachfolger();
        }
        akt.setNachfolger(first);
        akt = akt.getNachfolger();
    }

    public int game(int pN) {
        Ring temp = akt;
        while (akt.getNachfolger() != null) {
            for (int i = 0; i < pN; i++) {
                akt = akt.getNachfolger();
            }
            while (temp.getNachfolger() != akt) {
                temp = temp.getNachfolger();

            }
            temp.setNachfolger(akt.getNachfolger());
            akt = temp;
        }
        return akt.getZahl();
    }
}
