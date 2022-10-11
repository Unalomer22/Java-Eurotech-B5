package Day62_Rewiew;

public class EngineerPly extends EmployeePly{


        String workPlace;

        //Contructor overloading
        public EngineerPly(String name){
            super(name);
        }

        public EngineerPly(String name, String workPlace){
            super(name);
            this.workPlace = workPlace;
        }

        public void doDesing(){
            System.out.println(this.name + " isimli mühendis tasarım yapıyor.");
        }
        @Override
        public void work() {
            System.out.println(this.name + " isimli mühendis çalışıyor.");
        }

        @Override
        public void showInfo() {
            System.out.println("-----------Engineer------------");
            System.out.println("Name                : " + this.name);
            System.out.println("Name of work place  : " + this.workPlace) ;
            System.out.println("-----------------------------");
        }

}
