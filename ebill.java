/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labexercise2;

/**
 *
 * @author priyadharshini
 */
public class ebill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        electricBill b=new electricBill();
        b.input_data();
        b.Calculate_bill();
        b.display();
                
        // TODO code application logic here
    }
    
}
class electricBill
        {
    int consumernum;
    String consumername;
    int prevreading;
    int currreading;
    String EBconn;
    double bill;
    void input_data()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter constumer no:");
        consumernum=sc.nextInt();
        System.out.println("enter teh consumer name:");
        consumername=sc.next();
        System.out.println("enter the previous units:");
        prevreading=sc.nextInt();
        System.out.println("enter the current units:");
        currreading=sc.nextInt();
        System.out.println("enter teh types of EB connections(domestic & commercial)");
        EBconn=sc.next();
    }
    double Calculate_bill()
    {
        int choice;
        if(EBconn=="domestic")
            choice=1;
        else
            choice=2;
    
    }    

