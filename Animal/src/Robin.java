
public class Robin extends Bird
	{
		protected void makesNoise(){
			System.out.println("WOOOOOOOOO~~~");
		}

		@Override
		protected void eats()
			{
				System.out.println("Three times a day");
				
			}
		public Robin(String n, String f){
			name = n;
			food = f;
		}


	}
