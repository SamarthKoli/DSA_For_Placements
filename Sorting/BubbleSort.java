package Sorting;


class Solution {
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[]) {
        // code here
        for(int i=arr.length-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
               if( arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   
                   
               }
                
            }
        }
    }
}