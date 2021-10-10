package StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        SelectionSort obj = new SelectionSort();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr.length-i;
        }
//        Thay vì dùng hàm sort có thể dùng cách thủ công như trong class SelectionSort
        System.out.println("Mảng ban đầu:");
        obj.printArray(arr);
        watch.start();
        obj.sort(arr);
        watch.stop();
        System.out.println("Mảng sau khi sắp xếp:");
        obj.printArray(arr);
        System.out.println("Thời gian thực thi thuật toán :" + watch.getElapsedTime() + " second");
    }
}
