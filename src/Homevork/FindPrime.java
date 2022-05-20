package Homevork;

public class FindPrime {

    public static void main(String args[]) {

  int num;
  boolean isprime;
  num=14;
    if (num<2)isprime=false;
    else isprime=true;
    for (int i=2;i<=num/i;i++){
    if ((num%i)==0){
    isprime=false;
    break;
    }

      }
if (isprime) System.out.println("prastoe chislo");

   else System.out.println("ne prastoe chislo");

}
    }