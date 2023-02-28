package Veterinaria;

import Clientes.Gato;
import Clientes.Mascota;
import Clientes.Perro;

import java.util.ArrayList;
import java.util.Scanner;


/*
Clase definida con el patron de diseno Singleton para poder despachar
el arreglo y tener acceso en el en la clase Veterinaria donde se administra todo
 */
public class Agenda {
    /*
    Muchos de los metodos definidos aqui aparte del singleton
    son defaul = no tener modificador de acceso definido
    eso nos permite poder hacer uso de ellos en cualquier clase que exista dentro de este mismo
    paquete
     */


    static private Agenda agenda = null;
    ArrayList<Mascota> mascotas = new ArrayList<>();

    private Agenda() {
    }

    static Agenda getAgenda() {

        if (agenda == null) {
            agenda = new Agenda();
        }
        return agenda;
    }

    void registroMascotas() {
        boolean menu = true;

        do {
            System.out.println("***Que Mascota Registrar****");
            System.out.println("1. Perro");
            System.out.println("2. Gato");
            System.out.println("3. Salir");
            System.out.println();
            Scanner sc = new Scanner(System.in);
            int opcion;

            try {
                opcion = Integer.valueOf(sc.nextLine());
            } catch (Exception e) {
                System.out.println("el valor ingresado no es un valor numerico");
                System.out.println();
                opcion = 4;
            }

            switch (opcion) {
                case 1:
                    registrarPerro();
                    break;
                case 2:
                    registrarGato();
                    break;
                case 3:
                    System.out.println("regresar menu anterior");
                    System.out.println();
                    menu = false;
                    break;
                default:
                    System.out.println("operacion invalida");
                    System.out.println();
                    break;
            }
        } while (menu);
    }

    void registrarPerro() {
        Integer id;
        String nombre;
        String raza;
        Character sexo;
        String nombreDuenho;
        Boolean agresivo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el id del perro: ");
        id = Integer.valueOf(sc.nextLine());
        System.out.println("Ingresa el nombre del perro: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa la raza del perro: ");
        raza = sc.nextLine();
        System.out.println("Ingresa el sexo del perro (M, H): ");
        sexo = Character.valueOf(sc.nextLine().charAt(0));
        System.out.println("Ingresa el nombre del duenho del perro: ");
        nombreDuenho = sc.nextLine();
        System.out.println("Ingresa 'true' o 'false' si el perro es agresivo: ");
        agresivo = Boolean.valueOf(sc.nextLine());

        Perro perro = new Perro(id, nombre, raza, sexo, nombreDuenho, agresivo);
        mascotas.add(perro);
    }

    void registrarGato() {
        Integer id;
        String nombre;
        String raza;
        Character sexo;
        String nombreDuenho;
        Boolean cuidadoEspecial;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el id del gato: ");
        id = Integer.valueOf(sc.nextLine());
        System.out.println("Ingresa el nombre del gato: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa la raza del gato: ");
        raza = sc.nextLine();
        System.out.println("Ingresa el sexo del gato (M, H): ");
        sexo = Character.valueOf(sc.nextLine().charAt(0));
        System.out.println("Ingresa el nombre del duenho del gato: ");
        nombreDuenho = sc.nextLine();
        System.out.println("Ingresa 'true' o 'false' si el gato tiene algun cuidado especial: ");
        cuidadoEspecial = Boolean.valueOf(sc.nextLine());

        Gato gato = new Gato(id, nombre, raza, sexo, nombreDuenho, cuidadoEspecial);
        mascotas.add(gato);

    }

    String esPerroEsGato(Mascota mascota) {
        if (mascota.getClass().toString().equals("class Clientes.Gato")) {
            return "gato";
        } else if (mascota.getClass().toString().equals("class Clientes.Perro")) {
            return "perro";
        } else {
            return null;
        }
    }


    void monstrarMascotas() {
        Perro temporalPerro = null;
        Gato temporalGato = null;

        if (mascotas.size() == 0) {
            System.out.println("No hay mascotas registradas.");
            return;
        }

        for (int x = 0; x < mascotas.size(); x++) {
            if (esPerroEsGato(mascotas.get(x)).equals("gato")) {
                temporalGato = (Gato) mascotas.get(x);
                temporalGato.mostrarDatos();
            } else if (esPerroEsGato(mascotas.get(x)).equals("perro")) {
                temporalPerro = (Perro) mascotas.get(x);
                temporalPerro.mostrarDatos();
            }
        }
    }

    Integer buscarMascota(Integer id) {
        if (mascotas.size() == 0) {
            return -1;
        }

        for (int x = 0; x < mascotas.size(); x++) {
            if (mascotas.get(x).getId() == id) {
                return x;
            }
        }
        return -2;
    }

