package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class DelayDTO extends AbstractDatasetLeafDTO{
    private static final String REASON = "Grund";
    private static final String COMMENT = "Erlaueterung";
    private static final String DATE = "Datum";
    private static final String TIME = "Uhrzeit";
    private static final String ADDRESS = "Strasse_Hausnummer";
    private static final String ZIP = "PLZ";
    private static final String CITY = "Ort";

    private LeafDTO reason;
    private LeafDTO comment;
    private LeafDTO date;
    private LeafDTO time;
    private LeafDTO address;
    private LeafDTO zip;
    private LeafDTO city;


    public LeafDTO getReason() {
        return this.reason;
    }

    public DelayDTO setReason(String reason) {
        this.reason = new LeafDTO(REASON, reason);
        return this;
    }

    public LeafDTO getComment() {
        return this.comment;
    }

    public DelayDTO setComment(String comment) {
        this.comment = new LeafDTO(COMMENT, comment);
        return this;
    }

    public LeafDTO getDate() {
        return this.date;
    }

    public DelayDTO setDate(String date) {
        this.date = new LeafDTO(DATE, date);
        return this;
    }

    public LeafDTO getTime() {
        return this.time;
    }

    public DelayDTO setTime(String time) {
        this.time = new LeafDTO(TIME, time);
        return this;
    }

    public LeafDTO getAddress() {
        return this.address;
    }

    public DelayDTO setAddress(String address) {
        this.address = new LeafDTO(ADDRESS, address);
        return this;
    }

    public LeafDTO getZip() {
        return this.zip;
    }

    public DelayDTO setZip(String zip) {
        this.zip = new LeafDTO(ZIP, zip);
        return this;
    }

    public LeafDTO getCity() {
        return this.city;
    }

    public DelayDTO setCity(String city) {
        this.city = new LeafDTO(CITY, city);
        return this;
    }

}
