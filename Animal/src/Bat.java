
public class Bat extends Mammal
	{
		
		protected void makesNoise(){
			System.out.println("WOOOOOOOOO~~~");
		}

		@Override
		protected void eats()
			{
				System.out.println("Three times a day");
				
			}
		public Bat(String n, String f){
			name = n;
			food = f;
		}

	}
