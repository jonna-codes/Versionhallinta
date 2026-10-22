
// Treenataan githubia Ikä-harjoituksella

public class App {
    public static void main(String[] args) throws Exception {
        
        int ika = 100;

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
        // Jos käyttäjä on yli 65-vuotias, kerrotaan hänen olevan eläkeläinen.
        // Jos ikä on 100, tulostetaan kolmirivinen onnittelu.
        else if (ika >= 65) {
            System.out.println("Olet eläkeläinen");
            if (ika == 100) {
                System.out.println("***** Paljon *****");
                System.out.println("****** onnea *****");
                System.out.println("** 100-vuotias! **");
            }
        }
        // Kerrotaan 18-64 -vuotiaille, että he ovat aikuisia.
        else {
            System.out.println("Olet aikuinen");
            // 18-vuotiaille lisätään kerrotaan, että he saavat nyt ajaa autoa.
            if (ika == 18) {
                System.out.println("Olet juuri täysi-ikäistynyt! Saat nyt ajaa autoa.");
            }
            // Jos käyttäjän ikä on tasaluku, onnitellaan lisäksi.
            else if (ika % 10 == 0) {
                System.out.println("Onnea tasavuosista!");
            }
        }
    }
}
