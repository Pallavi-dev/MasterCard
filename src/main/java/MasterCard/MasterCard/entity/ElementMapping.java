package MasterCard.MasterCard.entity;


import MasterCard.MasterCard.model.ElementMappingCompositeKey;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(ElementMappingCompositeKey.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class ElementMapping  {

    @Id
    String elements;
    @Id
    String enable;
    @Id
    String roleName;
    String feeder;
    String asFields;

}
