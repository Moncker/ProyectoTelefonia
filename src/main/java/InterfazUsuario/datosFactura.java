package InterfazUsuario;


import Fecha.Fecha;

import java.util.Scanner;

public class datosFactura {

    private static Scanner scan = new Scanner(System.in);

    // ----------------------------------------------------------
    // METODOS DE USO
    // ----------------------------------------------------------

    // ----------------------------------------------------------------------------
    //METODOS DE EMITIR FACTURA
    // ----------------------------------------------------------------------------

    public static String emitirFacturaNIF(){
        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del cliente que desea generar una factura: ");
        return scan.nextLine();
    }

    public static Fecha getFechaEmision(){

        System.out.print("Indique el día de emisión de la factura: ");
        int dia = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el mes de emisión de la factura: ");
        int mes = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el año de emisión de la factura: ");
        int anyo = Integer.parseInt(scan.nextLine());

        return new Fecha(dia,mes,anyo);
    }

    public static Fecha[] pedirFechas(){
        Fecha inicio;
        Fecha fin;

        System.out.print("Indique el día de la primera fecha: ");
        int dia = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el mes de la primera fecha: ");
        int mes = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el año de la primera fecha: ");
        int anyo = Integer.parseInt(scan.nextLine());

        inicio = new Fecha(dia,mes,anyo);

        // --------------------------------------------
        System.out.print("Indique el día de la segunda fecha: ");
        dia = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el mes de la segunda fecha: ");
        mes = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el año de la segunda fecha: ");
        anyo = scan.nextInt();

        fin = new Fecha(dia,mes,anyo);


        Fecha[] rango = new Fecha[2];
        rango[0] = inicio;
        rango[1] = fin;
        return rango;
    }

    // ----------------------------------------------------------------------------
    //METODOS DE RECUPERAR UNA SOLA FACTURA
    // ----------------------------------------------------------------------------

    public static int recuperarFacturaID(){

        System.out.println(" ");

        // Código
        System.out.print("Indique el código de la factura que desea visualizar: ");
        return Integer.parseInt(scan.nextLine());
    }

    // ----------------------------------------------------------------------------
    //METODOS DE RECUPERAR TODAS LAS FACTURAS
    // ----------------------------------------------------------------------------

    public static String recuperarFacturaClienteNIF(){

        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del cliente que desea ver sus facturas emitidas: ");
        return scan.nextLine();
    }

    // ----------------------------------------------------------------------------
    // METODOS GENERALIZACION
    // ----------------------------------------------------------------------------

    public static String getNIFEntreFechas(){

        System.out.print("Indique el NIF del cliente del que quieres recuperar las facturas: ");
        return scan.nextLine();
    }

    public static Fecha getFechaInicial(){
        System.out.print("Indique el día de la primera fecha del periodo que quieres saber las facturas del cliente: ");
        int dia = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el mes de la primera fecha del periodo que quieres saber las facturas del cliente: ");
        int mes = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el año de la primera fecha del periodo que quieres saber las facturas del cliente: ");
        int anyo = Integer.parseInt(scan.nextLine());

        return new Fecha(dia,mes,anyo);
    }

    public static Fecha getFechaFinal(){
        System.out.print("Indique el día de la primera fecha del periodo que quieres saber las facturas del cliente: ");
        int dia = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el mes de la primera fecha del periodo que quieres saber las facturas del cliente: ");
        int mes = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el año de la primera fecha del periodo que quieres saber las facturas del cliente: ");
        int anyo = Integer.parseInt(scan.nextLine());

        return new Fecha(dia,mes,anyo);
    }
}
