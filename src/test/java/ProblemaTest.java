import org.example.controllers.ProblemaController;
import org.example.controllers.TecnicoController;
import org.example.models.Problema;
import org.example.models.Tecnico;

public class ProblemaTest {
    public static void main(String[] args) {
        ProblemaController problemaController = new ProblemaController();

        Problema problema = new Problema();
        problema.setNombre("test");
        problema.setDescripcion("descripcion");
        problemaController.create(problema);


    }
}
