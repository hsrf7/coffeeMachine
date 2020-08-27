/*

This is the main class for interaction, it creates the outlets and does the input and output

*/

import java.io.*;

public class ChaiPoint {

    public static void main(String[] args) {

        IngridientObserver ingridientObserver = new IngridientObserver();

        Outlet outlet1 = new Outlet("1");
        Outlet outlet2 = new Outlet("2");
        Outlet outlet3 = new Outlet("3");
        Outlet outlet4 = new Outlet("4");


        try  
        {  
            File file=new File("FunctionalTests");    //creates a new file instance  
            FileReader fr=new FileReader(file);   //reads the file  
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  

            BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("Output")));

            StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
            String line;  
            line = br.readLine();



            /*
                Since, we are assuming that all beverages tqkke same time then, the outlets workk sequentially.
                After serving all the outlets the indicator shows whihc all ingridients are running low

                user can refill the ingridients, ingridient provides a confirmation that ingridient is re-filled and shows if any other ingridients are running low.
            */
            while(true)  
            { 

                if(line == null) break;
                
                if(line.equals("Beverage"))
                {
                    line = br.readLine();
                    sb.append("Outlet1: " +  outlet1.setBeverage(line) + '\n');
                    line = br.readLine();
                }

                if(line!=null && line.equals("Beverage"))
                {
                    line = br.readLine();
                    sb.append("Outlet2: " +   outlet2.setBeverage(line) + '\n' );
                    line = br.readLine();
                }


                if(line!=null && line.equals("Beverage"))
                {
                    line = br.readLine();
                    sb.append("Outlet3: " +   outlet3.setBeverage(line)  + '\n');
                    line = br.readLine();
                }
                
                if(line!=null && line.equals("Beverage"))
                {
                    line = br.readLine();
                    sb.append("Outlet4: " +   outlet4.setBeverage(line)  + '\n');
                    line = br.readLine();
                }
                
                sb.append("\n");

                // indicate the ingridients running low
                StringBuffer sbi = ingridientObserver.displayLowIngridients();
                sb.append(sbi);

                // refill ingridients
                if(line!=null && line.equals("re fill"))
                {
                    line = br.readLine();
                    String type = line;

                    line = br.readLine();
                    int quant = Integer.parseInt(line);

                    ingridientObserver.reFill(type, quant);

                    line = br.readLine();

                    sb.append("\n");
                    sb.append("re-filled " + type);
                    sb.append("\n");
                    StringBuffer temp = ingridientObserver.displayLowIngridients();
                    sb.append(temp);
                }
                
                sb.append("\n");     //line feed
                //write contents of StringBuffer to a file
                bwr.write(sb.toString());
                //flush the stream
                bwr.flush();

                sb.delete(0, sb.length());
            }  

            fr.close();    //closes the stream and release the resources  
            bwr.close();
        }  
        catch(IOException e)  
        {  
          e.printStackTrace();  
        }  
	}
}