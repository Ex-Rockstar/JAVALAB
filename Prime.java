import java.util.Scanner;
public class PrimeExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	int n=nextInt();
	for(int i=0;i<=n;i++){
	if(IsPrime(n)){
		System.out.print("Hiiiiiii");
	}

}
    }
public void IsPrime(int n){

	int i, m = 0, flag = 0;
        m = n / 2;
        
        if (n == 0 || n == 1) {
		System.out.println(n+"Neither Prime Nor Composite");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
            
            if (flag == 0) {
                System.out.println(n);
            }
        }
}


}
