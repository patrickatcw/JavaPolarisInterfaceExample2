package com.me;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Bart", "Simpson", "Janitorial Services");
        System.out.print(employee.firstName() + " ");
        System.out.println(employee.lastName());
        System.out.println(employee.organization());

        System.out.println("--------------------------------------------------");

        Employee employee1 = new Employee("Jim", "Jones", "Event Coordinator");
        System.out.print(employee1.firstName() + " ");
        System.out.println(employee1.lastName());
        System.out.println(employee1.organization());

        System.out.println("--------------------------------------------------");

        Researchers researchers = new Researchers("Mickey", "Mouse", "Public Relations 2018");
        System.out.print(researchers.firstName() + " ");
        System.out.println(researchers.lastName());
        System.out.println(researchers.projects());

        System.out.println("--------------------------------------------------");

        Researchers researchers1 = new Researchers("Pink", "Floyd", "Music Planning");
        System.out.print(researchers1.firstName() + " ");
        System.out.println(researchers1.lastName());
        System.out.println(researchers1.projects());

        System.out.println("--------------------------------------------------");

    }

}

/*results;

  Bart Simpson
  Janitorial Services
  --------------------------------------------------
  Jim Jones
  Event Coordinator
  --------------------------------------------------
  Mickey Mouse
  Public Relations 2018
  --------------------------------------------------
  Pink Floyd
  Music Planning
  --------------------------------------------------
*/