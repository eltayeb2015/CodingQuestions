package coding;

public class FindTargetPosition {

		public static void main(String args[]) {
			int arr[] = {2,4,5,5,5,5,11,8,9};
			int t = 9;
			int pos[]= {-1, -1};
	
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==t) {
					if (pos[0]==-1) {pos[0] = i; pos[1]=i;}
					else
						pos[1]=i++;				
				}
			}
			
			System.out.println(pos[0]+","+pos[1]);
			
			
			int res[] = getMax(arr, -1);
			System.out.println(res[0] +" index is: "+res[1]);
			
			
		}
		
		static int[] getMax(int[] arr, int f){
			int max=arr[0];
			int x=-1;
			for(int i=0; i<arr.length; i++) {
				max = Math.max(max, arr[i]);
				if(max==arr[i])x=i;
			}
			int [] res = {max, x};
			return res;
		}
}
