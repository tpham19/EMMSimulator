package com.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "reserveAmount", namespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserveAmount", namespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
public class GetReserveAmount {

    @XmlElement(name = "endUserIdentifier", namespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
    private String endUserIdentifier;
    @XmlElement(name = "amount", namespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
    private int amount;
    @XmlElement(name = "billingText", namespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
    private String billingText;
    
	public String getEndUserIdentifier() {
		return endUserIdentifier;
	}
	
	public void setEndUserIdentifier(String endUserIdentifier) {
		this.endUserIdentifier = endUserIdentifier;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getBillingText() {
		return billingText;
	}
	
	public void setBillingText(String billingText) {
		this.billingText = billingText;
	}
   
}
