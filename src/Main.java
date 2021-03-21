
public class Main {
	public static void main(String[] args){
		
		Matnumbers NewArray = new Matnumbers ();
		
		int[]ar= NewArray.makeArray(99);
//		
//		for (int s:ar) {
//			 System.out.println (s);
//		 }
		
		int[]ar2=NewArray.shuffleArray(ar);
		
		for (int s:ar) {
			 System.out.println (s);
		 }
		
}
}