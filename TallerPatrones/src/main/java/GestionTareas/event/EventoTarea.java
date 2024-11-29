package GestionTareas.event;

import java.util.ArrayList;

public abstract class EventoTarea {
    protected ArrayList<Suscriptor> suscriptores;

    public abstract void notificarSuscriptores();
    public abstract void agregarSubscriptor();
    public abstract void removerSuscriptor();
}
