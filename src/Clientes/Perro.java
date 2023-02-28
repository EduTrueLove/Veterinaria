package Clientes;

import java.util.ArrayList;

public class Perro extends Mascota{
    private Boolean agresivo;

    public Perro(Integer id, String nombre, String raza, Character sexo, String nombreDuenho, Boolean agresivo) {
        super(id, nombre, raza, sexo, nombreDuenho);
        // referencia al miembro propio de la clase
        this.agresivo = agresivo;
    }

    @Override
    public void mostrarDatos(){
        System.out.println();
        System.out.println("Id del perro: "+ getId());
        System.out.println("Nombre del perro: " + getNombre());
        System.out.println("Raza del perro: " + getRaza());
        System.out.println("Sexo del perro: " + getSexo());
        System.out.println("Nombre duenho del perro: "+ getNombreDuenho());
        System.out.println("Cuidado especial del perro: " + agresivo);
        System.out.println();
    }

    /*Sobre carga de metodo solo como referencia
    capacidad de crear un metodo con el mismo identificador pero con diferentes parametros
    para poder usar el polimorfismo = la capacidad de un objeto de reaccionar diferente la mismo metodo
     */
    public void mostrarDatos(Integer id){
       setId(id);
        System.out.println("Nuevo id:"+ getId());

    }

}
