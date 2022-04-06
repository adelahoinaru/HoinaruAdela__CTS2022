package clase;

public class Facade {
    private Autobuz autobuz;

    public Facade(){
        this.autobuz = new Autobuz();
    }

    public void DeschideTaoteUsile(){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public void LiberToateUsile(){
        autobuz.liberUsaFata();
        autobuz.liberUsaSpate();
        autobuz.liberUsaMijloc();
    }
}
