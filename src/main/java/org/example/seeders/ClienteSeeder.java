package org.example.seeders;

import org.example.controllers.ClienteController;
import org.example.controllers.TecnicoController;
import org.example.models.Cliente;
import org.example.models.Tecnico;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ClienteSeeder {

    public ClienteSeeder() {
        this.cargoDatos();
    }

    public  void cargoDatos(){
        ClienteController clienteController = new ClienteController();
          List<String> numerosCuit = Arrays.asList(
                "20333456789",
                "30789123456",
                "20345678901",
                "20312345678",
                "20398765432",
                "20356789012",
                "20387654321",
                "20343210987",
                "20321098765",
                "20365432109"
        );


        List<String> razonesSociales = Arrays.asList(
                "Empresa A SRL",
                "Compañía B SA",
                "Fábrica C SRL",
                "Consultores D SA",
                "Servicios E SA",
                "Industria F SAS",
                "Constructora G SA",
                "Importadora H SAS",
                "Distribuidora I SRL",
                "Desarrollos J SA"
        );


        List<String> emails = Arrays.asList(
                "info@empresaA.com",
                "contacto@companiaB.com",
                "info@fabricaC.com",
                "consultas@consultoresD.com",
                "serviciosE@gmail.com",
                "info@industriaF.com",
                "contacto@constructoraG.com",
                "ventas@importadoraH.com",
                "info@distribuidoraI.com",
                "contacto@desarrollosJ.com"
        );
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            String cuit = numerosCuit.get(i);
            String email = emails.get(i);
            String razonSocial = razonesSociales.get(i);


            Cliente cliente = new Cliente(cuit,razonSocial,email);
            clienteController.create(cliente);

        }
    }
}
