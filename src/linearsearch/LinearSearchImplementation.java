/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 28-Mar-20
 *  Time: 2:07 AM
 */
package linearsearch;

public class LinearSearchImplementation {
    private int [] arr;

    public LinearSearchImplementation(int[] arr) {
        this.arr = arr;
    }
    public boolean linearSearch(int searchElement){
        boolean response = false;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == searchElement){
                response = true;
                break;
            }

        }
        return response;
    }

    public static void main(String[] args) {
        int[] array = {25, 8, 2, 15,10,5, 60};
        LinearSearchImplementation obj = new LinearSearchImplementation(array);
        int searchElement = 50;
        boolean result = obj.linearSearch(searchElement);
        if(result){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element Not found");
        }
    }
}
