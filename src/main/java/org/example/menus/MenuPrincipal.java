package org.example.menus;

import java.util.Scanner;

public final class MenuPrincipal {

    public MenuPrincipal() {
        this.menu();
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int opcion = 999;
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1)Recursos HHRR.");
            System.out.println("2)Mesa de ayuda.");
            System.out.println("3)Operador(Técnico).");
            System.out.println("0)Para Salir del sistema.");
            System.out.print("Seleccione una Opcion:");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:  MenuRRHH menuRRHH = new MenuRRHH();
                         menuRRHH.menu();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("Usted a salido del programa , hasta la próxima!!!.");
                    break;
                default:
                    System.out.println("La Opción seleccionada es incorrecta.");
                    break;
            }

        }while (opcion != 0);
    }

}
