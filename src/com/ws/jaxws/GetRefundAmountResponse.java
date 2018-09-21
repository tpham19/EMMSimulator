package com.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "refundAmountResponse", namespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundAmountResponse", namespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
public class GetRefundAmountResponse {

    @XmlElement(name = "", namespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
    private String _return;

    /**
     * 
     * @return
     *     returns String
     */
    public String getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(String _return) {
        this._return = _return;
    }

}
