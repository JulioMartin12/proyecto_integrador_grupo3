package models;

import org.example.controllers.TecnicoController;
import org.example.models.Tecnico;

public class TecnicoTest {
    public static void main(String[] args) {
        TecnicoController tecnicoController = new TecnicoController();

        Tecnico tecnico = new Tecnico("jorge","tuli");
          tecnicoController.create(tecnico);


    }

}
