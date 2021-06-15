package main.java.com.java_programs;

import java.util.HashMap;
import java.util.Map;

public class DistinctPairs {
	
	public static void main(String[] args) {
		int[] arr = new int[]{1,3,46,0,47,};
		int k = 47;
		DistinctPairs ds = new DistinctPairs();
		ds.distinctPairs(arr, k);
		
	}
	
	public void distinctPairs(int[] arr, int k){
		int length = arr.length;
		int count = 0;
		Map<Integer,Integer> pairs = new HashMap<Integer,Integer>();
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				if(arr[i]+arr[j] == k ){
					if(!(pairs.containsKey(arr[j])&&pairs.containsValue(arr[i])))
					pairs.put(arr[i], arr[j]);
				}
			}
		}
		count = pairs.size();
		System.out.println("Pairs are "+pairs+"  count  = "+count);
	}

}
