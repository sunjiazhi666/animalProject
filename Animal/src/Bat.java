
public class Bat extends Mammal
	{
		
		protected void makesNoise(){
			System.out.println("A");
		}

		@Override
		protected void eats()
			{
				System.out.println("A");
				
			}
		public Bat(String n, String f){
			name = n;
			food = f;
		}

	}
