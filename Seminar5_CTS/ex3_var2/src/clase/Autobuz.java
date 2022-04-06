package clase;

public class Autobuz {
    private String numeSofer;
    private String model;
    private Integer nrLinie;
    private Integer nrLocuri;
    private String nrInmatriculare;
    private Boolean deschideUsi;
    private Boolean opresteCapat;

    public Autobuz(String numeSofer, String model, Integer nrLinie, Integer nrLocuri, String nrInmatriculare, Boolean deschideUsi, Boolean opresteCapat) {
        this.numeSofer = numeSofer;
        this.model = model;
        this.nrLinie = nrLinie;
        this.nrLocuri = nrLocuri;
        this.nrInmatriculare = nrInmatriculare;
        this.deschideUsi = deschideUsi;
        this.opresteCapat = opresteCapat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLinie=").append(nrLinie);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", deschideUsi=").append(deschideUsi);
        sb.append(", opresteCapat=").append(opresteCapat);
        sb.append('}');
        return sb.toString();
    }
}
