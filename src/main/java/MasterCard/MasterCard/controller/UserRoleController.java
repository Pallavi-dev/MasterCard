package MasterCard.MasterCard.controller;

import MasterCard.MasterCard.entity.ElementMapping;
import MasterCard.MasterCard.entity.UserRoles;
import MasterCard.MasterCard.model.ResponseMapping;
import MasterCard.MasterCard.repository.ElementMappingRepository;
import MasterCard.MasterCard.repository.RoleMappingRepository;
import MasterCard.MasterCard.repository.UserRoleRepository;
import MasterCard.MasterCard.service.ServiceUserRoleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class UserRoleController {

    @Autowired
    ServiceUserRoleModel serviceUserRoleModel;

    @Autowired
    UserRoleRepository userRoleRepository;

   /*@Autowired
   RoleMappingRepository roleMappingRepository;

   @Autowired
    ElementMappingRepository elementMappingRepository;

   @Autowired
     ResponseMapping responseMapping;
     */

    @PutMapping("/billing/user-roles/{id}")
   public ResponseEntity<String> updateUserRoles(@RequestBody UserRoles userRoles,@PathVariable String id) {
        serviceUserRoleModel.updateUserRoles(userRoles,id);
        return ResponseEntity.ok("Successfully updated the user-role mapping");
   }
    @PostMapping("/billing/user-roles")
    public ResponseEntity<String> getUserRoles(@RequestBody UserRoles userRole) {
       serviceUserRoleModel.storeUserRole(userRole);
        return ResponseEntity.ok("Successfully created the user-role mapping");
    }

    @DeleteMapping("/billing/user-roles")
    public ResponseEntity<String>  deleteuserRoles(@RequestParam String userId) {
        serviceUserRoleModel.deleteuserRoles(userId);
        return ResponseEntity.ok("Successfully deleted the user-role mapping");
    }

    @GetMapping("/billing/user-roles/getdetails")
    public List<UserRoles> DisplayUserRoles() {
        return serviceUserRoleModel.displayUserRole();
    }

    @GetMapping("/billing/user-roles")
    public String getuser(@RequestParam String userId, @RequestParam String Feeder){

        String rolename= userRoleRepository.findByUserId(userId).getRoleName();
       //responseMapping.setRoleMappingFields(roleMappingRepository.findByRoleName(rolename));
     //  responseMapping.setElementMappingFields(elementMappingRepository.returnelements(Feeder,rolename));
       return  rolename;
    }

}
