import java.util.Scanner;

public class assin {
    public static void main(String[]args){


System.out.println("enter the value of M" );
Scanner sc= new Scanner(System.in);
int M = sc.nextInt();
        sc.close();

if(M%3==0 && M%5==0)
{
System.out.println("Good Number");


}
else if(M%3==0&&M%5!=0){

    System.out.println("Bad Number");
}
    if(M%5==0&&M%3!=0){
System.out.println("Poor Number");
 }



else{

    System.out.println("-1");

}

    }
}
