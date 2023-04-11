/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contructores;

/**
 *
 * @author tokiro
 */
public class Contructores {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println("Nombre: ".concat(persona.getNombre()));
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: ".concat(persona.getEdadComoTexto()));
        System.out.println(persona.getTextoImprimir());
        imprimir(persona.getTextoImprimir());
    }*/
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Manuel",20,"Finanzas");
        Empleado empleadoCopia = Empleado.copiaEmpleado(empleado);
        //ctrl + space
        empleadoCopia.setDepartamento("ventas");
        imprimir(empleado.getTextoImprimir());
        imprimir(empleadoCopia.getTextoImprimir());
    }
    public static void imprimir(String texto){
        System.out.println(texto);
    }
    public static String convertirATexto(int entero){
        return String.valueOf(entero);
    }
    
}
