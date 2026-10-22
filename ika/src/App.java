
// Treenataan githubia Ikä-harjoituksella

public class App {
    public static void main(String[] args) throws Exception {
        
        int ika = 70;

        // Tulostusehdot

        if (ika > 0 && ika < 18) {
            System.out.println("Olet alaikäinen");
        }

        else if (ika >= 65) {
            System.out.println("Olet eläkeläinen");
        }

        else {
            System.out.println("Olet aikuinen");
        }
    }
}
