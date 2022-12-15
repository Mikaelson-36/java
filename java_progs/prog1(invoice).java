import java.io.*;
class Invoice
{
String partnumber;
String partdescription;
int numofitems;
double priceofitems;
double amount;
Invoice()
{
partnumber="321";
partdescription="case";
numofitems=1;
priceofitems=1000;}
public String getpartnumber()
{
return partnumber;
}
public String getpartdescription()
{
return partdescription;
}
public int getnumofitems()
{
return numofitems;
}
public double getpriceofitems()
{
return priceofitems;
}
public void setpartnumber(String num)
{
partnumber=num;
}
public void setpartdescription(String des)
{
partdescription=des;}
public void setnumofitems(int numitem)
{
numofitems=numitem;
}
public void setpriceofitems(double price )
{
priceofitems=price;
}
public double Invoiceamount()
{
amount = priceofitems*numofitems;
amount = (amount>0)?amount:0;
return amount;
}
public void displayInfo()
{
System.out.println("part number: "+partnumber);
System.out.println("part description: "+partdescription);
System.out.println("number_of_items: "+numofitems);
System.out.println("price_of_items: "+priceofitems);
System.out.println("\n Invoice Amount :"+amount);
System.out.println("---------------------------------------");
}
}public class InvoiceTest
{
public static void main(String [] args)throws IOException
{
Invoice inv1 = new Invoice();
Invoice inv2 = new Invoice();
inv1.getpartnumber();
inv1.getpartdescription();
inv1.getnumofitems();
inv1.getpriceofitems();
inv1.Invoiceamount();
inv1.displayInfo();
inv2.setpartnumber("1");
inv2.setpartdescription("chip");
inv2.setnumofitems(12);
inv2.setpriceofitems(12);
inv2.Invoiceamount();
inv2.displayInfo();
}
}
