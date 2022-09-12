package Problem.part2;

public class ch05Num7 {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 8, 2};
        int max = 0;

        for (int arr : array) {
            if(arr > max){
                max = arr;
            }
        }
        System.out.println(max);
    }
}
