
public class Prime {
	public static void main(java.lang.String[] args) {	
		for(int i=1;i<=101;i++){
			boolean prime = true;
			for(int j=2;j<=i/2;j++){
				if((float)i/j==i/j){
					prime = false;
					break;
				}
			}
			if(prime){
				System.out.println(i);
			}
		}
	}
}
