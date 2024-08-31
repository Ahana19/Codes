import java.util.*;
interface ArrayInterface {
    void sort();
    void insert(int element);
    void delete(int element);
    int binarySearch(int element);
}

class SingleArray implements ArrayInterface {
    private int[] arr;
    private int size;
    
    public SingleArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }
    
    public void sort() {
        Arrays.sort(arr, 0, size);
    }
    
    public void insert(int element) {
        if (size == arr.length) {
            throw new RuntimeException("Array is full");
        }
        arr[size++] = element;
    }
    
    public void delete(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j+1];
                }
                size--;
                return;
            }
        }
        throw new RuntimeException("Element not found");
    }
    
    public int binarySearch(int element) {
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == element) {
                return mid;
            } else if (arr[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

public class Q1 {
    public static void main(String[] args) {
        SingleArray arr = new SingleArray(10);
        arr.insert(5);
        arr.insert(2);
        arr.insert(7);
        arr.insert(3);
        arr.sort();
        System.out.println(Arrays.toString(arr.arr));
        arr.delete(7);
        System.out.println(Arrays.toString(arr.arr));
        int index = arr.binarySearch(2);
        System.out.println(index);
    }
}
