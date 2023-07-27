package javaapplication41;

import javax.swing.JOptionPane;
//import junit.framework;


public class JavaApplication41 {

    public static void main(String[] args) {

        double n;
        int b;

        do {
            b = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para ver se o cliente está com febre.\n2 Para converter a temperatura para Kelvin.\n3 Para converter a temperatura para F"));

            switch (b) {

                case 1 -> {
                    n = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatuda do cliente em Graus Celcios."));
                    if (n < 37.5) {
                        JOptionPane.showConfirmDialog(null, "Cliente não está com febre.");
                    } else {
                        JOptionPane.showConfirmDialog(null, "Usuário está com febre.");
                    }
                    break;
                }

                case 2 -> {
                    
                    n = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatuda do cliente em Graus Celcios."));

                    n = n + 273.15;

                    JOptionPane.showConfirmDialog(null, "Temperatura de " + n + "K");
                    break;
                }

                case 3 -> {
                    n = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatuda do cliente em Graus K."));
                    //(0 K − 273,15) × 9/5 + 32 = -459,7 °F
                    n = (n - 273.15) * 9 / 5 + 32;

                    JOptionPane.showConfirmDialog(null, "Temperatura de " + n + "F");
                    break;
                }
                default ->
                    JOptionPane.showConfirmDialog(null, "Fim do programa.");

            }
        } while (b < 4);

    }

}
