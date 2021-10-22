package massiejava;
public class Cities1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//Declare and define an array
		String [] Cities = { " New york","san francisco","Miami","Dallas"};
		
				System.out.println(Cities [0] );
				System.out.println(Cities[1] );
				System.out.println(Cities[2] );
				System.out.println(Cities[3] );
				
				
				
				System.out.println();
				//declare array    {initialize object one dimensional array}
			String[] Countries ;//declaration
			//define array
			Countries =  new String [3]; //initialization
				Countries[0]= "Russia";
				Countries [1]="Zimbambwe";
				Countries [2]="Germany";
				
				System.out.println(Countries[1] );
				System.out.println();
				//define and declare the array(only the size)
				//initialize primitive one dimensional array
						String [] states = new String[6];
						states  [0] = "rostov";
						states  [1] ="omsk";
						states  [2] ="kazan";
						states  [3] ="novosibirsk";
						states  [4] ="seberia";
						states  [5] ="yekaterinburg";
						
						/*System.out.println("states[0] ");
						System.out.println(states[1] );
						System.out.println(states[2] );
						System.out.println(states[3] );
						System.out.println(states[4] );
						System.out.println(states[5] );
						*/
						
						
						
						int i =0;
						
						//do loop :enters the loop and then test the condition.
						
						do {
							
							System.out.println("states :" + states [i]);
						i = i+1;
						}while (i<=5);
						//test the condition first and enters the loop
						
						
						System.out.println();
						
						
						/* int a = 0;
						
						while(a<=5) {
							
							System.out.println("states at  :" + a +";" +states [a]);
							//a =a+1;
							a++;
						}
						
						*/
						int a = 0;
						boolean Statefound = false;
						while(Statefound) {
							
						String state = states [a];
							//a =a+1;
						System.out.println("state");
						if (state == "kazan") {
						
						System.out.println("STATE found !:");
						Statefound =true;
						}
							a++;
						}
// for loop the best structure for iliterating through a loop 
						System.out.println("printinf with for loop");
				int n;
						for(n=0;n < 5;n++) {
							
							System.out.println(states [n]);
							//n++;
						}
			}
				

		

	}


