class Selection_sort{
	public static void main(String[] args){
		int nums[] = {64, 34, 25, 5, 22, 11, 90, 12};
		int i, j;
		for(i = 0 ; i < nums.length - 1 ; i++){
			int min_idx = i;
			for(j = i + 1 ; j < nums.length ; j++){
				if(nums[j] < nums[min_idx]){
					min_idx = j;
				}
			}
			int temp = nums[i];
			nums[i] = nums[min_idx];
			nums[min_idx] = temp;
		}

		for(i = 0 ; i < nums.length ; i++){
			System.out.println(nums[i] + "\t");
		}
	}
}