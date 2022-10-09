package Day36;

public class MultipleChoiceGrade {
    public static void main(String[] args) {
        //Answers of 8 students
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //1.Öğrenci Cevapları
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'}, //2.Öğrenci Cevapları
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, //3.Öğrenci Cevapları
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'}, //4.Öğrenci Cevapları
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //5.Öğrenci Cevapları
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //6.Öğrenci Cevapları
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //7.Öğrenci Cevapları
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}  //8.Öğrenci Cevapları
        };

        //Answer Key of 10 questions
        char[] keys = {'D','B','D','C','C','D','A','E','A','D'};

        System.out.println("Öğrencilerin sınav sonuçlarının değerlendirilmesi:");
        System.out.println("-------------------------------------------------");

        System.out.println("İki boyutlu Dizinin satır sayısı  = " + answers.length ); //iki boyutlu dizinin satır sayısını yazar
        System.out.println("Tek boyutlu dizinin  eleman sayısı = " + keys.length); // tek boyutlu dizinin eleman sayısını yazar
        System.out.println();

        for (int k = 0; k < answers.length; k++) {
            int dogruCevapSayisi = 0;
            for (int l = 0; l < answers[k].length ; l++) {
                if (answers[k][l] == keys[l]){  //answers[1][4] == keys[4]
                    dogruCevapSayisi++;
                }
            }
            System.out.println(k + 1 + ". öğrencinin doğru cevap sayısı ...: " + dogruCevapSayisi);

        }

    }
}
