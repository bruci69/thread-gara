public class Pilota extends Thread{
    private Pista pista;

    public Pilota(String nome, Pista pista) {
        super(nome);
        this.pista = pista;
    }

    @Override
    public void run() {
        this.pista.entrataInPista();
        int tempo = (int) (Math.random()*2000+4000);
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {}
        this.pista.uscitaDallaPista();
    }
}