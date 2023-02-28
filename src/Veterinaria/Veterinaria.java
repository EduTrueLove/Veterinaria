package Veterinaria;

import Clientes.Mascota;
import java.util.Scanner;

public class Veterinaria {
    /*
    Muchos de los metodos definidos aqui son privados ya que solo son usados dentro de esta clase
    todos son estaticos ya que perteneces y no a la clase Veterinaria y el unico mecanismo
    para hacer uso de ellos en el metodo estatico main es utilizando metodos estaticos
    */
    public static void main(String[] args) {
        menuPrincipal();
    }


    private static void menuPrincipal(){
        Mascota mascotaTemporal;

        boolean menu = true;

        do {
            System.out.println("*********************");
            System.out.println("***Menu Principal****");
            System.out.println("*********************");
            System.out.println("1. Mascotas");
            System.out.println("2. Citas");
            System.out.println("3. Salir");
            System.out.println();
            Scanner sc = new Scanner(System.in);
            int opcion;

            try {
                opcion = Integer.valueOf(sc.nextLine());
            }catch (Exception e){
                System.out.println("el valor ingresado no es un valor numerico");
                System.out.println();
                opcion = 4;
            }

            switch (opcion){
                case 1:
                    menuMascotas();
                    break;
                case 2:
                    System.out.println("menu citas");
                    System.out.println("menu a desarrollar tal vez nunca");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("salir del sistema");
                    System.out.println();
                    menu = false;
                    break;
                default:
                    System.out.println("operacion invalida");
                    System.out.println();
            }
        }while (menu);
    }

    private static void menuMascotas(){
        boolean menu = true;

        do {
            System.out.println("**********************");
            System.out.println("****Menu Mascotas*****");
            System.out.println("**********************");
            System.out.println("1. Registrar Mascota");
            System.out.println("2. Ver Mascotas");
            System.out.println("3. Buscar Mascota");
            System.out.println("4. Modificar Mascota");
            System.out.println("5. Eliminar Mascota");
            System.out.println("6. Regresar Al Menu Anterior");
            System.out.println();
            Scanner sc = new Scanner(System.in);
            int opcion;

            try {
                opcion = Integer.valueOf(sc.nextLine());
            }catch (Exception e){
                System.out.println("el valor ingresado no es un valor numerico");
                System.out.println();
                opcion = 7;
            }

            switch (opcion){
                case 1:
                    Agenda.getAgenda().registroMascotas();
                    break;
                case 2:
                    Agenda.getAgenda().monstrarMascotas();
                    break;
                case 3:
                    buscarMascotaMenu();
                    System.out.println();
                    break;
                case 4:
                    Agenda.getAgenda().modificarMascota();
                    break;
                case 5:
                    Agenda.getAgenda().eliminarMascota();
                    break;
                case 6:
                    System.out.println("regresar menu anterior");
                    System.out.println();
                    menu = false;
                    break;
                default:
                    System.out.println("operacion en mascotas invalida");
                    System.out.println();
                    break;
            }
        }while (menu);

    }



    private static void buscarMascotaMenu(){
        Integer id = null;
        Integer indice = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el id de la mascota a buscar: ");

        try {
            id = Integer.valueOf(sc.nextLine());
        }catch (Exception e){
            System.out.println("Ingresa un valor entero numerico correcto.");
        }

        indice = Agenda.getAgenda().buscarMascota(id);

        if (indice == -1){
            System.out.println("No hay mascotas registradas");
        } else if (indice == -2) {
            System.out.println("El id buscado no coincide con ninguna mascota registada.");
        } else if (id == null) {
            System.out.println("Id registrado erronamente");
        }else{
            Agenda.getAgenda().mostrarMascota(indice);
        }

    }


}
