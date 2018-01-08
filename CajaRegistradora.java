package dam.m03.uf5.grupoX.tpv;

import java.util.*;

/**
 * Clase principal de la aplicación que implementa una caja registradora
 * @author jmartin
 */
public class CajaRegistradora {

    private String cif;
    private String nombreEmpresa;
    private String telefono;
    private String direccion;
    /** almacena los Productos disponibles en la tienda */
    private ListadoProductos listaProductos;
    /** instancia de tipo COLECCION para guardar las compras finalizadas */
    private COLECCION comprasRealizadas;
    /** COLECCION de clientes que permita hacer búsquedas a partir del código
     * de cliente
     */
    private COLECCION clientes;
    
    /**
     * Devuelve una nueva instancia, inicializada con los datos proporcionados.
     * Inicializa también el resto de atributos.
     * @param cif
     * @param telefono
     * @param nombreEmpresa
     * @param direccion 
     */
    public CajaRegistradora(String cif, String telefono, String nombreEmpresa, String direccion){
    }
    /**
     * Método principal que arranca la ejecución de la CajaRegistradora.
     * Muestra al usuario cuatro opciones: nueva compra, listar compras, alta 
     * cliente y salir. Mientras el usuario no elija salir, procesará las
     * opciones seleccionadas.
     * Si se elige una nueva compra, leerá los códigos de barras de los
     * artículos hasta que se finalice introduciendo una "F". Si el artículo es
     * un Producto a granel, pedirá el peso. En caso de error de introducción 
     * de cualquiera de los datos, mostrará un mensaje de error y pasará a pedir
     * de nuevo el código de barras.
     * Al finalizar una compra, mostrará el ticket para el usuario. Dicho ticket
     * se generará usando el método correspondiente de la clase Compra,
     * anteponiendo los datos del comercio (nombre, dirección, etc)
     * Si se elige listar compras, mostrará un resumen de la compras realizadas,
     * una por línea, usando el método de la clase Compra correspondiente.
     */
    public void inicia(){
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
