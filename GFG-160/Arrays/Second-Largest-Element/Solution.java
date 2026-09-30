class Solution {
    public int getSecondLargest(int[] arr) {

        int largest = arr[0];
        int seclargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                seclargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && seclargest < arr[i]) {
                seclargest = arr[i];
            }
        }

        return seclargest;
    }
}
