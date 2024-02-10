package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class ProceduralDataDTO extends AbstractDatasetLeafDTO{
    private static final String SENDER_IK = "ik_absender";
    private static final String RECIPIENT_IK = "ik_empfaenger";
    private static final String CREATION_DATE = "erstellungsdatum";
    private static final String CREATION_TIME = "erstellungszeit";
    private static final String ORDER_NUMBER = "dateinummer";
    private static final String PROCESS_INDICATOR = "verfahrenskennzeichen";
    private static final String TA_VERSION = "verfahrenskennzeichen";

    private LeafDTO sender_ik;
    private LeafDTO recipient_ik;
    private LeafDTO creation_date;
    private LeafDTO creation_time;
    private LeafDTO order_number;
    private LeafDTO process_indicator;
    private LeafDTO ta_version;


    public LeafDTO getSender_ik() {
        return this.sender_ik;
    }

    public ProceduralDataDTO setSender_ik(String sender_ik) {
        this.sender_ik = new LeafDTO(SENDER_IK, sender_ik);
        return this;
    }

    public LeafDTO getRecipient_ik() {
        return this.recipient_ik;
    }

    public ProceduralDataDTO setRecipient_ik(String recipient_ik) {
        this.recipient_ik = new LeafDTO(RECIPIENT_IK, recipient_ik);
        return this;
    }

    public LeafDTO getCreation_date() {
        return this.creation_date;
    }

    public ProceduralDataDTO setCreation_date(String creation_date) {
        this.creation_date = new LeafDTO(CREATION_DATE, creation_date);
        return this;
    }

    public LeafDTO getCreation_time() {
        return this.creation_time;
    }

    public ProceduralDataDTO setCreation_time(String creation_time) {
        this.creation_time = new LeafDTO(CREATION_TIME, creation_time);
        return this;
    }

    public LeafDTO getOrder_number() {
        return this.order_number;
    }

    public ProceduralDataDTO setOrder_number(String order_number) {
        this.order_number = new LeafDTO(ORDER_NUMBER, order_number);
        return this;
    }

    public LeafDTO getProcess_indicator() {
        return this.process_indicator;
    }

    public ProceduralDataDTO setProcess_indicator(String process_indicator) {
        this.process_indicator = new LeafDTO(PROCESS_INDICATOR, process_indicator);
        return this;
    }

    public LeafDTO getTa_version() {
        return this.ta_version;
    }

    public ProceduralDataDTO setTa_version(String ta_version) {
        this.ta_version = new LeafDTO(TA_VERSION, ta_version);
        return this;
    }

}
