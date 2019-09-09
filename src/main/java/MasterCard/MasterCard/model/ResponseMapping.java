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

    String roleName;
    List<String> detailFields;
    List<String> asFields;
    Integer downloadSummaryCount;
    Integer downloaddetailCount;
    Integer summaryResponseCount;
    Integer detailResponseCount;

    public String getRoleName() {
        return roleName;
    }

    public ResponseMapping() {
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<String> getDetailFields() {
        return detailFields;
    }

    public void setDetailFields(List<String> detailFields) {
        this.detailFields = detailFields;
    }

    public List<String> getAsFields() {
        return asFields;
    }

    public void setAsFields(List<String> asFields) {
        this.asFields = asFields;
    }

    public Integer getDownloadSummaryCount() {
        return downloadSummaryCount;
    }

    public void setDownloadSummaryCount(Integer downloadSummaryCount) {
        this.downloadSummaryCount = downloadSummaryCount;
    }

    public Integer getDownloaddetailCount() {
        return downloaddetailCount;
    }

    public void setDownloaddetailCount(Integer downloaddetailCount) {
        this.downloaddetailCount = downloaddetailCount;
    }

    public Integer getSummaryResponseCount() {
        return summaryResponseCount;
    }

    public void setSummaryResponseCount(Integer summaryResponseCount) {
        this.summaryResponseCount = summaryResponseCount;
    }

    public Integer getDetailResponseCount() {
        return detailResponseCount;
    }

    public void setDetailResponseCount(Integer detailResponseCount) {
        this.detailResponseCount = detailResponseCount;
    }

    public ResponseMapping(String roleName, List<String> detailFields, List<String> asFields, Integer downloadSummaryCount, Integer downloaddetailCount, Integer summaryResponseCount, Integer detailResponseCount) {
        this.roleName = roleName;
        this.detailFields = detailFields;
        this.asFields = asFields;
        this.downloadSummaryCount = downloadSummaryCount;
        this.downloaddetailCount = downloaddetailCount;
        this.summaryResponseCount = summaryResponseCount;
        this.detailResponseCount = detailResponseCount;
    }

    public void setRoleMappingFields(RoleMapping byRoleName) {
        this.roleName=byRoleName.getRoleName();
        this.downloadSummaryCount = byRoleName.getDownloadSummaryCount();
        this.downloaddetailCount = byRoleName.getDownloadDetailCount();
        this.summaryResponseCount = byRoleName.getSummaryResponseCount();
        this.detailResponseCount = byRoleName.getDetailResponseCount();

    }

    public void setElementMappingFields(List<ElementMapping> elementMappingFields) {

     this.detailFields=elementMappingFields.stream().map(i->i.getElements()).collect(Collectors.toList());
     this.asFields =elementMappingFields.stream().map(i->i.getAs()).collect(Collectors.toList());

    }
}
