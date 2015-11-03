package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Startup {

    public static void main(String[] args) {
        List hobbies = new ArrayList(); 
        System.out.println("-----------------");
        System.out.println("Lab 1");
        System.out.println("-----------------");
        System.out.println("Original Array");
        System.out.println("-----------------");
        hobbies.add("Video Games");
        hobbies.add("Movies");
        hobbies.add("Programming");
        for(Object hobby : hobbies) {
            System.out.println(hobby);
        }
        System.out.println("-----------------");
        System.out.println("Items added");
        System.out.println("-----------------");
        hobbies.add("Taxidermy");
        hobbies.add("Bird-watching");
        for (Object hobby : hobbies) {
            System.out.println(hobby);
        }
        System.out.println("-----------------");
        System.out.println("Item removed");
        System.out.println("-----------------");
        hobbies.remove("Taxidermy");
        for (Object hobby : hobbies) {
            System.out.println(hobby);
        }
        System.out.println("-----------------");
        System.out.println("Lab 2");
        System.out.println("-----------------");
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("Jones", "Mike", "111-22-3333"));
        emp.add(new Employee("Game", "Taylor", "222-33-4444"));
        emp.add(new Employee("Tree", "Joshua", "333-44-5555"));
        for (Object employee : emp) {
            System.out.println(employee);
        }
        System.out.println("-----------------");
        System.out.println("Lab 3");
        System.out.println("-----------------");
        List objects = new ArrayList();
        objects.add(new Employee("Jones", "Mike", "111-22-3333"));
        objects.add(new Employee("Tree", "Joshua", "333-44-5555"));
        objects.add(new Dog("Lassie", 12345));
        objects.add(new Dog("Kujo", 66666));
        for (Object obj : objects) {
            System.out.println(obj);
        }
        
        System.out.println("-----------------");
        System.out.println("Lab 4");
        System.out.println("-----------------");
        List<Employee> emp1 = new ArrayList<Employee>();
        emp1.add(new Employee("Jones", "Mike", "111-22-3333"));
        emp1.add(new Employee("Tree", "Joshua", "333-44-5555"));
        emp1.add(new Employee("Game", "Taylor", "222-33-4444"));
        emp1.add(new Employee("Tree", "Joshua", "333-44-5555"));
        Set<Employee> set = new LinkedHashSet<Employee>(emp1);
        emp1.clear();
        emp1.addAll(set);
        for (Object obj1 : emp1) {
            System.out.println(obj1);
        }
        


//        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
        
//        System.out.println(a1);
//        System.out.println(a2);

//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }
    }
}
