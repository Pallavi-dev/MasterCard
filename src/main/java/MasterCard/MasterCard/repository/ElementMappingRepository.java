package MasterCard.MasterCard.repository;

import MasterCard.MasterCard.entity.ElementMapping;
import MasterCard.MasterCard.entity.RoleMapping;
import MasterCard.MasterCard.model.ElementMappingCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ElementMappingRepository extends JpaRepository<RoleMapping,ElementMappingCompositeKey> {

    @Query("From ElementMapping  WHERE feeder=?1 AND roleName=?2 AND enable='Y'")
    List<ElementMapping> returnElements(String feeder,String roleName);

}
