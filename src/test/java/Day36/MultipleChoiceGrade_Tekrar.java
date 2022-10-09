package Day36;

public class MultipleChoiceGrade_Tekrar {
    public static void main(String[] args) {

        // Answers of 8 students
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

        System.out.println("Ogrencilerin sinav sonuclarinin degerlendirilmesi");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < answers.length; i++) {
            int dogruCevapSayisi = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]){
                    dogruCevapSayisi ++;
                }
            }
            System.out.println(i+1 + ". ögrencinin dogru cevap sayisi...:" + dogruCevapSayisi);
        }



    }
}
