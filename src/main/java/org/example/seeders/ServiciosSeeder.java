package org.example.seeders;

import org.example.controllers.ServicioController;
import org.example.models.Servicio;
import org.example.models.Tecnico;

import java.util.Arrays;
import java.util.List;

public class ServiciosSeeder {

    public ServiciosSeeder() {
        this.cargarDatos();
    }

    public  void cargarDatos(){
        ServicioController servicioController = new ServicioController();
        List<String> nombres = Arrays.asList("Implementación y Configuración de Aplicaciones", "Soporte Técnico Remoto y en Sitio", "Actualización y Mantenimiento",
                "Capacitación y Asesoramiento", "Gestión de Incidentes y Problemas", "Seguridad Informática",
                "Migración y Actualización de Sistemas", "Monitoreo y Optimización de Rendimiento", "Recuperación de Desastres y Backup",
                "Soporte Multiplataforma");
        List<String> descripciones = Arrays.asList("Instalación y configuración de software como SAP, Tango y otras aplicaciones empresariales.\n" +
                        "Personalización según las necesidades específicas del cliente.",
                "Asistencia remota para resolver problemas y brindar soporte técnico.\n" +
                        "Visitas in situ para solucionar problemas que no se pueden resolver de forma remota.",
                "Supervisión y aplicación de actualizaciones y parches.\n" +
                        "Mantenimiento preventivo para evitar problemas futuros.",
                "Capacitación del personal en el uso eficiente de las aplicaciones y sistemas operativos.\n" +
                        "Asesoramiento sobre las mejores prácticas y optimización.",
                "Respuesta y resolución de incidentes de manera oportuna.\n" +
                        "Investigación y solución de problemas recurrentes.",
                "Evaluación y mejora de la seguridad de las aplicaciones y sistemas operativos.\n" +
                        "Implementación de medidas de seguridad proactivas.",
                "Migración de sistemas operativos antiguos a versiones más recientes.\n" +
                        "Actualización de versiones de aplicaciones para aprovechar nuevas características y mejoras.",
                "Monitoreo constante del rendimiento de aplicaciones y sistemas operativos.\n" +
                        "Optimización para garantizar un rendimiento eficiente y sin problemas.",
                "Planificación y ejecución de estrategias de recuperación de desastres.\n" +
                        "Configuración y gestión de sistemas de backup para garantizar la seguridad de los datos.",
                "Asistencia técnica para sistemas operativos Windows, MacOS y Linux Ubuntu.\n" +
                        "Garantía de compatibilidad y rendimiento en diversas plataformas.");
        for (int i = 0; i < 10; i++) {
            String nombre = nombres.get(i);
            String descripcion = descripciones.get(i);

            Servicio servicio = new Servicio(nombre, descripcion);
            servicioController.create(servicio);

        }
    }
}
