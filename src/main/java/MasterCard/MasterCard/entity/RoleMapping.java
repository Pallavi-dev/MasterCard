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

    public Integer getSr() {
        return sr;
    }

    public void setSr(Integer sr) {
        this.sr = sr;
    }

    @Id
    Integer sr;
    String  roleName;
    Integer downloadDetailCount;
    Integer downloadSummaryCount;
    Integer summaryResponseCount;
    Integer detailResponseCount;



    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getDownloadDetailCount() {
        return downloadDetailCount;
    }

    public void setDownloadDetailCount(Integer downloadDetailCount) {
        this.downloadDetailCount = downloadDetailCount;
    }

    public Integer getDownloadSummaryCount() {
        return downloadSummaryCount;
    }

    public void setDownloadSummaryCount(Integer downloadSummaryCount) {
        this.downloadSummaryCount = downloadSummaryCount;
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
}
