package Clientes;

public class Gato extends Mascota{
    public Boolean cuidadoEspecial;

    public Gato(Integer id, String nombre, String raza, Character sexo,String nombreDuenho, Boolean cuidadoEspecial){
        super(id,nombre,raza,sexo,nombreDuenho);
        this.cuidadoEspecial = cuidadoEspecial;
    }

    public void mostrarDatos(){
        System.out.println();
        System.out.println("\\u001B[34m Id del gato: "+ id +"\\u001B[0m");
        System.out.println("\\u001B[34m Nombre del gato: " + nombre +"\\u001B[0m");
        System.out.println("\\u001B[34m Raza del gato: " + raza +"\\u001B[0m");
        System.out.println("\\u001B[34m Sexo del gato: " + sexo +"\\u001B[0m");
        System.out.println("\\u001B[34m Nombre duenho del gato: "+ nombreDuenho +"\\u001B[0m");
        System.out.println("\\u001B[34m Cuidado especial del gato: " + cuidadoEspecial +"\\u001B[0m");
        System.out.println();
    }

}
