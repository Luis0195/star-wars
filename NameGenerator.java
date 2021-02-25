
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    public static final int modApellido1 = 4;
    public static final int modNombre = 3;
    public static final int modApellido2 = 2;
    public static final int modCiudad = 5;
    
    public void generateStarWarsName(String nombre, String apellido1, String apellido2, String ciudad) {
        System.out.println(apellido1.substring(0, modApellido1) + nombre.substring(0, modNombre) + " " +  apellido2.substring(0, modApellido2) + ciudad.substring(0, modCiudad));
    }
}
