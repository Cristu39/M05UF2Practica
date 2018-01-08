package dam.m03.uf5.grupoX.tpv;

/**
 * Clase contenedora que representa a un articulo adquirido por un cliente y 
 * que se añadirá a la cesta de la compra.
 * Se usa básicamente para poder almacenar el peso en caso de que un Producto
 * sea a granel.
 * También incluye algunos métodos auxiliares para calcular precios totales a
 * partir de precios unitarios, con y sih IVA.
 * También incluye los métodos getters necesarios.
 * @author Juan
 */
public class ArticuloCompra {
    /** el Producto correspondiente */
    private Producto producto;
    /** peso del producto si es granel. En caso de no serlo, el valor no tiene
     * ningún significado
     */
    private double peso;
    /** precio total del artículo en cesta, con el IVA aplicado y multiplicado
     * por el peso si es a granel
     */
    private double totalConIVA;
    
    /**
     * Constructor para Productos que no sean a granel
     * @param producto el Producto comprado
     */
    public ArticuloCompra(Producto producto){
    }

    /**
     * Constructor para Productos a granel
     * @param producto el Producto comprado
     * @param peso el peso en Kg
     */
    public ArticuloCompra(Producto producto, double peso){
    }
    
    /**
     * Añadir los getters necesarios
     */
    

    /**
     * Devuelve un String representando los datos principales del artículo en 
     * una sóla línea, separados por tabuladores.
     * @return un objeto String, con el formato siguiente:
     * "Descripción corta <TAB> Peso(o <TAB>) <TAB> Precio unitario con IVA <TAB> Total con IVA"
     */
    public String toString(){
    }
}
