public class ClasePersona {
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setEdad("20");
        persona.setNombre("Juan");
        persona.setTelefono("123456789");
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Telefono: "+persona.getTelefono());
    }
}
class Persona{
    private String edad;
    private String nombre;
    private String telefono;

    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}