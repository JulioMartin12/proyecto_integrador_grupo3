package org.example.menus;

import org.example.controllers.TecnicoController;
import org.example.models.Tecnico;

import java.sql.SQLOutput;
import java.util.Scanner;

public final class MenuTecnico {
    public MenuTecnico() {
        this.menu();
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int opcion = 999;
        do {
            System.out.println("MENU CRUD DEL TECNICO");
            System.out.println("1)Alta del Técnico.");
            System.out.println("2)Modificación del Técnico.");
            System.out.println("3)Eliminación del Técnico.");
            System.out.println("4)Modificación del Técnico.");
            System.out.println("5)Mostrar todos los Técnicos.");

            System.out.println("3)Para Salir del menu.");
            System.out.print("Seleccione una Opción:");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1: this.crearTecnico();
                    break;
                case 2:
                    break;
                case 0:
                    System.out.println("Usted a salido del menú de RRHH.");
                    break;
                default:
                    System.out.println("La Opción seleccionada es incorrecta.");
                    break;
            }

        }while (opcion != 0);
    }


    public void crearTecnico(){
 Scanner sc = new Scanner(System.in);
 String nombre= "";
 System.out.print("Ingrese el nombre del técnico: ");
        nombre= sc.nextLine();
 String apellido = "";

        System.out.print("Ingrese el apellido del técnico: ");
        apellido= sc.nextLine();
        Tecnico tecnico = new Tecnico(nombre,apellido);
        TecnicoController tecnicoController = new TecnicoController();
        tecnicoController.create(tecnico);


    }
}
