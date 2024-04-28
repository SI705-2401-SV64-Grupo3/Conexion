package pe.edu.upc.conexion_24.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.conexion_24.dtos.PublicationDTO;
import pe.edu.upc.conexion_24.dtos.RoleDTO;
import pe.edu.upc.conexion_24.dtos.UsersDTO;
import pe.edu.upc.conexion_24.entities.Publication;
import pe.edu.upc.conexion_24.entities.Role;
import pe.edu.upc.conexion_24.servicesinterfaces.PublicationService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/publicacion")
public class PublicationController {
    @Autowired
    private PublicationService pS;

    @GetMapping
    public List<PublicationDTO> lista(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,PublicationDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody PublicationDTO dto) {
        ModelMapper m = new ModelMapper();
        Publication p = m.map(dto, Publication.class);
        pS.insert(p);
    }

    @PutMapping
    public void modificar(@RequestBody PublicationDTO pdto) {
        ModelMapper m = new ModelMapper();
        Publication p= m.map(pdto, Publication.class);
        pS.insert(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        pS.delete(id);
    }


}
