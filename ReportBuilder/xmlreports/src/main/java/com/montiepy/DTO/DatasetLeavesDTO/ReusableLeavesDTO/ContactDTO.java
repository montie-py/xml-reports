package com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO;

import com.montiepy.DTO.DatasetLeavesDTO.AbstractDatasetLeafDTO;
import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class ContactDTO extends AbstractDatasetLeafDTO{
    private static final String PHONE = "mdk2:Telefon";
    private static final String FAX = "mdk2:Telefax";
    private static final String MOBILE = "mdk2:Mobiltelefon";
    private static final String EMAIL = "mdk2:Email";

    private LeafDTO phone;
    private LeafDTO fax;
    private LeafDTO mobile;
    private LeafDTO email;


    public LeafDTO getPhone() {
        return this.phone;
    }

    public ContactDTO setPhone(String phone) {
        this.phone = new LeafDTO(PHONE, phone);
        return this;
    }

    public LeafDTO getFax() {
        return this.fax;
    }

    public ContactDTO setFax(String fax) {
        this.fax = new LeafDTO(FAX, fax);
        return this;
    }

    public LeafDTO getMobile() {
        return this.mobile;
    }

    public ContactDTO setMobile(String mobile) {
        this.mobile = new LeafDTO(MOBILE, mobile);
        return this;
    }

    public LeafDTO getEmail() {
        return this.email;
    }

    public ContactDTO setEmail(String email) {
        this.email = new LeafDTO(EMAIL, email);
        return this;
    }

}
