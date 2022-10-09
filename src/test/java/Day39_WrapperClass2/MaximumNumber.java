package Day39_WrapperClass2;

public class MaximumNumber {
    public static void main(String[] args) {

        // Write a method that finds the maximum number from int Array
        int [] list = {412442, -141341, 13424000, 14124};
        System.out.println(maxValue(list));
        System.out.println(minValue(list));
    }
    public static int maxValue(int[] array){
        int max = Integer.MIN_VALUE;

        for(int each : array ){
            if(each>max){
                max = each;
            }
        }
        return max;
    }
    public static int minValue(int[] array){
        int min = Integer.MAX_VALUE;

        for(int each : array ){
            if(each<min){
                min = each;
            }
        }
        return min;
    }
}
