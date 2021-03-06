package Almacenamiento;

import Cliente.Cliente;
import Fecha.Fecha;
import InterfazUsuario.datosCliente;
import Tarifa.Tarifa;

import java.util.ArrayList;

public class gestionClientes {

    private Almacen almacen;
    private Fechador<Cliente> fechador;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public gestionClientes (Almacen almacen){
        this.almacen = almacen;
        this.fechador = new Fechador<Cliente>();
    }

    //------------------------------------------------------------------
    // METODOS DE USO
    //------------------------------------------------------------------

    public void addCliente(){
        // Llamamos a la interfaz donde se hacen las preguntas para crear el cliente y lo añadimos
        Cliente cliente = datosCliente.addCliente();
        this.almacen.addCliente(cliente);
    }

    public void deleteCliente(){
        // Llamamos a la interfaz donde se hacen las preguntas para detectar el NIF del cliente a borrar y lo borramos
        String NIF = datosCliente.deleteCliente();
        this.almacen.deleteCliente(NIF);
    }

    public void getDatosCliente(){
        // Llamamos a la interfaz donde se hacen preguntas para detectar el NIF del cliente
        String NIF = datosCliente.getDatos();
        // Recogemos al cliente y llamamos a su método toString.
        Cliente cliente = this.almacen.getCliente(NIF);
        if(cliente != null)
            System.out.println(cliente.toString());
        System.out.print("\n");
    }

    public void CambiarTarifa(){
        // Llamamos a la interfaz para que saque el NIF del cliente y la nueva cantidad
        String NIF = datosCliente.getNIFTarifa();
        double cant = datosCliente.getCantTarifa();
        Tarifa tarifa = new Tarifa(cant);
        // Recogemos al cliente y le cambiamos la tarifa
        Cliente cliente = this.almacen.getCliente(NIF);
        if(cliente != null)
            cliente.setTarifa(tarifa);
    }

    public void getDatosClientes(){
        // Recogemos la lista de clientes y escribimos sus respectivos nombres
        ArrayList<Cliente> clientes = this.almacen.getClientes();
        for(Cliente cliente : clientes){
            System.out.println("\n");
            System.out.print(cliente.toString());
        }
        System.out.println("\n");
    }

    // METODO GENERALIZACION
    public void getClienteFechas(){
        ArrayList<Cliente> listaClientes = almacen.getClientes();
        Fecha fechaIni = datosCliente.getFechaIni();
        Fecha fechaFin = datosCliente.getFechaFin();
        listaClientes = fechador.entreTiempos(listaClientes,fechaIni, fechaFin);

        for(Cliente cliente : listaClientes){
            System.out.println();
            System.out.print(cliente.toString());
            System.out.println();
        }
    }

    //------------------------------------------------------------------
    // GETTERS Y SETTERS
    //------------------------------------------------------------------

    public Almacen getAlmacen() {
        return this.almacen;
    }
}