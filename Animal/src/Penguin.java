
public class Penguin extends Bird
	{
		protected void makesNoise(){
			System.out.println("WOOOOOOOOO~~~");
		}

		
		protected void eats()
			{
				System.out.println("Three times a day");
				
			}
		public Penguin(String n, String f){
			name = n;
			food = f;
		}

	}
