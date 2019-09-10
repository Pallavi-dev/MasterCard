package MasterCard.MasterCard.service;

import MasterCard.MasterCard.entity.UserRoles;
import MasterCard.MasterCard.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;

@Service
public class ServiceUserRoleModel {

    @Autowired
    UserRoleRepository userRoleRepository;

    public void storeUserRole(UserRoles userRoles){
        userRoles.setCreatedTimestamp(getCurrentDate());
        userRoleRepository.save(userRoles);
    }

    public List<UserRoles> displayUserRole() {
        List<UserRoles> list=new ArrayList<>();
        userRoleRepository.findAll().forEach(list::add);
        return list;
    }

    public void updateUserRoles(UserRoles userRoles,String id) {

        UserRoles u= displayUserRole().stream().filter(t->t.getUserId().equals(id)).findFirst().get();
        userRoles.setCreatedTimestamp(u.getCreatedTimestamp());
        userRoles.setId(u.getId());
        userRoles.setUserId(u.getUserId());
        userRoles.setLastUpdatedTimestamp(getCurrentDate().toString());
        userRoleRepository.save(userRoles);
        }

    public void deleteuserRoles(String userId) {
       userRoleRepository.delete(displayUserRole().stream().filter(t->t.getUserId().equals(userId)).findFirst().get());
    }

    public Date getCurrentDate(){
        Date date= new Date();
        long time = date. getTime();
        Timestamp timestamp=new Timestamp(time);
        return timestamp;
    }

}
