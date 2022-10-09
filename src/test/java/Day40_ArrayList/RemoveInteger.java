package Day40_ArrayList;

import java.util.ArrayList;

public class RemoveInteger {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println(nums.size());// 0
        System.out.println(nums.isEmpty());// true
        System.out.println(nums.size()==0);// true

        nums.add(1);
        nums.add(23);
        nums.add(25);
        nums.add(45);
        nums.add(76);
        nums.add(675);

        System.out.println(nums.size());// 6 ,Listedeki eleman sayisini "size" methodu veriyor

        System.out.println(nums.toString());// [1, 23, 25, 45, 76, 675]

        nums.remove(5); // 5. ci indeksi (675 ) sildik
        System.out.println(nums.toString());// [1, 23, 25, 45, 76]

        Integer n1 = new Integer(25);
        Integer n2 = Integer.valueOf(25);

        nums.remove(n1);// 25 numarali indeksi sildi
        System.out.println(nums.toString());// [1, 23, 45, 76]

        nums.remove(new Integer(45));
        System.out.println(nums.toString());//[1, 23, 76]

    }
}
