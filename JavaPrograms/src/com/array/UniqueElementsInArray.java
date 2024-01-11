package com.array;

public class UniqueElementsInArray{

public static void findUniqueElements(int [] arr) {
    //int n = arr.length;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == '$') {
            continue;
        }

        int count = 1;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i]==(arr[j])) {
                count++;
                arr[j] = '$'; 
        }
        }

        if (count == 1) {
            System.out.println("Unique Element: " + arr[i]);
        }
    }
}

public static void main(String[] args) {
   int [] arr = {10,20,30,10,40,30,40};
    findUniqueElements(arr);
}
}
