class Chapter23Examples {
	public static void main(String[] args) {
		int[] sorted = bubbleSort(3, 4, 5, 2, 7, 88, 1);
		int[] sorted2 = mergeSort(3, 4, 5, 2, 7, 88, 1);

		for (int i = 0; i < sorted.length; i ++){
			System.out.print(sorted[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < sorted2.length; i ++){
			System.out.print(sorted2[i] + " ");
		}
	}
	
	public static int[] bubbleSort(int... list){
		boolean isSorted = false; 
		boolean needPass = true;
		
		for (int pass = 1; pass < list.length; pass++ ){
			if (isSorted){
				break;
			} 
			needPass = false;
			
			//perform next pass swapping items
			for (int i = 0; i < list.length - pass; i++){
				if (list[i] > list [i+1]){
					int tmep = list [i+1];
					list[i+1] = list [i];
					needPass = true;
				}
			}								
		}
		return list;
	}
	
	public static int[] mergeSort (int... list){
		if (list.length > 1) {
			int [] fHalf = new int [list.length / 2];
			System.arraycopy(list, 0, fHalf, 0, list.length /2);
			mergeSort(fHalf);
			
			int sLength = list.length- list.length / 2;
			int [] sHalf = new int [list.length - sLength];
			System.arraycopy(list, list.length/2, sHalf, 0, list.length/2 );
			mergeSort(sHalf);
			
			// merge halves together
			int firstI = 0;
			int secI = 0;
			int listI = 0;
			
			while(firstI < fHalf.length && secI < sHalf.length){
				if(fHalf[firstI] < sHalf[secI]){
					list[listI] = fHalf[firstI];
					firstI++;
					listI++;
				}
				else {
					list[listI] = sHalf[secI];
					secI++;
					listI++;
				}
				
			}
			while(firstI < fHalf.length){
				list[listI] = fHalf[firstI];
				firstI++;
				listI++;
			}
			while(secI < sHalf.length){
				list[listI] = sHalf[secI];
				secI++;
				listI++;
			}
			
		}
		return list;
	}
}