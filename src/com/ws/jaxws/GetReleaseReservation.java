package com.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "releaseReservation", namespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "releaseReservation", namespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
public class GetReleaseReservation {

    @XmlElement(name = "reservationIndentifier", namespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
    private String reservationIndentifier;

	public String getReservationIndentifier() {
		return reservationIndentifier;
	}

	public void setReservationIndentifier(String reservationIndentifier) {
		this.reservationIndentifier = reservationIndentifier;
	}
    
}
