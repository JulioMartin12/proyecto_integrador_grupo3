package org.example.menus;

import java.util.Scanner;

public final class MenuRRHH {
    public MenuRRHH() {
        this.menu();
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int opcion = 999;
        do {
            System.out.println("MENU RRHH");
            System.out.println("1)CRUD Técnico.");
            System.out.println("2)CRUD Cliente.");
            System.out.println("0)Para Salir del sistema.");
            System.out.print("Seleccione una Opcion:");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1: MenuTecnico menuTecnico = new MenuTecnico();
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

}
