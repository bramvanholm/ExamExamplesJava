import java.util.Arrays;
public class PlayerAnalyser {
	
	public static int minGoalsScored(int[] nbGoalsScored){
		int min = Integer.MAX_VALUE;
		for(int x:nbGoalsScored){
			if(x < min){
				min = x;
			}
		}
		return min;	
	}
	
	public static int maxGoalsScored(int[] nbGoalsScored){
		int max = Integer.MIN_VALUE;
		for(int x:nbGoalsScored){
			if(x > max){
				max = x;
			}
		}
		return max;			
	}
	
	public static double meanGoalsScored(int[] nbGoalsScored){
		int sum = 0;
		for(int x:nbGoalsScored){
			sum += x;
		}		
		return sum/((double) nbGoalsScored.length);		
	}
	
	public static double medianGoalsScored(int[] nbGoalsScored){
		//Arrays.sort sorts a given list in ascending order
		Arrays.sort(nbGoalsScored);
		
		int length =  nbGoalsScored.length;
		if(length % 2 ==0){
			return (nbGoalsScored[length/2] + nbGoalsScored[length/2 -1])/2.0;
		}
		return nbGoalsScored[(int) Math.floor(length/2.0)];		
	}
	
	public static void main(String[] args){		
		int[] testSet1 = {0,10,2,3,0,1};
		int[] testSet2 = {1,3,2,8,0};
		
		System.out.println(minGoalsScored(testSet1));
		System.out.println(maxGoalsScored(testSet1));
		System.out.println(meanGoalsScored(testSet1));
		System.out.println(medianGoalsScored(testSet1));
		
		System.out.println(minGoalsScored(testSet2));
		System.out.println(maxGoalsScored(testSet2));
		System.out.println(meanGoalsScored(testSet2));
		System.out.println(medianGoalsScored(testSet2));		
	}
	
}
