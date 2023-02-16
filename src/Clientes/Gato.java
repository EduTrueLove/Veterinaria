package Clientes;

public class Gato extends Mascota{
    public Boolean cuidadoEspecial;

    public Gato(Integer id, String nombre, String raza, Character sexo,String nombreDuenho, Boolean cuidadoEspecial){
        super(id,nombre,raza,sexo,nombreDuenho);
        this.cuidadoEspecial = cuidadoEspecial;
    }

}
