import java.text.DecimalFormat;

public class FuncionRedondeo {
    public static void main(String[] args) {
        // Redondeo
        // Mayor a .5 redondea hacia arriba
        var numero = 8.5555;
        var redondeo = Math.round(numero);
        System.out.println("Valor " + numero + " redondeado: " + redondeo);
        // Formato
        var patron = "#.##";
        //var patron = "#";
        var decimalFormat = new DecimalFormat(patron);
        var numeroFormato = decimalFormat.format(numero);
        System.out.println("Valor " + numero + " con formato: " + numeroFormato);
    }
}
