package Day42_Rewiew;

public class SDET {
    String name;
    int age;
    char gender;
     String company;
     int salary;
     boolean isSuccessful;


     public void increaseSalary (int raiseAmount){

         this.salary += raiseAmount;
     }

     public void companyChange (String newCompany){
         this.company = newCompany;
     }

     public void displayProperties(){
         System.out.println(this.name+","+ this.age+","+this.gender+","+this.company+","+
                 this.salary+","+this.isSuccessful);
     }

    @Override // Sen o methodu degistiriyorsun demek
    public String toString() {
        return "SDET{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
