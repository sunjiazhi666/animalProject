
public class Penguin extends Bird
	{
		protected void makesNoise(){
			System.out.println("A");
		}

		
		protected void eats()
			{
				System.out.println("A");
				
			}
		public Penguin(String n, String f){
			name = n;
			food = f;
		}

	}
