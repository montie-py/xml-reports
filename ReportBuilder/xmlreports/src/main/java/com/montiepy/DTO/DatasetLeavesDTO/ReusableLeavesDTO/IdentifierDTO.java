package com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO;

import com.montiepy.DTO.DatasetLeavesDTO.AbstractDatasetLeafDTO;
import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class IdentifierDTO extends AbstractDatasetLeafDTO {
    private static final String IK = "mdk2:IK";
    private static final String BSNR = "mdk2:BSNR";
    private static final String LANR = "mdk2:BSNR";
    private static final String DENTIST_NUMBER = "mdk2:BSNR";
    private static final String KZV_AREA = "mdk2:BSNR";

    private LeafDTO ik;
    private LeafDTO bsnr;
    private LeafDTO lanr;
    private LeafDTO dentistNumber;
    private LeafDTO kzvArea;


    public LeafDTO getIk() {
        return this.ik;
    }

    public IdentifierDTO setIk(String ik) {
        this.ik = new LeafDTO(IK, ik);
        return this;
    }

    public LeafDTO getBsnr() {
        return this.bsnr;
    }

    public IdentifierDTO setBsnr(String bsnr) {
        this.bsnr = new LeafDTO(BSNR, bsnr);
        return this;
    }

    public LeafDTO getLanr() {
        return this.lanr;
    }

    public IdentifierDTO setLanr(String lanr) {
        this.lanr = new LeafDTO(LANR, lanr);
        return this;
    }

    public LeafDTO getDentistNumber() {
        return this.dentistNumber;
    }

    public IdentifierDTO setDentistNumber(String dentistNumber) {
        this.dentistNumber = new LeafDTO(DENTIST_NUMBER, dentistNumber);
        return this;
    }

    public LeafDTO getKzvArea() {
        return this.kzvArea;
    }

    public IdentifierDTO setKzvArea(String kzvArea) {
        this.kzvArea = new LeafDTO(KZV_AREA, kzvArea);
        return this;
    }

}
