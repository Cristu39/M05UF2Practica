package dam.m03.uf5.grupoX.tpv;

/**
 * Clase que representa a un cliente, con sus principales atributos
 * 
 * @author jmartin
 */
public class Cliente {
    /** nombre del cliente */
    private String nombre;
    /** apellidos del cliente */    
    private String apellidos;
    /** nif del cliente */    
    private String nif;
    /** codigo de cliente */
    private int codigoCliente;
    
    /**
     * Crea una nueva instancia, inicializada con los datos proporcionados.
     * Debe verificar que tanto el nombre como los apellidos sólo contengan 
     * caracteres alfabéticos y que el nif tenga el formato correcto. En caso
     * contrario, debe lanzar una Excepción de tipo IllegalArgumentException.
     * El código de cliente es un número autoincremental diferente para cada
     * instancia que debe generarse en el constructor
     * @param nombre
     * @param apellidos
     * @param nif
     * @throws  IllegalArgumentException
     *          Si los parámetros no tienen el formato adecuado
     */
    public Cliente(String nombre, String apellidos, String nif) 
            throws IllegalArgumentException{
    }

    /* Añadir los getters necesarios para cada atributo de un Cliente
       ! No añadir setters !
    */
    
    /**
     * 
     * @return una representación de los datos del cliente
     */
    public String toString(){
        
    }
    
    /**
     * Comprueba si un nif tiene un formato correcto
     * @param nif
     * @return true si el formato del nif es vàlido y false en caso contrario
     */
    
    private boolean nifValido(String nif){
        
    }
    
}
