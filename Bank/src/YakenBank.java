import java.util.Scanner;
public class YakenBank {
    
    String FirstName;
    String LastName;
    int NumAcount;
    double Balence;
    
    public YakenBank(String FN,String LN,int NA,double B)
    {
    this.FirstName =FN;
    this.LastName = LN;
    this.NumAcount =NA;
    this.Balence =B;
    }
    
    public void mnue()
    {
        do{
    System.out.print("---------------------------\n");
    System.out.print("      Welcome To Bank      \n");
    System.out.print("---------------------------\n");
    System.out.print("1)About Castamer           \n");
    System.out.print("2)Balance Withdrawa        \n");
    System.out.print("3)Balance Add              \n");
    System.out.print("---------------------------\n");
    System.out.print("------ Choise Num ---------\n");
    
    
    Scanner input =new Scanner(System.in);
    int Select =input.nextInt();
    switch(Select)
    {
        case 1 :
            View();
            break;
        case 2 :
            Balance_Withdrawa();
            break;
        case 3 :
            Balance_Add();
            break;
        default :
            System.out.print("\nYour Chiose Wrong");
            break;  
    }
     }while(true);
    }
    public void View()
    {
    System.out.printf("\nFirst Nmae :%s \nLastName : %s \nAcount Number :%d \nBalance : %f"
            ,FirstName,LastName,NumAcount,Balence);
    }
    public void Balance_Withdrawa()
    {
    Scanner input =new Scanner(System.in);
    System.out.printf("\nThe Balance is :",Balence);
    System.out.print("\nEnter How Many Want :");
    double Withdrawa=input.nextDouble();
    if(Withdrawa >200)
    {
    System.out.printf("\nYou donot Have This Balence :%f",Withdrawa);
    }else
    {
     Balence=Balence-Withdrawa;
     System.out.printf("\nSucsess Withdrawa:%f",Balence);
    } 
    
    }
    
    public void Balance_Add()
    {
    Scanner input =new Scanner(System.in);
    System.out.printf("\nThe Balance is :",Balence);
    System.out.print("\nEnter How Many Want Add :");
    double Add=input.nextDouble();
    System.out.printf("\nThe Add Money is :%f",Add);
    Balence =Balence+Add;
    System.out.printf("\nThe Your Balence Now is :%f",Balence);
    
    
    }
    
}
