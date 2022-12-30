package com.sltc.soa.client;
import com.sltc.soa.client.stub.CurrencyConversionWs;
import com.sltc.soa.client.stub.CurrencyConversionWsService;
import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        System.out.println("CURRENCY CONVERTER");
        System.out.println("Enter the currency types in capital format");
        System.out.println("--------------------------------------------------------");
        CurrencyConversionWsService currencyConversionWsService = new CurrencyConversionWsService();
        CurrencyConversionWs currencyConversionWs = currencyConversionWsService.getCurrencyConversionWsPort();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the currency that your amount should convert");
        String crsCurr = input.nextLine();
        double currency1 = currencyConversionWs.convert(0,"USD",crsCurr);
        System.out.println("Enter the currency you want to convert");
        String trgCurr = input.nextLine();
        double currency2 = currencyConversionWs.convert(0,trgCurr,crsCurr);

        System.out.println("Enter the amount to convert");
        double amt = input.nextDouble();
        double amount = currencyConversionWs.convert(amt,trgCurr,crsCurr);

        double convertedCurr = currency1+amount+currency2;
        System.out.println("The converted amount : " +crsCurr+ " " +convertedCurr);
    }
}