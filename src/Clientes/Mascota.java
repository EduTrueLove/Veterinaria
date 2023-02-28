package Clientes;

//Clase abstracta ya que no es usada para ser instanceada = no hay objetos creados de este tipo
public abstract class Mascota {

    /*
    Para satisfacer el pilar de la POO que es el ancapsulamiento
    hacemos uso de los modificadores para generar un ocultamineto = encapsulamiento
    */
    private Integer id;
    private String nombre;
    private String raza;
    private Character sexo;
    private String nombreDuenho;

    //Metodo constructor con todas las varientes
    // this hace referencia las variantes propias de la clase no a las que llegan por parametro
    // otra forma mas sutil de polimofrismo
    public Mascota(Integer id, String nombre, String raza, Character sexo, String nombreDuenho) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
        this.nombreDuenho = nombreDuenho;
    }

    /*
    aun que tu no lo veas automaticamente java genera un metodo constructor por defecto
    =
    public Mascota(){
    }
    */


    /*
     Metodo abstracto que tiene que ser implementado en las clases hijas ya que el uso
     de la palabra abstract lo combierte en un metodo solamente defino y pendiente de ser impementado
    igual a ser sobre escrito haciendo uso de otro pilar de la programacion el cual es POLIMORFISMO
     */
    public abstract void mostrarDatos();


    /*
    Bloque de metodos publicos Getter y Setters
    para acceder a las variantes ocultadas previamente en esta clase
    */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getNombreDuenho() {
        return nombreDuenho;
    }

    public void setNombreDuenho(String nombreDuenho) {
        this.nombreDuenho = nombreDuenho;
    }
}
