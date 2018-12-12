
public class Robin extends Bird
	{
		protected void makesNoise(){
			System.out.println("A");
		}

		@Override
		protected void eats()
			{
				System.out.println("A");
				
			}
		public Robin(String n, String f){
			name = n;
			food = f;
		}


	}
