package org.example.seeders;

import org.example.controllers.TecnicoController;
import org.example.models.Tecnico;

import java.util.Arrays;
import java.util.List;

public class TecnicoSeeder {
    public TecnicoSeeder() {
        this.cargoData();
    }

    public void cargoData(){

        TecnicoController tecnicoController = new TecnicoController();
        List<String> nombres = Arrays.asList("Juan", "María", "Carlos", "Ana", "Pedro", "Luis", "Laura", "Sofía", "Miguel", "Elena");
        List<String> apellidos = Arrays.asList("Martín", "Gómez", "López", "Fernández", "Pérez", "Sánchez", "García", "Ruiz", "Jiménez", "Díaz");

        for (int i = 0; i < 10; i++) {
            String nombre = nombres.get(i);
            String apellido = apellidos.get(i);

            Tecnico tecnico = new Tecnico(nombre, apellido);
            tecnicoController.create(tecnico);

        }
    }
}
