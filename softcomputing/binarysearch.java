class binarysearch {
    public static void main(String[] args) {

        int index = binarySearch(arr, key);
        System.out.println(index);
    }

public static int binarySearch(int[] arr,int low, int high, int key){
    int mid = (low + high) / 2;
    while(low <= high){
        if(arr[mid] < key) {
            low = mid + 1;
        }
        else if (arr[mid] == key)
        return mid;
        else
        high = mid - 1;
    }
    return -1;
}return-1;

}