    void mostrarMascota(Integer indice) {
        Perro temporalPerro = null;
        Gato temporalGato = null;

        if (esPerroEsGato(mascotas.get(indice)).equals("gato")) {
            temporalGato = (Gato) mascotas.get(indice);
            temporalGato.mostrarDatos();
        } else if (esPerroEsGato(mascotas.get(indice)).equals("perro")) {
            temporalPerro = (Perro) mascotas.get(indice);
            temporalPerro.mostrarDatos();
        }
    }


    void modificarMascota() {
        Integer id = null;
        Integer indice;
        Perro temporalPerro;
        Gato temporalGato;

        Integer idNuevo;
        String nombreNuevo;
        String razaNuevo;
        Character sexoNuevo;
        String nombreDuenhoNuevo;
        Boolean cuidadoEspecialNuevo;
        Boolean agresivoNuevo;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingresa un id de una mascota modificar: ");
            id = Integer.valueOf(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Ingresa un valor entero numerico correcto.");
        }

        indice = buscarMascota(id);

        if (indice == -1) {
            System.out.println("No hay mascotas registradas");
        } else if (indice == -2) {
            System.out.println("El id buscado no coincide con ninguna mascota registada.");
        } else if (id == null) {
            System.out.println("Id registrado erronamente");
        } else {
            if (esPerroEsGato(mascotas.get(indice)).equals("gato")) {
                System.out.println();
                mostrarMascota(indice);
                System.out.println("______________________________________");
                System.out.println();
                System.out.println("****Ingresa los nuevos datos del gato");
                System.out.println();
                System.out.println("Ingresa el id del gato: ");
                idNuevo = Integer.valueOf(sc.nextLine());
                System.out.println("Ingresa el nombre del gato: ");
                nombreNuevo = sc.nextLine();
                System.out.println("Ingresa la raza del gato: ");
                razaNuevo = sc.nextLine();
                System.out.println("Ingresa el sexo del gato (M, H): ");
                sexoNuevo = Character.valueOf(sc.nextLine().charAt(0));
                System.out.println("Ingresa el nombre del duenho del gato: ");
                nombreDuenhoNuevo = sc.nextLine();
                System.out.println("Ingresa 'true' o 'false' si el gato tiene algun cuidado especial: ");
                cuidadoEspecialNuevo = Boolean.valueOf(sc.nextLine());
                temporalGato = new Gato(idNuevo, nombreNuevo, razaNuevo, sexoNuevo, nombreDuenhoNuevo, cuidadoEspecialNuevo);
                mascotas.remove(mascotas.get(indice));
                mascotas.add(indice, temporalGato);
            } else {
                System.out.println();
                mostrarMascota(indice);
                System.out.println("______________________________________");
                System.out.println();
                System.out.println("****Ingresa los nuevos datos del perro");
                System.out.println();
                System.out.println("Ingresa el id del perro: ");
                idNuevo = Integer.valueOf(sc.nextLine());
                System.out.println("Ingresa el nombre del perro: ");
                nombreNuevo = sc.nextLine();
                System.out.println("Ingresa la raza del perro: ");
                razaNuevo = sc.nextLine();
                System.out.println("Ingresa el sexo del perro (M, H): ");
                sexoNuevo = Character.valueOf(sc.nextLine().charAt(0));
                System.out.println("Ingresa el nombre del duenho del perro: ");
                nombreDuenhoNuevo = sc.nextLine();
                System.out.println("Ingresa 'true' o 'false' si el perro es agresivo: ");
                agresivoNuevo = Boolean.valueOf(sc.nextLine());

                temporalPerro = new Perro(idNuevo, nombreNuevo, razaNuevo, sexoNuevo, nombreDuenhoNuevo, agresivoNuevo);
                mascotas.remove(mascotas.get(indice));
                mascotas.add(indice, temporalPerro);
            }
        }
    }


    void eliminarMascota() {
        Integer id = null;
        Integer indice;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingresa un id de una mascota eliminar: ");
            id = Integer.valueOf(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Ingresa un valor entero numerico correcto.");
        }

        indice = buscarMascota(id);

        if (indice == -1) {
            System.out.println("No hay mascotas registradas");
        } else if (indice == -2) {
            System.out.println("El id buscado no coincide con ninguna mascota registada.");
        } else if (id == null) {
            System.out.println("Id registrado erronamente");
        } else {
            System.out.println();
            System.out.println("---------------------------------------------");
            System.out.println("La mascota que vas eliminar es la siguiente.");
            System.out.println("---------------------------------------------");
            mostrarMascota(indice);
            mascotas.remove(mascotas.get(indice));
        }


    }


}
