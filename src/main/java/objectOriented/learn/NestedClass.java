package objectOriented.learn;

class NestedClass {
    private String firstName;
    private String lastName;
    private Integer age;

    private static String staticFirstName;
    private static String staticLastName;
    private static Integer staticAgeName;

    class InnnerClass{
        void printInnerClass(){
            System.out.println("firstName is "+ firstName);
            System.out.println("lastName is "+ lastName);
            System.out.println("age is "+ age);
        }
    }

    static class NestedClassStatic{
        void printInnerClass(){
            System.out.println("firstName is "+ staticFirstName);
            System.out.println("lastName is "+ staticLastName);
            System.out.println("age is "+ staticAgeName);
        }
    }

    NestedClass(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        staticFirstName = "N_"+firstName;
        staticLastName = "N_"+lastName;
        staticAgeName = age+2;
    }

    public static void main(String[] args) {
        NestedClass nestedClass=new NestedClass("Habib","Elahi",29);
        InnnerClass innnerClass= nestedClass. new InnnerClass();
        innnerClass.printInnerClass();
        NestedClassStatic nestedClassStatic=new NestedClassStatic();
        nestedClassStatic.printInnerClass();

        /*output
             firstName is Habib
             lastName is Elahi
             age is 29
             firstName is N_Habib
             lastName is N_Elahi
             age is 31
         */
    }

}

