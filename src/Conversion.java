import java.sql.SQLOutput;
import java.util.Scanner;

public class Conversion {

    public static void transformacion (String firstCoin, String secondCoin, Busqueda search, Scanner eye){

        double monto;
        double montoConvertido;


        Coins coins = search.buscarTasas(firstCoin, secondCoin);

        System.out.println("El cambio actual de " + firstCoin +
                " a " + secondCoin + " es de: " + coins.conversion_rate() );

        System.out.print("Ingresa el monto a convertir: ");

        monto = Double.parseDouble(eye.nextLine());

        montoConvertido = monto * coins.conversion_rate();


        System.out.println("El equivalente de " + monto  + " de "+ " [ " + firstCoin + "] a "
                + "[" + secondCoin + "] es igual a: " + montoConvertido) ;

    }

}
