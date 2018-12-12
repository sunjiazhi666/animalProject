
public class Cow extends Mammal
	{
		
		protected void makesNoise(){
			System.out.println("A");
		}

		@Override
		protected void eats()
			{
				System.out.println("A");
				
			}
		
		public Cow(String n, String f){
			name = n;
			food = f;
		}

	}
