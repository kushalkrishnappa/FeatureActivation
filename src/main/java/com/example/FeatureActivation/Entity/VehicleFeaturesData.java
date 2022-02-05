package com.example.FeatureActivation.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "FTR_ACT")
@Entity
public class VehicleFeaturesData {
	
    @Id
    @Column(name = "VEH_FTR_D")
    private Long VEH_FTR_D;

    @Column(name = "VIN")
    private String VIN;
    
    public Long getVEH_FTR_D() {
		return VEH_FTR_D;
	}

	public void setVEH_FTR_D(Long vEH_FTR_D) {
		VEH_FTR_D = vEH_FTR_D;
	}

	@Column(name = "ACTI_DATE")
    private Date activatedDate;

	@Column(name = "DEAC_DATE")
    private Date DeActivatedDate;
    
    @Column(name = "FTR_CODE")
    private String featureCode;
    
    @Column(name = "FTR_DESC")
    private String featureDesc;
    
    @Column(name = "ENB_FLG")
    private String enable_flag;
    
    public String getVIN() {
		return VIN;
	}

	public void setVIN(String vIN) {
		VIN = vIN;
	}

	public Date getActivatedDate() {
		return activatedDate;
	}

	public void setActivatedDate(Date activatedDate) {
		this.activatedDate = activatedDate;
	}

	public Date getDeActivatedDate() {
		return DeActivatedDate;
	}

	public void setDeActivatedDate(Date deActivatedDate) {
		DeActivatedDate = deActivatedDate;
	}

	public String getFeatureCode() {
		return featureCode;
	}

	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}

	public String getFeatureDesc() {
		return featureDesc;
	}

	public void setFeatureDesc(String featureDesc) {
		this.featureDesc = featureDesc;
	}

	public String getEnable_flag() {
		return enable_flag;
	}

	public void setEnable_flag(String enable_flag) {
		this.enable_flag = enable_flag;
	}
}
