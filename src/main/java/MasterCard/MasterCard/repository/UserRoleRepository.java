package MasterCard.MasterCard.repository;


import MasterCard.MasterCard.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserRoleRepository extends JpaRepository<UserRoles,Integer> {

    UserRoles findByUserId(String id);
}
