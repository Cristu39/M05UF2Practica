package dam.m03.uf5.grupo8.tpv;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa una compra realizada por un cliente con la relació
 * de artículos y métodos para generar diversa información
 * @author Juan
 */
public class Compra {

    /** COLECCION donde se iran añadiendo los ArticuloCompra escaneados
     */
    private COLECCION cesta;
    /** fecha y hora de la compra */
    private LocalDateTime fechaHora;
    /** el precio total (con IVA) */
    private double total;
    /** el precio total (sin IVA) */
    private double base;
    /** cliente asociado a la compra */
    private Cliente cliente;

    /**
     * Devuelve una instancia de Compra, inicializando sus atributos
     * @param cliente
     */
    public Compra(Cliente cliente){
    }

    /**
     * Añade un artículo escaneado a la cesta
     * @param articulo el ArticuloCompra a añadir
     */
    public void ponArticulo(ArticuloCompra articulo){
    }

    /** Devuelve una representación de la fecha de la compra
     *
     * @return un String con el formato: dia/mes/año hora:minutos:segundos
     */
    public String getFecha(){
    }

    /**
     *
     * @return el precio total de la compra, con el IVA incluido
     */
    public double getTotal(){
    }

    /**
     * Devuelve un resumen de una Compra, útil a la hora de mostrar un listado
     * de todas las compras realizadas.
     * @return un String con el formato: "Fecha: la_fecha, Importe (con IVA): el_importe"
     */
    public String resumen(){
    }

    /**
     * Método que genera un ticket con el listado de artículos adquiridos.
     * Hace uso del método toString de ArticuloCompra para mostrar cada línea.
     * @return un String con el ticket de compra
     */
    public String generaTicket(){
    }
}
