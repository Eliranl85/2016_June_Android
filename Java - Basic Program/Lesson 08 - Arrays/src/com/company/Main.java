package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = {4, 7, 2, 5, 3, 6};
        mergeSort(nums, 0, nums.length - 1);
        printArray(nums);
    }

    public static void reverseOrder(int[] nums){
        int temp, adjacent;
        int upTo = nums.length / 2;
        for (int i = 0; i < upTo; i++) {
            temp = nums[i];
            adjacent = nums.length - i - 1;
            nums[i] = nums[adjacent];
            nums[adjacent] = temp;
        }
    }

    public static int maxSubArray(int[] nums){
        int maxSoFar = 0;
        int maxEndingHere = 0;
        //boolean allNegative = true;
        //int maxAllNegative = nums[0];
        for (int i = 0; i < nums.length; i++) {
            maxEndingHere += nums[i];
            if(maxEndingHere < 0)
                maxEndingHere = 0;
            if(maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;

            /*
            if(nums[i] >= 0)
                allNegative = false;
            if(allNegative && nums[i] > maxAllNegative)
                maxAllNegative = nums[i];
            */
        }
        /*
        if(allNegative)
            return  maxAllNegative;
        */
        return maxSoFar;
    }


    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j<high; j++) {
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }


    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }


    public static void printArray(int arr[]){

        System.out.print("{");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        if(arr.length > 0)
            System.out.print(arr[arr.length - 1]);
        System.out.println("}");

        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + (i==arr.length-1 ? "" : ","));
        }
        */
    }


    public static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[middle + 1 + i];
        }
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int middle = (left+right)/2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

}
