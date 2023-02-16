package Clientes;

public class Perro extends Mascota{
    public Boolean agresivo;

    public Perro(Integer id, String nombre, String raza, Character sexo, String nombreDuenho, Boolean agresivo) {
        super(id, nombre, raza, sexo, nombreDuenho);
        this.agresivo = agresivo;
    }
}
