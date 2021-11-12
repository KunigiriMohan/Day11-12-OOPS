public class Stock {
    String stock_Name;                          //Declaring instance variables
    int no_of_Stock;
    int value_of_Stock;
    int total_value_of_Stock;
    int value_of_totalStocks;

    public Stock(String name , int number , int value , int stockTotal , int totalValue ){
        this.stock_Name=name;                               //initializing instance values of class using constructor.
        this.no_of_Stock=number;
        this.value_of_Stock=value;
        this.total_value_of_Stock=stockTotal;
        this.value_of_totalStocks=totalValue;
    }
    public Stock(){             //Creating default constructor to create objects of stock class

    }

    @Override
    public String toString() {                      //overriding toString() method to print values
        return "|" +
                " |stock_Name|" + "no_of_Stock|"+"value_of_Stock"+" |" +"total_value_of_Stock| \n" +
                  " |   "+stock_Name+" | " +"    "+ no_of_Stock+"    |" +"     "+value_of_Stock+"     | " +" " +value_of_Stock+"           | " ;
    }
}
