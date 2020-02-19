import java.util.Scanner;
		public class MovieDriver {
			
			

			  public static void main(String[] args) {
			    
			    Scanner input = new Scanner(System.in);
			         
			            
			String reply;     
			      
			    
			    do {
			    
			      
			  
			    System.out.println(" Please enter the movie Title ");    
			    String title = input.next();   
			    
			   // System.out.println(" PG, PG13, R...");
			    //String PG = input.next();
			    
			    System.out.println(" please enter the movie’s rating");    
			    String rating = input.next();	
			    
			    System.out.println(" please enter the number of tickets sold at the theater");    
			    int TicketsSold = input.nextInt();
			    
			    Movie movieObject=new Movie(title, rating,TicketsSold);
			     System.out.println(movieObject.toString());
			           
			    
			 
			    System.out.println(" Do you wanna check (y/n) ");
			    
			    reply = input.next();
			          
			    
			    }while (reply.equals("y"));
			    
			    System.out.println(" Good bye!");
			  } 

		
		
		
	}


