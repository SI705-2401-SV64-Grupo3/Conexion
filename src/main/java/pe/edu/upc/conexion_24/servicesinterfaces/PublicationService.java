package pe.edu.upc.conexion_24.servicesinterfaces;

import pe.edu.upc.conexion_24.entities.Publication;
import pe.edu.upc.conexion_24.entities.Role;

import java.util.List;

public interface PublicationService {
    public void insert(Publication publication);

    public List<Publication> list();

    public void delete(Long id);

    public Publication listId(Long id);
}
