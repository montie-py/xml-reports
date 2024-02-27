package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class DiagnoseDTO extends AbstractDatasetLeafDTO{
    private static final String ICD = "mdk3:ICD";
    private static final String LOCALIZATION = "mdk3:Lokalisation";
    private static final String ICD_VERSION = "mdk3:ICD_Version";
    private static final String PLAIN_TEXT = "mdk3:Klartext";

    private LeafDTO icd;
    private LeafDTO localization;
    private LeafDTO icdVersion;
    private LeafDTO plainText;


    public LeafDTO getIcd() {
        return this.icd;
    }

    public DiagnoseDTO setIcd(String icd) {
        this.icd = new LeafDTO(ICD, icd);
        return this;
    }

    public LeafDTO getLocalization() {
        return this.localization;
    }

    public DiagnoseDTO setLocalization(String localization) {
        this.localization = new LeafDTO(LOCALIZATION, localization);
        return this;
    }

    public LeafDTO getIcdVersion() {
        return this.icdVersion;
    }

    public DiagnoseDTO setIcdVersion(String icdVersion) {
        this.icdVersion = new LeafDTO(ICD_VERSION, icdVersion);
        return this;
    }

    public LeafDTO getPlainText() {
        return this.plainText;
    }

    public DiagnoseDTO setPlainText(String plainText) {
        this.plainText = new LeafDTO(PLAIN_TEXT, plainText);
        return this;
    }

}
