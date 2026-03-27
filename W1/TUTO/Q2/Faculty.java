class Person {
    public Person() {
        System.out.println("(1) Performs Person's tasks");
    }
}

class Employee extends Person {
    public Employee() {
        this("(2) Invoke Employee's overloaded constructor");
        System.out.println("(3) Performs Employee's tasks ");
    }
    public Employee(String s) {
        System.out.println(s);
    }
}

public class Faculty extends Employee {
    public Faculty() {
        System.out.println("(4) Performs Faculty's tasks");
    }
    public static void main(String[] args) {
        new Faculty();
    }
}

/**
OUTPUT:
(1) Performs Person's tasks
(2) Invoke Employee's overloaded constructor
(3) Performs Employee's tasks 
(4) Performs Faculty's tasks

The output is a result of constructor chaining through an inheritance hierarchy. When new Faculty() is instantiated, its no-argument constructor is invoked, which implicitly calls super()—the no-argument constructor of Employee. Inside Employee(), the explicit this() call immediately redirects execution to the overloaded Employee(String) constructor. Before that constructor executes its body, it implicitly calls super(), triggering the Person constructor which prints (1). Control then returns to Employee(String) to print the passed argument (2). Subsequently, the original Employee() constructor finishes its execution by printing (3). Finally, the chain completes as control returns to the Faculty constructor, which prints (4).
**/
