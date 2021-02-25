
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    public static final int MODAPELLIDO1 = 4;
    public static final int MODNOMBRE = 3;
    public static final int MODAPELLIDO2 = 2;
    public static final int MODCIUDAD = 5;
    
    public void generateStarWarsName(String nombre, String apellido1, String apellido2, String ciudad) {
        System.out.println(apellido1.substring(0, MODAPELLIDO1) + nombre.substring(0, MODNOMBRE) + " " +  apellido2.substring(0, MODAPELLIDO2) + ciudad.substring(0, MODCIUDAD));
    }
}
