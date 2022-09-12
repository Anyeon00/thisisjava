package Problem.part2;

public class Ch05Num8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {93,92, 96},
                {78, 83, 93, 87, 88}
        };
        //합
        int sum = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                sum += array[i][k];
                num += 1;
            }
        }
        double avg = (double) sum / num;

        System.out.println(sum);
        System.out.println(avg);


    }
}
