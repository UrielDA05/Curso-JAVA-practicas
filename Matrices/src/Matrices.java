public class Matrices {
    public static void main(String[] args) {
        final int RENGLONES = 2;
        final int COLUMNAS = 3;
        // Sintaxis simplificada
        int[][] matriz = {{100,200,300},{400,500,600}};

        // Recorrer los renglones
        for (int ren = 0; ren < matriz.length; ren++){
            for (int col = 0; col < matriz[ren].length; col++){
                System.out.println("Valor["+ ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
