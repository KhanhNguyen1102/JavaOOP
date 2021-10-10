package StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        SelectionSort ob = new SelectionSort();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr.length-i;
        }
        System.out.println("Mảng ban đầu:");
        ob.printArray(arr);
        watch.start();
        ob.sort(arr);
        watch.stop();
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
        System.out.println("Thời gian thực thi thuật toán :" + watch.getElapsedTime() + " second");
    }
}
