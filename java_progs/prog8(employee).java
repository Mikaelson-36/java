import java.util.Scanner;
class Employee
{
String Emp_name;
int Emp_id;
String Address;
String Mail_id;
int Mobile_no;
void display()
{System.out.println("Employee name: "+Emp_name);
System.out.println("Address: "+Address);
System.out.println("Employee id: "+Emp_id);
System.out.println("Email-id: "+Mail_id);
System.out.println("Mobile number: "+Mobile_no);
}
}
class Programmer extends Employee
{
double bp;
void display(){
double da=0.97*bp;
double hra=0.10*bp;
double pf=0.12*bp;
double scf=0.001*bp;
double gross=bp+da+hra+pf+scf;
double net=gross-pf-scf;
System.out.println("Basic: "+bp);
System.out.println("DA: "+da);
System.out.println("HRA: "+hra);
System.out.println("PF: "+pf);
System.out.println("SATFF CLUD FUND: "+scf);
System.out.println("Gross Salary: "+gross);
System.out.println("Net Salary: "+net);
}
}
class AssistantProfessor extends Employee
{
double bp;
void display(){
double da=0.97*bp;
double hra=0.10*bp;
double pf=0.12*bp;
double scf=0.001*bp;
double gross=bp+da+hra+pf+scf;
double net=gross-pf-scf;System.out.println("Basic: "+bp);
System.out.println("DA: "+0.97*bp);
System.out.println("HRA: "+0.10*bp);
System.out.println("PF: "+0.12*bp);
System.out.println("SATFF CLUD FUND: "+0.001*bp);
System.out.println("Gross Salary: "+gross);
System.out.println("Net Salary: "+net);
}
}
class AssociateProfessor extends Employee{
double bp;
void display(){
double da=0.97*bp;
double hra=0.10*bp;
double pf=0.12*bp;
double scf=0.001*bp;
double gross=bp+da+hra+pf+scf;
double net=gross-pf-scf;
System.out.println("Basic: "+bp);
System.out.println("DA: "+0.97*bp);
System.out.println("HRA: "+0.10*bp);
System.out.println("PF: "+0.12*bp);
System.out.println("SATFF CLUD FUND: "+0.001*bp);
System.out.println("Gross Salary: "+gross);
System.out.println("Net Salary: "+net);
}
}
class Professor extends Employee
{
double bp;
void display(){
double da=0.97*bp;
double hra=0.10*bp;
double pf=0.12*bp;double scf=0.001*bp;
double gross=bp+da+hra+pf+scf;
double net=gross-pf-scf;
System.out.println("Basic: "+bp);
System.out.println("DA: "+0.97*bp);
System.out.println("HRA: "+0.10*bp);
System.out.println("PF: "+0.12*bp);
System.out.println("SATFF CLUB FUND: "+0.001*bp);
System.out.println("Gross Salary: "+gross);
System.out.println("Net Salary: "+net);
}
}
class Payslip
{
public static void main(String args[]){
System.out.println("\n1.Programmer\n2.AssistantProfessor\n3.AssociateProfessor\
n4.Professor");
Scanner input=new Scanner(System.in);
System.out.print("Enter an integer(1-4): ");
int ch=input.nextInt();
System.out.println();
System.out.println("-----------Payslip-----------");
System.out.println();
switch (ch) {
case 1:
Employee e1=new Employee();
Programmer p1=new Programmer();
e1.Emp_name="Ramu";
e1.Address="y-city";
e1.Mail_id="ramu@gmail.com";
e1.Emp_id=567;
e1.Mobile_no=2345678;
p1.bp=15000;
e1.display();
p1.display();
break;
case 2:
Employee e2=new Employee();
AssistantProfessor p2=new AssistantProfessor();
e2.Emp_name="Raju";e2.Address="A-city";
e2.Mail_id="raju@gmail.com";
e2.Emp_id=123;
e2.Mobile_no=987321;
p2.bp=20000;
e2.display();
p2.display();
break;
case 3:
Employee e3=new Employee();
AssociateProfessor p3=new AssociateProfessor();
e3.Emp_name="Giri";
e3.Address="B-city";
e3.Mail_id="giri@gmail.com";
e3.Emp_id=456;
e3.Mobile_no=98710;
p3.bp=30000;
e3.display();
p3.display();
break;
case 4:
Employee e4=new Employee();
Professor p4=new Professor();
e4.Emp_name="mohan";
e4.Address="Y-Junction";
e4.Mail_id="mohan@gmail.com";
e4.Emp_id=789;
e4.Mobile_no=9810;
p4.bp=40000;
e4.display();
p4.display();
break;
default:
System.out.println("enter correct choice");
}}
}
