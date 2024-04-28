package pe.edu.upc.conexion_24.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.conexion_24.entities.RecreationalActivity;

import java.util.List;

@Repository
public interface RecreationalActivityRepository extends JpaRepository<RecreationalActivity, Long> {
    @Query("SELECT ra.NameActivity, COUNT(u.id) as cantidad " +
            "FROM RecreationalActivity ra " +
            "INNER JOIN ra.user1 u " +
            "INNER JOIN ra.user2 u2 " +
            "GROUP BY ra.NameActivity " +
            "ORDER BY cantidad DESC")
    public List<String[]> countByActivityPopular();


}
