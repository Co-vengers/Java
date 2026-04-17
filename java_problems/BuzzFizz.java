class BuzzFizz{
		public static void main(String srgs[]){
				int i = 1;
				while(i <= 100){
						if(i % 3 == 0 & i % 5 == 0){
								System.out.println("BuzzFizz");
						}
						else if(i % 3 == 0){
								System.out.println("Fizz");
						}
						else if(i % 5 == 0){
								System.out.println("Buzz");
						}
						else
								System.out.println(i);
						i++;
				}
		}
}
