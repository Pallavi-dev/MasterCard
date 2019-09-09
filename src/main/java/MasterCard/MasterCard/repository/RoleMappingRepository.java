package MasterCard.MasterCard.repository;

import MasterCard.MasterCard.entity.RoleMapping;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleMappingRepository extends JpaRepository<RoleMapping,Integer> {

    RoleMapping findByRoleName(String RoleName);


}
