package com.dxc.excel.model;

import java.util.Date;

public class BasicInfo {
    private Integer id;

    private String partyMemberName;

    private Integer partyMemberSex;

    private Integer partyMemberCategory;

    private String partyMemberIdcard;

    private String partyMemberCompany;

    private String partyMemberNumber;

    private String partyMemberMail;

    private String partyMemberBackupMail;

    private Date partyMemberJoinDate;

    private Date partyMemberChangeDate;

    private String partyMemberAttach;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartyMemberName() {
        return partyMemberName;
    }

    public void setPartyMemberName(String partyMemberName) {
        this.partyMemberName = partyMemberName == null ? null : partyMemberName.trim();
    }

    public Integer getPartyMemberSex() {
        return partyMemberSex;
    }

    public void setPartyMemberSex(Integer partyMemberSex) {
        this.partyMemberSex = partyMemberSex;
    }

    public Integer getPartyMemberCategory() {
        return partyMemberCategory;
    }

    public void setPartyMemberCategory(Integer partyMemberCategory) {
        this.partyMemberCategory = partyMemberCategory;
    }

    public String getPartyMemberIdcard() {
        return partyMemberIdcard;
    }

    public void setPartyMemberIdcard(String partyMemberIdcard) {
        this.partyMemberIdcard = partyMemberIdcard == null ? null : partyMemberIdcard.trim();
    }

    public String getPartyMemberCompany() {
        return partyMemberCompany;
    }

    public void setPartyMemberCompany(String partyMemberCompany) {
        this.partyMemberCompany = partyMemberCompany == null ? null : partyMemberCompany.trim();
    }

    public String getPartyMemberNumber() {
        return partyMemberNumber;
    }

    public void setPartyMemberNumber(String partyMemberNumber) {
        this.partyMemberNumber = partyMemberNumber == null ? null : partyMemberNumber.trim();
    }

    public String getPartyMemberMail() {
        return partyMemberMail;
    }

    public void setPartyMemberMail(String partyMemberMail) {
        this.partyMemberMail = partyMemberMail == null ? null : partyMemberMail.trim();
    }

    public String getPartyMemberBackupMail() {
        return partyMemberBackupMail;
    }

    public void setPartyMemberBackupMail(String partyMemberBackupMail) {
        this.partyMemberBackupMail = partyMemberBackupMail == null ? null : partyMemberBackupMail.trim();
    }

    public Date getPartyMemberJoinDate() {
        return partyMemberJoinDate;
    }

    public void setPartyMemberJoinDate(Date partyMemberJoinDate) {
        this.partyMemberJoinDate = partyMemberJoinDate;
    }

    public Date getPartyMemberChangeDate() {
        return partyMemberChangeDate;
    }

    public void setPartyMemberChangeDate(Date partyMemberChangeDate) {
        this.partyMemberChangeDate = partyMemberChangeDate;
    }

    public String getPartyMemberAttach() {
        return partyMemberAttach;
    }

    public void setPartyMemberAttach(String partyMemberAttach) {
        this.partyMemberAttach = partyMemberAttach == null ? null : partyMemberAttach.trim();
    }
}