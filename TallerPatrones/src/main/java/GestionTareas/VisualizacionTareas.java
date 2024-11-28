package GestionTareas;

import java.util.ArrayList;

public class VisualizacionTareas {
    private VisualizacionStrategy visualizacion;

    public void setVisualizacion(VisualizacionStrategy vt) {
        this.visualizacion = vt;
    }
    public void doVisualizacion(ArrayList<Tarea> tareas){
        visualizacion.BuildVisualizacion(tareas);
    }
}
