package MasterCard.MasterCard.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String userId;
    private String roleName;
    private String roleDescription;
    private String ica;
    private String status;
    private String createdTimeStamp;
    private String lastUpdatedTimeStamp;

}
