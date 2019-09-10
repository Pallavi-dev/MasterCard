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

public class RoleMapping {

    @Id
    Integer sr;
    String  roleName;
    Integer downloadDetailCount;
    Integer downloadSummaryCount;
    Integer summaryResponseCount;
    Integer detailResponseCount;


   }
