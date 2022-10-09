package Day34;

public class UniqueCharacters {
    private static void uniqueCharacters(String str){
        int [] count = new int [100];// Tekrar eden karakterlerin sayisini tutan dizi
        for(int i= 0; i < str.length(); i++){
            char ch = str.charAt(i);
            count [ch]++;
        }
        // Harflerin tekrar frekanslari
        for (int i = 0; i<count.length;i++){
            if (count[i]==0) continue;
            System.out.println((char)i +"-" + count[i]);
        }
        for (int i = 0;i< str.length(); i++){
            char ch = str.charAt(i);
            // Sadece tek bir tekrari olan karakter
            if (count[ch] == 1){
                System.out.print(str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(" Finding the unique chars in give String");

        uniqueCharacters("DDEECGDDEEEEFGGDCDDM");
    }
}
