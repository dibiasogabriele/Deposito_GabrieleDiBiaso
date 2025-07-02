import java.util.ArrayList;

public class Hotel {
    private String nome;
    private ArrayList<Camera> camere;

    public Hotel(String nome) {
        this.nome = nome;
        this.camere = new ArrayList<>();
    }

    public void aggiungiCamera(Camera camera) {
        camere.add(camera);
    }

    public ArrayList<Camera> getCamere() {
        return camere;
    }


    public static int contaSuite(ArrayList<Camera> lista) {
        int count = 0;
        for (Camera c : lista) {
            if (c instanceof Suite) {
                count++;
            }
        }
        return count;
    }
}
