import org.example.DAO.TecnicoDAO;
import org.example.config.DBConfig;
import org.example.controllers.TecnicoController;
import org.example.models.Cliente;
import org.example.models.Tecnico;

import javax.persistence.EntityManager;

public class TecnicoTest {
    public static void main(String[] args) {
        TecnicoController tecnicoController = new TecnicoController();

        Tecnico tecnico = new Tecnico("jorge","tuli");
          tecnicoController.create(tecnico);


    }

}
