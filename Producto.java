/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.m05.uf5.practica;


import java.util.regex.*;

/**
 * Clase que representa a un producto de un comercio, con sus principales
 * atributos, métodos para acceder a éstos y un método estático para validar
 * códigos de barras
 * @author Juan
 */

public class Producto {
    private static String pattern= "^[8][4][0-9{11}]";
    /** Código de barras del producto */
    private String codigo;
    /** Text descriptivo del producto */
    private String descripcion;
    /** Precio unitario sin IVA */
    private double precioSinIVA;
    /** IVA aplicado al producto en tanto por ciento */
    private int IVA;
    /** Indica si es un producto a granel y por lo tanto pesable */
    private boolean granel;
    
    /**
     * Devuelve un nuevo objeto Producto con los parámetros proporcionados
     * @param codigo código de barras
     * @param descripcion texto con la descripción
     * @param precioSinIVA precio unitario sin aplicar IVA
     * @param IVA el tanto por ciento de IVA que se aplica al Producto
     * @param granel indica si es un Producto a granel
     * @throws ProductoException en caso de que el código de barras no tenga un
     * formato válido
     */
    public Producto(String codigo, String descripcion, double precioSinIVA, int IVA, boolean granel) throws ProductoException{
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precioSinIVA=precioSinIVA;
        this.IVA=IVA;
        this.granel=granel;
    }
    
    /*
        Añadir los getters necesarios para los atributos
        
    */
    public String getCodigo(){ return codigo; }
    public String getDescripcion(){ return descripcion; }
    public double getPrecioSinIVA(){ return precioSinIVA; }
    public boolean getGranel(){ return granel; }
    
    /*
        Métodos adicionales
    */
    
    /**
     * 
     * @return el precio del Producto aplicando el IVA
     */
    public double getPrecioConIVA(){
        if (granel) 
            return precioSinIVA*1.10;
        else{
            return precioSinIVA*1.21;
        }
    }
    
    /**
     * 
     * @return los primeros 15 caracteres de la descripción del producto, útil 
     * para la generación de tickets
     */
    public String getDescripcionCorta(){
        return descripcion.substring(0,15);
    }
    
    /**
     * Verifica si un código es o no correcto. De momento sólo valida que hayan
     * 13 caracteres y los dos primeros sean 84.
     * @param codigo el código de barras a validar
     * @return true si el formato del código es válido
     */
    public static boolean esCodigoCorrecto(String codigo){
        if (codigo.length()==13) {
            if (codigo.matches(pattern)) 
                return true;
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
}
