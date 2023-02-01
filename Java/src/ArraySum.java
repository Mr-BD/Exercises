public class ArraySum {
    public static void main(String[] args) {
        int arr[] = new int[] {12,2,3,5,10,4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("The Sum is: "+sum);

    }
}