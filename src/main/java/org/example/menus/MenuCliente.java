package org.example.menus;

import org.example.controllers.ClienteController;
import org.example.models.Cliente;


import java.util.Scanner;

public class MenuCliente {
    public MenuCliente() {
        this.menu();
    }

    public  void menu(){
        Scanner scanner = new Scanner(System.in);
        int opcion = 999;
        do {
            System.out.println("MENU CRUD DEL Cliente");
            System.out.println("1)Alta del Cliente.");
            System.out.println("2)Modificación del Cliente.");
            System.out.println("3)Eliminación del Cliente.");
            System.out.println("4)Modificación del Cliente.");


            System.out.println("0)Para Salir del menu.");
            System.out.print("Seleccione una Opción:");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1: this.crearCliente();
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

    public void crearCliente(){
        Scanner sc = new Scanner(System.in);
        String razonSocial= "";
        System.out.print("Ingrese la Razón Social del cliente: ");
        razonSocial= sc.nextLine();
        String cuit = "";
        System.out.print("Ingrese el CUIT del Cliente: ");
        cuit= sc.nextLine();
        String email = "";
        System.out.print("Ingrese el email del Cliente: ");
        email= sc.nextLine();
        Cliente cliente = new Cliente(cuit,razonSocial,email);
        ClienteController clienteController = new ClienteController();
        clienteController.create(cliente);

    }
}
