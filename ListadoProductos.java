package dam.m03.uf5.grupoX.tpv;

import java.util.*;

/** Modelo de datos para almacenar el listado de productos de una tienda, que
 * esconde el soporte utilizado para su almacenamiento.
 * Se deberá escoger el mejor tipo de colección que permita buscar
 * un producto a partir de su código de barras
 * @author Juan
 */
public class ListadoProductos {
    /** referencia a una colección usada para almacenar la relación 
     * de productos disponibles.
     */
    private COLECCION listado;
    
    /** Crea y devuelve una instancia de la clase. Se debe inicializar con unos
     * cuantos productos de prueba como los del enunciado
     */
    public ListadoProductos(){
    }
    
    /**
     * Método que devuelve el Producto correspondiente a un codigo de barras
     * @param codigo el código de barras a buscar
     * @return la instancia de Producto correspondiente al código
     * @throws ProductoException en caso de que el producto no exista o si el
     * formato no es correcto (en el constructor de la excepción se indicará
     * cuál de los dos motivos).
     */
    public Producto getProductoByCodigo(String codigo) throws ProductoException{
    }
}
