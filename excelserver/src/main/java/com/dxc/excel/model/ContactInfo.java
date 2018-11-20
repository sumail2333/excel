package com.dxc.excel.model;

public class ContactInfo {
    private String partyMemberName;

    private Integer partyMemberCategory;

    private String partyMemberIdcard;

    private String partyMemberMail;

    private String partyMemberNumber;

    private String partyMemberAlipayAccount;

    private String partyMemberWechatAccount;

    public String getPartyMemberName() {
        return partyMemberName;
    }

    public void setPartyMemberName(String partyMemberName) {
        this.partyMemberName = partyMemberName == null ? null : partyMemberName.trim();
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

    public String getPartyMemberMail() {
        return partyMemberMail;
    }

    public void setPartyMemberMail(String partyMemberMail) {
        this.partyMemberMail = partyMemberMail == null ? null : partyMemberMail.trim();
    }

    public String getPartyMemberNumber() {
        return partyMemberNumber;
    }

    public void setPartyMemberNumber(String partyMemberNumber) {
        this.partyMemberNumber = partyMemberNumber == null ? null : partyMemberNumber.trim();
    }

    public String getPartyMemberAlipayAccount() {
        return partyMemberAlipayAccount;
    }

    public void setPartyMemberAlipayAccount(String partyMemberAlipayAccount) {
        this.partyMemberAlipayAccount = partyMemberAlipayAccount == null ? null : partyMemberAlipayAccount.trim();
    }

    public String getPartyMemberWechatAccount() {
        return partyMemberWechatAccount;
    }

    public void setPartyMemberWechatAccount(String partyMemberWechatAccount) {
        this.partyMemberWechatAccount = partyMemberWechatAccount == null ? null : partyMemberWechatAccount.trim();
    }
}