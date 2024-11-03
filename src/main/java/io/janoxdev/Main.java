package io.janoxdev;

public class Main {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 5; i++) {
                if (i == 5) {
                    throw new AlcanzoLimite("El for llegó a su límite en " + i);
                }
                System.out.println("\nEl contador inicial en: "+ i);
            }
        } catch (AlcanzoLimite e) {
            System.out.println(e.getMessage());
        }
    }
}

class AlcanzoLimite extends Exception {
    public AlcanzoLimite(String message) {
        super(message);
    }
}
