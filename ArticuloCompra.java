/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.m05.uf5.practica;

/**
 *
 * @author Cristian
 */


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
        this.producto = producto;
    }

    /**
     * Constructor para Productos a granel
     * @param producto el Producto comprado
     * @param peso el peso en Kg
     */
    public ArticuloCompra(Producto producto, double peso){
        this.producto = producto;
        this.peso = peso;
    }
    
    /**
     * Añadir los getters necesarios
     */
    public Producto getProducto (){
        return producto;
    }
    public double getPeso(){
        return peso;
    }
    public double getTotalConIVA(){
        return totalConIVA;
    }

    /**
     * Devuelve un String representando los datos principales del artículo en 
     * una sóla línea, separados por tabuladores.
     * @return un objeto String, con el formato siguiente:
     * "Descripción corta <TAB> Peso(o <TAB>) <TAB> Precio unitario con IVA <TAB> Total con IVA"
     */
    public String toString(){
        return producto.getDescripcionCorta()+"\t"+getPeso()+"\t"+producto.getPrecioConIVA()+"\t"+getTotalConIVA();
    }
}
