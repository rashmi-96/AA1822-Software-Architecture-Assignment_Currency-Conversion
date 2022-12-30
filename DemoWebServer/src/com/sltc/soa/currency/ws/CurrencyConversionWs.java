package com.sltc.soa.currency.ws;

import com.sltc.soa.currency.service.CurrencyConversionService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;


@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class CurrencyConversionWs {

    @WebMethod
    public double convert(double amountInSourceCurrency, String sourceCurrency, String targetCurrency) {
        CurrencyConversionService service = new CurrencyConversionService();
        return service.convert(amountInSourceCurrency, sourceCurrency, targetCurrency);
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/CurrencyConversionService", new CurrencyConversionWs());
        System.out.println("*** Server is started ***");
    }
}