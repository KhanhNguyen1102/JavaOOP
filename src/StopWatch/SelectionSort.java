package StopWatch;

public class SelectionSort {
    public void sort(int arr[]) {
        int length = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < length - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min = i;
            for (int j = i + 1; j < length; j++){
                if (arr[j] < arr[min])
                    min = j;
            }
            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Xuất mảng
    public void printArray(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
