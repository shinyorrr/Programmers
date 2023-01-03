package level2;

public class Jump {

	public static Long main(String[] args) {
		int n = 4;
		long answer = 0;
        int arr[] ={2 , 1};
        for(int i =3; i<=n; i++){
            arr[i%2]= (arr[0]+arr[1])%1234567;        
        }
        answer = arr[n%2];
        return answer;

		
	}

}
