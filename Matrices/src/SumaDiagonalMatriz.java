import javax.swing.JOptionPane;
public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        int filas,columnas,q = 0;

        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));
        int matriz[][] = new int[filas][columnas];
        if ( filas == columnas){
            for (int a = 0; a < filas; a++){
                for (int b = 0; b < columnas; b++){
                    matriz[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valo para " +
                            a+","+b));
                }
            }
        for (int c = 0; 0 < matriz.length; c ++ ){
            q += matriz[c][c];
        }
        JOptionPane.showMessageDialog(null,"El resultado es de : " + q);
        }else {
            JOptionPane.showMessageDialog(null,"Ingrese valores iguales");
        }

    }
}
