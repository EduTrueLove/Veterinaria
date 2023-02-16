package Clientes;

public class Mascota {

    public Integer id;
    public String nombre;
    public String raza;
    public Character sexo;
    public String nombreDuenho;

    public Mascota(Integer id, String nombre, String raza, Character sexo,String nombreDuenho){
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
        this.nombreDuenho = nombreDuenho;
    }
}
