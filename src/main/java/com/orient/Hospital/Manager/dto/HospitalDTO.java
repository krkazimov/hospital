package com.orient.Hospital.Manager.dto;

import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class HospitalDTO {
@NotNull(message = "Xestexana adini bos qoyma")
    private String hospitalName;
@NotNull(message = "xestexana haqqinda melumat daxil edin")
@Length(max = 500 , message = "max uzunluq 500 simvoldan yuxari olmalidir")
    private String hospitalInfo;
    private String hospitalLogo;

    public HospitalDTO(@NotNull(message = "Xestexana adini bos qoyma") String hospitalName, @NotNull(message = "xestexana haqqinda melumat daxil edin") String hospitalInfo, String hospitalLogo) {
        this.hospitalName = hospitalName;
        this.hospitalInfo = hospitalInfo;
        this.hospitalLogo = hospitalLogo;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalInfo() {
        return hospitalInfo;
    }

    public void setHospitalInfo(String hospitalInfo) {
        this.hospitalInfo = hospitalInfo;
    }

    public String getHospitalLogo() {
        return hospitalLogo;
    }

    public void setHospitalLogo(String hospitalLogo) {
        this.hospitalLogo = hospitalLogo;
    }

}
