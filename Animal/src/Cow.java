
public class Cow extends Mammal
	{
		
		protected void makesNoise(){
			System.out.println("WOOOOOOOOOOOOOOOOO~~~");
		}

		@Override
		protected void eats()
			{
				System.out.println("Three times a day");
				
			}
		
		public Cow(String n, String f){
			name = n;
			food = f;
		}

	}
