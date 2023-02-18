package Veterinaria;

import Clientes.Gato;
import Clientes.Mascota;
import Clientes.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class Veterinaria {
    public static void main(String[] args) {
        menuPrincipal();
    }


    public static void menuPrincipal(){
        ArrayList<Mascota> mascotasVeterinaria = new ArrayList<>();
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
                    mascotaTemporal = menuMascotas();
                    System.out.println(mascotaTemporal.getClass().toString());
                    if (esPerroOEsGato(mascotaTemporal).equals("class Clientes.Gato") || esPerroOEsGato(mascotaTemporal).equals("class Clientes.Perro")){
                        mascotasVeterinaria.add(mascotaTemporal);
                    }else{
                        System.out.println("Ninguna operacion fue registrada.");
                        System.out.println();
                    }
                    menuMascotas();
                    break;
                case 2:
                    System.out.println("menu citas");
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

    public static Mascota menuMascotas(){
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
                    return registroMascotas();
                case 2:
                    System.out.println("mostrar todo");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("buscar especificamente");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("modificar");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("eliminar");
                    System.out.println();
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

        return null;
    }

    public static Mascota registroMascotas(){
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
            }catch (Exception e){
                System.out.println("el valor ingresado no es un valor numerico");
                System.out.println();
                opcion = 4;
            }

            switch (opcion){
                case 1:
                    return registrarPerro();
                case 2:
                    return registrarGato();
                case 3:
                    System.out.println("regresar menu anterior");
                    System.out.println();
                    menu = false;
                    break;
                default:
                    System.out.println("operacion invalida");
                    System.out.println();
            }
        }while (menu);

        return null;
    }

    public static Perro registrarPerro(){
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


        return new Perro(id, nombre, raza, sexo, nombreDuenho, agresivo);
    }

    public static Gato registrarGato(){
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

        return new Gato(id,nombre,raza,sexo,nombreDuenho,cuidadoEspecial);

    }

    public static String esPerroOEsGato(Mascota mascota){
        if (mascota.getClass().toString().equals("class Clientes.Gato")) {
            return mascota.getClass().toString();
        }else if (mascota.getClass().toString().equals(" class Clientes.Perro")) {
            return mascota.getClass().toString();
        }else{
            return null;
        }
    }
}
