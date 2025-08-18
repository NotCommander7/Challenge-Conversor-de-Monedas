import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Busqueda search = new Busqueda();

        Scanner eye = new Scanner(System.in);


        int option = 0;

        while (option != 7) {

            System.out.println("\n*************************************************" +
                    "\nBienvenidos al Conver$or de moneda$" +
                    "\n1.- MXN a USD" +
                    "\n2.- USD a EUR" +
                    "\n3.- BRL a ARS" +
                    "\n4.- EUR a MXN" +
                    "\n5.- ARS a CLP" +
                    "\n6.- CLP a BRL" +
                    "\n7.- USD a MXN" +
                    "\n8.- Exit");
            System.out.print("Enter a option: ");
            option = Integer.parseInt(eye.nextLine());


            //if( option < 1 | option > 7){
            //    System.out.println("Opción no valida");



            System.out.println("\n*************************************************");

            switch (option){
                case 1:
                   Conversion.transformacion("MXN", "USD", search, eye);
                   break;

                case 2:
                    Conversion.transformacion("USD", "EUR", search, eye);
                    break;

                case 3:
                    Conversion.transformacion("BRL", "ARS", search, eye);
                    break;

                case 4:
                    Conversion.transformacion("EUR", "MXN", search, eye);
                    break;

                case 5:
                    Conversion.transformacion("ARS", "CLP", search, eye);
                    break;

                case 6:
                    Conversion.transformacion("CLP", "BRL", search, eye);
                    break;

                case 7:
                    Conversion.transformacion("USD", "MXN", search, eye);
                    break;

                case 8:
                    System.out.println("Gracias por usar nuestro conversor" +
                            "\nVuelva pronto" +
                            "\nSaliendo del sistema...");
                default:
                    System.out.println("Opcion no valida");
            }




        }


    }


}
