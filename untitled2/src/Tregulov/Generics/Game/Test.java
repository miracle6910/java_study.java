package Tregulov.Generics.Game;

public class Test {
    public static void main(String[] args) {
        Schoolar sc1 = new Schoolar("Ivan", 13);
        Schoolar sc2 = new Schoolar("Mariya", 15);
        Schoolar sc3 = new Schoolar("BARAN", 12);
        Schoolar sc4 = new Schoolar("NAIG", 18);

        Students student1 = new Students("zalupa", 19);
        Students student2 = new Students("gey", 21);

        Employee emp1 = new Employee("kumar", 33);
        Employee emp2 = new Employee("daun", 55);

        Team<Schoolar> schoolarTeam = new Team<>("CP");
        schoolarTeam.addNewParticipant(sc1);
        schoolarTeam.addNewParticipant(sc2);

        Team<Schoolar> schoolarTeam2 = new Team<>("XYU");
        schoolarTeam2.addNewParticipant(sc3);
        schoolarTeam2.addNewParticipant(sc4);


        Team<Students> studentTeam = new Team<>("VPERDE");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);


        Team<Employee> employeeTeam = new Team<>("RABI");
        employeeTeam.addNewParticipant(emp1);
        employeeTeam.addNewParticipant(emp2);

        schoolarTeam.playWith(schoolarTeam2);



    }



}
