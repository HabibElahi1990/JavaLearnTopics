package javaEnum.example;

public class EmployeeSalaryByEducation {

    public static void main(String[] args) {
        Person p1=new Person("Habib",29);
        Person p2=new Person("Ali",20);
        Person p3=new Person("David",38);
        Person p4=new Person("Jan",30);
        p1.setEducation(EducationInfo.GetEducationInfo.PROFESSOR);
        p1.setSalary(clcSalary(p1.getEducation()));

        p2.setEducation(EducationInfo.GetEducationInfo.DIPLOMA);
        p2.setSalary(clcSalary(p2.getEducation()));

        p3.setEducation(EducationInfo.GetEducationInfo.DOCTORATE);
        p3.setSalary(clcSalary(p3.getEducation()));

        p4.setEducation(EducationInfo.GetEducationInfo.HIGH_SCHOOL);
        p4.setSalary(clcSalary(p4.getEducation()));

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        /* output
        Person{name='Habib', age=29, education='PROFESSOR, salary=20000'}
        Person{name='Ali', age=20, education='DIPLOMA, salary=5000'}
        Person{name='David', age=38, education='DOCTORATE, salary=15000'}
        Person{name='Jan', age=30, education='HIGH_SCHOOL, salary=2500'}
         */

    }
    static int clcSalary(EducationInfo.GetEducationInfo eg) {
        int salary;
        switch (eg){
            case HIGH_SCHOOL:
                salary= eg.getValue()*500;
                break;
            case DIPLOMA:
                salary= eg.getValue()*500;
                break;
            case BACHELOR:
                salary= eg.getValue()*500;
                break;
            case DOCTORATE:
                salary= eg.getValue()*500;
                break;
            case PROFESSOR:
                salary= eg.getValue()*500;
                break;
                default:
                    salary=0;
                    break;
        }
        return salary;
    }
}
