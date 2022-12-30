# Currency-Conversion
This is a Currency conversion web service created using SOAP web service.
To execute the project recommended IDE is Intelij IDE and required 1.8 JDK.
Execute the DemoWebServer initially after that run the following command in server side terminal
"wsimport.exe -keep -d ..\DemoWebServiceClient\Stub -p com.sltc.soa.client.stub http://localhost:8888/ CurrencyConversionService ?wsdl"
Then execute the client side 
