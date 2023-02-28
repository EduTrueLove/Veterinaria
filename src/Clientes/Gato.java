package Clientes;

public class Gato extends Mascota {
    private Boolean cuidadoEspecial;

    //Metodo constructor con todos los datos de la clase padre y propia
    public Gato(Integer id, String nombre, String raza, Character sexo, String nombreDuenho, Boolean cuidadoEspecial) {
        // super es la palabra reservada para llamar al metodo constructor del padre de manera abreviada y unica...
        super(id, nombre, raza, sexo, nombreDuenho);
        // referencia al miembro propio de la clase
        this.cuidadoEspecial = cuidadoEspecial;
    }

    /*
     Metodo sobrescrito de la clase pabre por herencia y a su vez un metodo contrato
     como parte del polimofirsmo = la capacidad de un objeto de reaccionar diferene al
     mimo metodo con diferente implementacion de la misma naturaleza por medio de la herencia
    */
    @Override
    public void mostrarDatos() {
        System.out.println();
        System.out.println("Id del gato: " + getId());
        System.out.println("Nombre del gato: " + getNombre());
        System.out.println("Raza del gato: " + getRaza());
        System.out.println("Sexo del gato: " + getSexo());
        System.out.println("Nombre duenho del gato: " + getNombreDuenho());
        System.out.println("Cuidado especial del gato: " + cuidadoEspecial);
        System.out.println();
    }

    /*Sobre carga de metodo solo como referencia
      capacidad de crear un metodo con el mismo identificador pero con diferentes parametros
      para poder usar el polimorfismo = la capacidad de un objeto de reaccionar diferente la mismo metodo
     */
    public void mostrarDatos(Integer id) {
        setId(id);
        System.out.println("Nuevo id:" + getId());

    }

}
