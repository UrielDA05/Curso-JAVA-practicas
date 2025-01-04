public class FuncionRedondeo {
    public static void main(String[] args) {
        // Redondeo
        // Mayor a .5 redondea hacia arriba
        var numero = 8.2;
        var redondeo = Math.round(numero);
        System.out.println("Valor " + numero + " redondeado: " + redondeo);
    }
}
