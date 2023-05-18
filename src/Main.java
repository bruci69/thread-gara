import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Pista pista = new Pista(4);
        ArrayList <Pilota> piloti = new ArrayList<>();
        for (int i = 0; i < 8; i++){
            piloti.add(new Pilota("Pilota " + (i +1), pista));
        }

        for (int i = 0; i < 8; i++){
            piloti.get(i).start();
        }
    }
}