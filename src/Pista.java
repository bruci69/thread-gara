public class Pista {
    private int massimo;
    public Pista(int massimo) {
        this.massimo = massimo;
    }

    public synchronized void entrataInPista(){
        String nome = Thread.currentThread().getName();
        try {
            while (massimo <= 0) {
                System.out.println(nome + " aspetta di salire sul GoKart ");
                wait();
            }
            massimo--;
            System.out.println(nome + " sale sul GoKart ");
        } catch (InterruptedException e) {

        }
    }

    public synchronized void uscitaDallaPista(){
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " esce dalla pista");
        massimo++;
        notifyAll();
    }


}