package co.edu.ucc.todolist.vistas.presenters;

import java.util.List;

import co.edu.ucc.todolist.modelo.Tarea;

/**
 * Created by Jaledaor on 29-Sep-17.
 */

public interface IListPresenter {

    void addTarea(String descTarea, String fecha);

    List<Tarea> obtenerTareas();

    void itemCambioEstado(int posicion, boolean realizado);

}
