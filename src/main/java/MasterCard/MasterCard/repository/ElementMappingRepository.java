package MasterCard.MasterCard.repository;

import MasterCard.MasterCard.entity.ElementMapping;
import MasterCard.MasterCard.entity.RoleMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ElementMappingRepository extends JpaRepository<RoleMapping,Integer> {

    @Query("From ElementMapping WHERE feeder=?1 AND roleName=?2 AND enable='Y'")
    List<ElementMapping> returnelements(String feeder, String roleName);
}
