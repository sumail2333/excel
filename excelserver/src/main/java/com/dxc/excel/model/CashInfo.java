package com.dxc.excel.model;

import java.util.Date;

public class CashInfo {
    private String partyMemberDepart;

    private String partyMemberIdcard;

    private Date partyMemberInDate;

    private Date partyMemberOutDate;

    private Long partyMemberMonthlyCash;

    private Date partyMemberCashDate;

    public String getPartyMemberDepart() {
        return partyMemberDepart;
    }

    public void setPartyMemberDepart(String partyMemberDepart) {
        this.partyMemberDepart = partyMemberDepart == null ? null : partyMemberDepart.trim();
    }

    public String getPartyMemberIdcard() {
        return partyMemberIdcard;
    }

    public void setPartyMemberIdcard(String partyMemberIdcard) {
        this.partyMemberIdcard = partyMemberIdcard == null ? null : partyMemberIdcard.trim();
    }

    public Date getPartyMemberInDate() {
        return partyMemberInDate;
    }

    public void setPartyMemberInDate(Date partyMemberInDate) {
        this.partyMemberInDate = partyMemberInDate;
    }

    public Date getPartyMemberOutDate() {
        return partyMemberOutDate;
    }

    public void setPartyMemberOutDate(Date partyMemberOutDate) {
        this.partyMemberOutDate = partyMemberOutDate;
    }

    public Long getPartyMemberMonthlyCash() {
        return partyMemberMonthlyCash;
    }

    public void setPartyMemberMonthlyCash(Long partyMemberMonthlyCash) {
        this.partyMemberMonthlyCash = partyMemberMonthlyCash;
    }

    public Date getPartyMemberCashDate() {
        return partyMemberCashDate;
    }

    public void setPartyMemberCashDate(Date partyMemberCashDate) {
        this.partyMemberCashDate = partyMemberCashDate;
    }
}