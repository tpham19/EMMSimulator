package com.ws;

import java.math.BigDecimal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.rpc.ServiceException;


//Service Endpoint Interface
@WebService(targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public interface EMMSimulator {

	@WebMethod 
	@WebResult(name = "result", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
	String reserveAmount(@WebParam(name = "endUserIdentifier", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") String endUserIdentifier,
			@WebParam (name = "amount", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") BigDecimal amount,
			@WebParam (name = "billingText", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") String billingText) throws ServiceException;
	
	@WebMethod 
	void chargeReservation(@WebParam(name = "reservationIdentifier", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") String reservationIdentifier,
			@WebParam (name = "amount", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") BigDecimal amount,
			@WebParam (name = "billingText", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") String billingText,
			@WebParam (name = "referenceCode", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") String referenceCode) throws ServiceException;
	
	@WebMethod 
	void releaseReservation(@WebParam(name = "reservationIdentifier", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") String reservationIdentifier);
	
	@WebMethod 
	void refundAmount(@WebParam(name = "endUserIdentifier", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") String endUserIdentifier,
			@WebParam (name = "amount", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") BigDecimal amount,
			@WebParam (name = "billingText", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") String billingText,
			@WebParam (name = "referenceCode", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") String referenceCode) throws ServiceException;
	
	@WebMethod void chargeAmount(@WebParam(name = "endUserIdentifier", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") String endUserIdentifier,
			@WebParam (name = "amount", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") BigDecimal amount,
			@WebParam (name = "billingText", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") String billingText,
			@WebParam (name = "referenceCode", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local") String referenceCode) throws ServiceException;
}