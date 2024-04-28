package pe.edu.upc.conexion_24.servicesinterfaces;

import pe.edu.upc.conexion_24.entities.Comment;
import pe.edu.upc.conexion_24.entities.RecreationalActivity;

import java.util.List;

public interface RecreationalActivityService {
    public void insert(RecreationalActivity recreationalActivity);

    public List<RecreationalActivity> list();

    public List<String[]> countByActivityPopular();


}
