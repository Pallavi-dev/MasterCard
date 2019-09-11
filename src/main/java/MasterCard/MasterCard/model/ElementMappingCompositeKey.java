package MasterCard.MasterCard.model;


import MasterCard.MasterCard.entity.ElementMapping;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ElementMappingCompositeKey implements Serializable{

    String elements;
    String enable;
    String roleName;

}
