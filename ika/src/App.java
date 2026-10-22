
// Treenataan githubia Ikä-harjoituksella

public class App {
    public static void main(String[] args) throws Exception {
        
        int ika = 16;

        // Tulostetaan iän mukaiset lauseet.

        if (ika > 0 && ika < 18) {
            // Jos käyttäjä on alle 15-vuotias, kerrotaan hänen olevan alaikäinen.
            System.out.println("Olet alaikäinen");
            // Jos käyttäjä on 15-17 -vuotias, häenelle kerrotaan, että hän saa ajaa mopoa.
            // Jos hän on 16- tai 17-vuotias, kerrotaan, että hän saa ajaa myös kevaria.
            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
                if (ika == 16 || ika == 17) {
                    System.out.println("Saat ajaa kevaria");
                }
            }
        }

        else if (ika >= 65) {
            System.out.println("Olet eläkeläinen");
        }

        else {
            System.out.println("Olet aikuinen");
        }
    }
}
