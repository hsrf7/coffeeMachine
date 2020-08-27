/*
Responsibility of this class is to provide functionality ffor an outlet
1. Create a beveraage :- this is synchronized as at a time only one thread can handle the ingridients to provide consistency
2. serve the beverage
3. setBeverage :- used to define whihc beverage user wants.
*/

public class Outlet implements Runnable {
    private Thread t;
    private String threadName;
    private String beverageType =  "";
    private String beverageStatus =  "";
    private BeverageFactory beverageFactory ;
    private boolean isRunning;
    
    Outlet( String name) {
        beverageFactory = new BeverageFactory();
        beverageType = "";
        isRunning = false;
       threadName = name;
       start();
    }

    // create a beverage and serve it
    public String setBeverage(String type) {
        beverageType = type;
        isRunning = true;
        run();
        isRunning = false;

        return beverageStatus;
    }
    
    public boolean isRunning()
    {
        return isRunning;
    }

    public void run() {
        if(beverageType != "")
        {
            Beverage beverage = null;

            // to provide consistency 
            synchronized(this)
            {
                // creates the bevergae instance and gets ingridients that's why synchronzed to avoid multiple outlets tking same ingridient at same time
                beverage =  beverageFactory.createBeverage(beverageType);
            }

            // get beverage sataus
            if(beverage !=  null)
                beverageStatus = beverage.serve();
        }
    }
    
    private void start () {
       System.out.println("Starting " +  threadName );
       if (t == null) {
          t = new Thread (this, threadName);
          t.start ();
       }
    }
    
 }