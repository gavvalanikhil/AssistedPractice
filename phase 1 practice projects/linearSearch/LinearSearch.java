package linearSearch;

import java.util.*;
public class LinearSearch {
	public static void main(String[] args){

        int[] arr = {10,20,30,40,50};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element that need to be searched");
        int Val = sc.nextInt();
            int result = (int) searching(arr,Val);

            if(result==-1){

                System.out.println("Element is not in the array");
            } else {

                System.out.println("Element's found at "+result+" and the search key is "+arr[result]);
            }


        }




public static int searching(int arr[], int x) {

    int arrlength = arr.length;
    for (int i = 0; i < arrlength - 1; i++) {

        if (arr[i] == x) {

            return i;

         }
     }

            return -1;

   }



}
