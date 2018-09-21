package com.ws.jaxws;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "reserveAmountResponse", namespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserveAmountResponse", namespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
public class GetReserveAmountResponse {

    @XmlElement(name = "result", namespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
    private String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
    

}
