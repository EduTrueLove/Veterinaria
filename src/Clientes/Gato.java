package Clientes;

public class Gato extends Mascota{
    public Boolean cuidadoEspecial;

    public Gato(Integer id, String nombre, String raza, Character sexo,String nombreDuenho, Boolean cuidadoEspecial){
        super(id,nombre,raza,sexo,nombreDuenho);
        this.cuidadoEspecial = cuidadoEspecial;
    }

    public void mostrarDatos(){
        System.out.println();
        System.out.println("Id del gato: "+ id);
        System.out.println("Nombre del gato: " + nombre);
        System.out.println("Raza del gato: " + raza);
        System.out.println("Sexo del gato: " + sexo );
        System.out.println("Nombre duenho del gato: "+ nombreDuenho);
        System.out.println("Cuidado especial del gato: " + cuidadoEspecial);
        System.out.println();
    }

}
