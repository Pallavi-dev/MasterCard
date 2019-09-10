package MasterCard.MasterCard.model;


import MasterCard.MasterCard.entity.ElementMapping;
import MasterCard.MasterCard.entity.RoleMapping;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
@Getter
@Setter

public class ResponseMapping {

    String RoleName;
    List<String> DetailFields;
    List<String> AsFields;
    Integer DownloadSummaryCount;
    Integer DownloaddetailCount;
    Integer SummaryResponseCount;
    Integer DetailResponseCount;


    public void setRoleMappingFields(RoleMapping byRoleName) {
        this.RoleName=byRoleName.getRoleName();
        this.DownloadSummaryCount = byRoleName.getDownloadSummaryCount();
        this.DownloaddetailCount = byRoleName.getDownloadDetailCount();
        this.SummaryResponseCount = byRoleName.getSummaryResponseCount();
        this.DetailResponseCount = byRoleName.getDetailResponseCount();

    }

    public void setElementMappingFields(List<ElementMapping> elementMappingFields) {

     this.DetailFields=elementMappingFields.stream().map(i->i.getElements()).collect(Collectors.toList());
     this.AsFields =elementMappingFields.stream().map(i->i.getAsFields()).collect(Collectors.toList());

    }
}
