
import com.primer.ejercicio.utilidad.Calculo;

/**
 *
 * @author DUOC
 */
public class Trabajador {
    private String nombre;
    private String apellido;
    private byte edad;
    private byte antiguedad;
    
    public Trabajador(String nombre, String apellido,
            byte edad, byte antiguedad){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
        this.setAntiguedad(antiguedad);
    }
    // Setters
    private void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    private void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    private void setEdad(byte edad){
        this.edad = edad;
    }
    
    private void setAntiguedad(byte antiguedad){
        this.antiguedad = antiguedad;
    }
    // Getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public byte getEdad(){
        return this.edad;
    }
    
    public byte getAntiguedad(){
        return this.antiguedad;
    }
    // Custom
    public int obtenerCalculoAntiguedad(){
        Calculo cal = new Calculo();
        return cal.obtenerCalculoSemanal(this.getAntiguedad(), this.getEdad());
    }
    
    public String obtenerDetalleTrabajadorCompleta(){
        return String.format(
               "Nombre:%s\nApellido:%s\nEdad:%s\nAntiguedad:%s\nTotal:%s", 
        this.getNombre(),
        this.getApellido(),
        this.getEdad(),
        this.getAntiguedad(),
        this.obtenerCalculoAntiguedad());
    }
    
    public String obtenerDetalleTrabajadorParcial(){
        return String.format(
            "Nombre:%s\nApellido:%s\nEdad:%s\nAntiguedad:%s",
            this.getNombre(),
            this.getApellido(),
            this.getEdad(),
            this.getAntiguedad()
        );
    }
    
}