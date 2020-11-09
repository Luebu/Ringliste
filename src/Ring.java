public class Ring {
    private Person p;
    private Ring nachfolger;

    Ring(int pN) {
        p = new Person();
        p.setAlter(pN);
    }

    public Ring getNachfolger() {
        return nachfolger;
    }

    public void setNachfolger(Ring nachfolger) {
        this.nachfolger = nachfolger;
    }

    public Person getPerson() {
        return p;
    }

}