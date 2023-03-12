package CodingSeccion.Tnayin;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        bubble.bubbleSort();
    }
    public void bubbleSort(){
        int[] arr = {1,5,4,8,9341,-5,-7};
        int tmp;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(int x : arr){
            System.out.println(x);
        }
    }
}
