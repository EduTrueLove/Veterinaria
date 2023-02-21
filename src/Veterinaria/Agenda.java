package Veterinaria;

import Clientes.Gato;
import Clientes.Mascota;
import Clientes.Perro;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    static private Agenda agenda = null;
    ArrayList<Mascota> mascotas = new ArrayList<>();

    private Agenda() {
    }

    static public Agenda getAgenda() {

        if (agenda == null) {
            agenda = new Agenda();
        }
        return agenda;
    }

    public void registroMascotas() {
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

    public void registrarPerro() {
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

    public void registrarGato() {
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

    public String esPerroEsGato(Mascota mascota) {
        if (mascota.getClass().toString().equals("class Clientes.Gato")) {
            return "gato";
        } else if (mascota.getClass().toString().equals("class Clientes.Perro")) {
            return "perro";
        } else {
            return null;
        }
    }


    public void monstrarMascotas() {
        Perro temporalPerro = null;
        Gato temporalGato = null;


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


}
