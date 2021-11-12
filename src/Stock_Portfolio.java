
import java.util.ArrayList;
import java.util.Scanner;

public class Stock_Portfolio {

    /*
    *
    * Creating arrayList of stocks
    * */
    ArrayList<Stock> portfolio = new ArrayList<Stock>();
    Stock obj = new Stock();                //creating object of stock class
    static Stock_Portfolio obj1 = new Stock_Portfolio();
    /*
    * menu() method to display which transaction that user want to do
    * */
    static void menu(){
        System.out.println("Enter 1 for Adding Stock to Portfolio");
        System.out.println("Enter 2 To view Portfolio");
        System.out.println("Enter 3 to Exit ");
    }
    /*
    * addStock() method to add object of stock to arrayList()
    * */
    void addStock(Stock c){
        portfolio.add(c);
    }

    /*
    * printPortfolio() method to print all the stock objects present in arraylist
    * */
    public void printPortfolio(){
        for(int i=0;i<=portfolio.size()-1;i++){
            System.out.println(portfolio.get(i));
        }
    }

/*
* main() method of the class
* */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stock_Portfolio obj =new Stock_Portfolio();
        System.out.println("Enter no of Stocks to Enter");

        menu();                                  //Calling menu() method.
        int b = sc.nextInt();                   //taking user input from the user which transaction that user want to do
        while(b !=3)
        {
            if (b == 1)
            {
                System.out.println(" Enter Sock Name");
                String name = sc.next();
                System.out.println(" Enter No of Share You Buy");
                int number = sc.nextInt();
                System.out.println(" Enter value of Each share");
                int value = sc.nextInt();

                int total_value_of_Share = number*value;
                int total_Portfolio_value = total_value_of_Share+total_value_of_Share;
                obj.addStock(new Stock(name,number,value,total_value_of_Share,total_Portfolio_value));
            }
            else if (b==2)
            {
                Stock obj1 = new Stock();
                obj.printPortfolio();
            }
            menu();
            b= sc.nextInt();
        }
    }
}
