package Clientes;

public class Perro extends Mascota{
    public Boolean agresivo;

    public Perro(Integer id, String nombre, String raza, Character sexo, String nombreDuenho, Boolean agresivo) {
        super(id, nombre, raza, sexo, nombreDuenho);
        this.agresivo = agresivo;
    }

    public void mostrarDatos(){
        System.out.println();
        System.out.println("Id del perro: "+ id);
        System.out.println("Nombre del perro: " + nombre);
        System.out.println("Raza del perro: " + raza);
        System.out.println("Sexo del perro: " + sexo);
        System.out.println("Nombre duenho del perro: "+ nombreDuenho);
        System.out.println("Cuidado especial del perro: " + agresivo);
        System.out.println();
    }

}
