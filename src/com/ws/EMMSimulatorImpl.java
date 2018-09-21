package com.ws;

import java.math.BigDecimal;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.jws.WebResult;
import javax.jws.WebService;
import org.apache.log4j.Logger;
import javax.xml.rpc.ServiceException;

//Service Implementation
@WebService(endpointInterface = "com.ws.EMMSimulator", targetNamespace = "")
public class EMMSimulatorImpl implements EMMSimulator {

	final static Logger logger = Logger.getLogger(EMMSimulatorImpl.class);
	
	@Override
	@WebResult(name = "result", targetNamespace = "http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local")
	public String reserveAmount(String endUserIdentifier, BigDecimal amount, String billingText) throws ServiceException {
		logger.info("Called reserveAmount, endUserIdentifier: " + endUserIdentifier + " amount: " + amount + " billingText: " + billingText);
		verifyBillingText(billingText);
		String[] fields = billingText.split("#");
		return fields[0];  // Returns transactionID parameter in billingText
	}
	
	@Override
	public void chargeReservation(String reservationIdentifier, BigDecimal amount, String billingText, String referenceCode) throws ServiceException  {
		logger.info("Called chargeReservation, reservationIdentifier: " + reservationIdentifier + " amount: " + amount + " billingText: " + billingText + " referenceCode: " + referenceCode);
		verifyBillingText(billingText);
	}
	
	@Override
	public void releaseReservation(String reservationIdentifier) {
		logger.info("Called releaseReservation, reservationIdentifier: " + reservationIdentifier);
	}
	
	@Override
	public void refundAmount(String endUserIdentifier, BigDecimal amount, String billingText, String referenceCode) throws ServiceException {
		logger.info("Called refundAmount, endUserIdentifier: " + endUserIdentifier + " amount: " + amount + " billingText: " + billingText + " referenceCode: " + referenceCode);
		verifyBillingText(billingText);
	}
	
	@Override
	public void chargeAmount(String endUserIdentifier, BigDecimal amount, String billingText, String referenceCode) throws ServiceException {
		logger.info("Called chargeAmount, endUserIdentifier: " + endUserIdentifier + " amount: " + amount + " billingText: " + billingText + " referenceCode: " + referenceCode);
		verifyBillingText(billingText);
	}
	
	/**
	 * Checks for error cases for the billing text.
	 * 
	 * @param billingText
	 * @throws ServiceException 
	 */
	public void verifyBillingText(String billingText) throws ServiceException {
		String[] fields = billingText.split("#");
		// Checks if the billingText has the 14 mandatory parameters
		if (fields.length != 14) {
			throw new ServiceException("Error Code: EMM0010 Error Message: Number of fields not matching in billingText");
		}
		// Checks if the timestamp is in ISO8601 format 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
		try {
			// fields[1] contains the timestamp
			Date result = dateFormat.parse(fields[1]);
		} catch (ParseException e) {
			throw new ServiceException("Error Code: EMM0012 Error Message: DateTime format is not correct in billingText");
		}
		// Checks if the mandatory parameters (Product ID/ProductName/TransactionDescription/ProductCategoryCode/ContentProvider)
		// is contained in the billingText
		if (fields[2].equals("") || fields[3].equals("") || fields[4].equals("") || fields[5].equals("") || fields[7].equals("")) {
			throw new ServiceException("Error Code: EMM0011 Error Message: Missing mandatory parameter (ProductID/ProductName/TransactionDescription/ProductCategoryCode/ContentProvider) does not not exist in billingText");
		}
	}
	
}
