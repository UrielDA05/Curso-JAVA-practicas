import javax.swing.JOptionPane;
public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        int filas,columnas;

        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));
        int matriz[][] = new int[filas][columnas];
        if ( filas == columnas){
            for (int a = 0; a < filas; a++) {
                for (int b = 0; b < columnas; b++) {
                    matriz[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valo para " +
                            a + "," + b));
                }
            }

            int q =0;
            for (int c = 0; c < filas; c++) {

                q += matriz[c][c];


            }
        JOptionPane.showMessageDialog(null,"El resultado es de : " + q);
        }else {
            JOptionPane.showMessageDialog(null,"Ingrese valores para las filas y columnas iguales");
        }

    }
}
