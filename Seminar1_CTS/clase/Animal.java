package clase;

abstract public class Animal {

    private String nume;

    public Animal(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public abstract void mananca(String mancare);
}
