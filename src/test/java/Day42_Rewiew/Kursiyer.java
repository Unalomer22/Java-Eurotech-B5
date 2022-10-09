package Day42_Rewiew;

public class Kursiyer {
    public static void main(String[] args) {
    SDET mezun1 = new SDET();

    mezun1.name = "Talha";
    mezun1.age = 34;
    mezun1.gender = 'M';
    mezun1.company = "Microsoft";
    mezun1.salary = 9000;
    mezun1.isSuccessful = true;

        mezun1.displayProperties();// Talha,34,M,Microsoft,9000,true

        mezun1.increaseSalary(500);

        mezun1.displayProperties();// Talha,34,M,Microsoft,9500,true

        mezun1.companyChange("Oracle");
        mezun1.increaseSalary(500);

        mezun1.displayProperties();// Talha,34,M,Oracle,10000,true
        // Override den sonra;
        // SDET{name='Talha', age=34, gender=M, company='Oracle', salary=10000} yazdi

        String abc = mezun1.toString();
        System.out.println(abc);// Talha, 34
        // Override den sonra;
        // SDET{na me='Talha', age=34, gender=M, company='Oracle', salary=10000} yazdi

        System.out.println(mezun1.toString());// Talha, 34
        System.out.println(mezun1);// Talha, 34
        // Override den sonra;
        // SDET{name='Talha', age=34, gender=M, company='Oracle', salary=10000} yazdi







    }







}
