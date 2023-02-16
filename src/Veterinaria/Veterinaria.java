package Veterinaria;

import java.util.Scanner;

public class Veterinaria {
    public static void main(String[] args) {
        menuPrincipal();
    }


    public static void menuPrincipal(){
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

    public static void menuMascotas(){
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
                    registroMascotas();
                    break;
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
    }

    public static void registroMascotas(){
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
                    System.out.println("perro");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("gato");
                    System.out.println();
                    break;
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
    }
}
