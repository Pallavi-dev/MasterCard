package MasterCard.MasterCard.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ElementMapping  {

    @Id
    Integer Id;
    String Feeder;
    String Elements;
    String RoleName;
    String  Enable;
    String As;

}
