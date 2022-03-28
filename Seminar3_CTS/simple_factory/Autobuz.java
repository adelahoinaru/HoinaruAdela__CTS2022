package simple_factory;

public class Autobuz extends MijlocTransport {
    public Autobuz(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{" + getNumarInmatriculare());
        sb.append('}');
        return sb.toString();
    }

}
