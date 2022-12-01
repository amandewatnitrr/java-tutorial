import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;


/**
 * Some of the associated Classes in this tutorial
 * @author Aman Kumar Dewangan
 * @version 1.0
 * @since 2022-08-01
 * @see Class aadhar -> employee
 * @see Class Shape -> Rectangle
 * @see Class Product (Interface) -> Book
 *
 */
public class Main {

    /**
     * Basics of User Input and variable initialization
     */
    public static void function01() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = sc.nextLine(); // User String Input
        System.out.print("Enter your age = ");
        int age = sc.nextInt(); // User Integer Input
        System.out.print("Enter your B.Tech CPI = ");
        double cpi = sc.nextDouble(); // User Integer Input
        System.out.println("My name is " + name + " and age is " + age + ". I got " + cpi + " in my B.Tech.");

        /*
            charAt(index)
            It is a special string operation that allows us to access a character at a specific location within the string.
         */
    }

    /**
     * Basics of Conditional Statements
     */
    public static void function02() {
        /*
         * In this function we are going to understand about program control flow.
         * Program Control flow is the order in which the program's instructions or code statements are executed.
         * Till now in function1() the program we wrote, statements get executed one after another sequentially.
         * We can manipulate which line of code is executed with special control flow statements and conditions.
         * Decision Blocks oe control flow statements make a decision about code statements to run on each execution of our program.
         *
         * A condition in a decision block evaluates to true or false depending on some variable.
         * That's what makes it a condition that can be evaluated during the program's execution and manipulate a program's control flow.
         */

        // If- else_if -else statement

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age = ");
        int age = sc.nextInt();

        if (age <= 20) {
            System.out.println("Buddy, aapke papa aae h..");
        } else if (age > 20 && age <= 30) {
            System.out.println("Bro, kaam h ni aa paunga party mei");
        } else {
            System.out.println("Voh din bhi kya din thee...");
        }

    }

    /**
     * Basics of Loops
     */
    public static void function03() {
        /*
         * Loop allows code to be executed repeatedly based on a boolean condition
         */

        System.out.print("Enter the end point for counting = ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 0;

        // while loop implementation

        while (i < n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");

        // for loop implementation

        for (i = 0; i < n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("");

        // do-while loop implementation
        i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < n);

    }

    /**
     * Sometimes the code we write has errors. These errors can be resolved by debugging the code.
     * Debugging involves locating and fixing a program's error.
     * These errors are often called bugs.
     * Breakpoints are intentional stopping point put into a program for debugging purposes.
     * Breakpoints are useful in examining whether a piece of code is being executed or skipped.
     * A function us a series of finite steps that accomplish some task.
     * Functions helps developers organize their code in a meaningful way.
     * Functions allow us to define a given task once and use it all throughout all the code.
     * */

    /**
     * This function is used to calculate the area of a circle
     * @param r radius of the circle
     * @return Area of Circle
     */
    public static double areaofcircle(double r) {
        return 3.14 * Math.pow(r, 2);
    }

    /**
     * Basics of String
     * Theoretical Info on Classes
     */
    public static void function04() {
        /* *
         * Built-in functions in Java
         *
         * Till now we have created our own functions in Java, but now let's learn about some of the in-built functions in Java.
         * Let's learn about some of them.
         * */

        System.out.print("Enter Value for String a = ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        System.out.print("Enter Value for String b = ");
        String b = sc.nextLine();

        if (a.equals(b)) {
            System.out.println("Both the Strings are same.");
        } else {
            System.out.println("Both the Strings are different.");
        }

        /*
         * A Class is a user-defined blueprint that has set of attributes and behaviour for creating objects.
         *
         * The most important reason why static keywords are heavily used in Java is to efficiently manage memory.
         * Generally, if you want to access variables or methods inside a class, you first need to create an instance or object of that class.
         * However, there might be situations where you want to access only a couple of methods or variables of a class and you don’t want...
         * .... to create a new instance for that class just for accessing these members.
         * This is where you can use the static keyword in Java.
         *
         * An Instance is an object created from class blueprint.
         * A Constructor is a special method or behaviour inside every class that creates and initializes instances.
         * The Constructor name is same as the class name/
         * The Constructor are mainly of 3 types: Default, Parameterized and Copy Constructor.
         * For return type, A Constructor always returns an instance of the class it is in.
         * We can add parameters to the constructor to give a dynamic value for each attribute.
         * The Parameter name in parameterized constructor can be different from the attribute name.
         * To access the attributes of the instance we were trying to construct, we use `this` keyword and `.` operator.
         * `This` keyword helps our program make a distinction b/w the attribute variable and parameter variable.
         * When `this` keyword is used along with `.` operator, it refers to the current instance of the class.
         *
         * Instance Methods are also reffered as non-static methods since we need an instance to use them.
         * Class methods are referred to as static methods because we do do not need an instance to use them.
         * Non-static instance variables have different values for each instance.
         * Static variables donot change for every instance they remain same for all the instances. They hold a value for whole class to use.
         * */
    }

    /**
     * Contains the basic implementation of Arrays in Java
     */
    public static void function05() {
        /*
         * Arrays are special container variables that can hold multiple values of the same type.
         * Arrays in Java are not same as Arrays in C++. They are dynamically allocated.
         * Array stores values in consecutive memory locations.
         * Since arrays are objects, we can find there length using the object property length.
         *
         * type[] variable_name = new type[size];
         * Or
         * type name[];    //declaring array
         * name = new type[size];  // allocating memory to array
         * Or
         * type var-name[];
         * type[] var-name;
         *
         * Variable Arguments also referred as varargs allows you....
         * ... to be a bit more flexible with the arguments you send in.
         * A Method can have only one varargs parameter.
         * When a method does have other parameters, the varargs parameter must be the last one.
         * */

        System.out.print("Enter the size of array = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x;
        int arr[];
        arr = new int[n];

        System.out.print("Enter the elements in array = ");
        array_int_input(arr);

        System.out.print("Enter the element to be searched = ");
        int search = sc.nextInt();

        System.out.print("The elements in array are = ");
        print_int_array(arr);
        System.out.println();
        Arrays.sort(arr); // Sorts the array in ascending order
        System.out.println("Element " + search + " is present at index " + Arrays.binarySearch(arr, search));

        /*
            Arrays.binarySearch(array_name,value_to_search_for) returns the index
            of the element if it is present in the array.
         */

        /*
         * Copies the array original into a new array and ...
         * pads or truncates it with zeros depending on the length specified.
         * */

        System.out.println("Specify the length from beginning upto which you want to copy the Array = ");
        int f = sc.nextInt();

        System.out.print("Original Array = ");
        print_int_array(arr);
        System.out.println();
        System.out.print("Copied Array u= ");
        int arr2[];
        arr2 = Arrays.copyOf(arr, f);
        print_int_array(arr2);
        System.out.println();
        if (Arrays.equals(arr, arr2)) {
            System.out.print("Both the Arrays are same.");
        } else {
            System.out.print("Both the Arrays are different.");
        }

    }

    /**
     * Notes on Inheritance
     */
    public static void function06() {
        /*
         * Inheritance is where one class becomes an extension of another class,..
         * ..therefore inheriting the members of the extended class.
         * There are 2 parties involved in an inheritance: Parent(SuperClass) and Child(SubClass).
         *
         * When an inheritance relationship is created b/w 2 classes, the child class
         * inherits all the attributes and methods of the parent class.
         *
         * This allows classes to reuse data that already exists within other classes.
         * Subclasses should be a more specialized form of the superclasses that they inherit from.
         *
         * A Superclass Constructor is run before the subclass constructor.
         *
         * An Explicit Call can be made to the superclass constructor from
         * one of the subclass constructors by using super().
         *
         * An Explicit Call to the superclass's constructor must be the first statement in the subclass's constructor.
         *
         * A Subclass inherits the members of its superclass.
         * However, a subclass may want to change it's behaviour of the method it inherited.
         * This is allowed bu overriding the inherited method.
         *
         * It's encouraged to use Override annotation which is the @ symbol followed by word Override.
         * This is not required but is also encouraged
         *
         * This lets Java know your intention is to override the method you inherited from your superclass.
         *
         *
         * Without this `@Override` annotation, Java will still allow you to override the method, but than you can
         * mistakenly think that you are overriding a method.
         *
         * However if the signature doesnot exactly match the inherited methode, then you wouldn't actually be
         * overriding it.
         *
         * With the Override annotation, Java will catch this and inform you the error.
         * Overloaded Methods ae methods within the same hierarchy that have the same name but different signatures but
         * different parameter list or return type.
         *
         * When dealing with a subclass, we can overload a method that we have inherited from a superclass.
         * Even though that method lives in another class
         *
         * Override and Overloading
         * To Override, a method you keep the same signature but change the body of the method.
         * To Overload, a method you keep the same name but change the signature of the method.
         *
         * A Java Class can directly inherit from one superclass.
         * However, a superclass can also inherit from another class, thus forming a chain of inheritance where the
         * subclass inherits from their Ancestor Classes as well.
         *
         * When a subclass inherits from a superclass, not everything is inherited.
         * Constructors are not technically members of a class.
         *
         * When a subclass inherits from superclass not everything is inherited.
         * Constructors are not technically members of a class, and therefore they are not inherited.
         * All public and protected methods and fields in a superclass are inherited by the subclasses.
         *
         * Private methods and fields are not inherited.
         * Final methods are inherited but cannot be overridden, meaning methods that have word final in there header,
         * these are inherited but cannot be overridden.
         * Final is a non access modifier that indicates that this is the final implementation for this method, and it
         * cannot be changed by any subclasses.
         *
         * Not only Java Classes have control over which of it's members can be inherited, but they can also restrict
         * inheritance all together, to certain subclasses.
         * Classes that restrict inheritance to certain classes are known as Sealed Classes.
         *
         * Sealed Classes are used for modelling a specific domain and control the relationship b/w classes in domain.
         * To make a class "sealed" class we write the reserved word "sealed" before the word class.
         * And than before the opening curly brace we must add the reserved word "permits" and within a comma-delimited
         * list, specify which classes are allowed to inherit from the sealed class.
         * A Sealed Class controls who can inherit from it.
         *
         * If the sealed class lists the subclass, in the permits clause the subclass is required to already exsist and
         * must have already extended the sealed class.
         *
         * Children of sealed classes are also required to declare themselves as sealed/non-sealed/final.
         *
         * non-sealed means that the class is open to be extended by any other class.
         * Any class that extends a non-sealed class is not obligated to define themselves as sealed/non-sealed/final.
         * It will simply be a normal inheritance.
         *
         * Final means that the class cannot have any subclasses. In other words, it cannot be inherited from.
         *
         * */

        employee e = new employee();
        e.set_details();
        e.set_emp_details();
        e.get_details();
    }

    /**
     * Notes on Polymorphism
     */
    public static void function07() {
        /*
         * A Core pillar of OOP is Polymorphism.
         * Polymorphism is the ability of an object to take on many forms.
         * The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child
         * class object.
         *
         * In OOPs, is where a subclass can define it's own unique behaviour and still share some of the same behaviours
         * of the superclass.
         *
         * Type vs Instance
         * An Object can have a superclass type and a subclass instance.
         *
         * Overriden Methods
         * If a method is Overriden by the subclass, the polymorphic object will execute the overriden method at runtime.
         *
         * Object Type Casting
         * The implicit or explicit act of converting an object type into a different type.
         *
         * Casting can be performed upward or downward in an inheritance tree.
         *
         * Any Java object that can pass more than one IS-A test is considered to be polymorphic.
         * An object is considered to be polymorphic if it can be assigned to a variable of more than one type.
         *
         * In Java, all Java objects are polymorphic since any object will pass the IS-A test for their own type and for
         * the class Object.
         *
         * A reference variable of a superclass type can refer to an object of the subclass type.
         * This is known as Upcasting.
         *
         * A reference variable of a subclass type can refer to an object of the superclass type.
         * This is known as Downcasting.
         *
         * Downcasting is not allowed by default.
         * Downcasting is allowed only if the reference variable is explicitly casted to the subclass type.
         *
         *
         * "instanceof" is an operator that checks if an object is an instance of a specific clas.
         * This operator is fittingly known as instanceof.
         *
         * For this let's study an example:
         * Let's say we create an Object with the name "sasha" of animal class i.e. of type Animal.
         * "sasha" is an instance of the class Dog. Now let's check if sasha is an instance of animal.
         * We can check if "sasha" is an instance of animal.
         *
         * boolean isDog = sasha instanceof Animal; // This should be true
         *
         * in general the format goes something like this:
         * boolean bool_variable_name = object_name instanceof class_name_to_be_checked_against;
         * This return true or false depending upon the condition being true or false.
         *
         * bool isCat = sasha instanceof Cat; // This will be false
         *
         * Cause the class is not in Sasha's hierarchy.
         *
         * */

        aadhar e = new employee();
        e.set_details();
        e.get_details();
    }

    /**
     * Notes on Abstraction and it's Implementation
     */
    public static void function08() {
        /*
        * Abstraction is a core principle of Object-Oriented Programming.
        * Abstraction is defined as something that exists in theory but doesn't have a concrete existence.
        * In Java, we have the reserved word abstract which is a non-access modifier that can be used on classes ...
        * and methods.
        * It is used when you want to define a template for a class or a method, but do not intend for it to be used as
        * .. is.
        *
        * An Abstract class is not designed to be instantiated. It's designed to be extended, thus pushing the burden of
        * implementation onto the subclass.
        * For example, a shape is an abstract concept. It can perhaps specify some general behaviours that a type of ..
        * .. shape would have, but it's too abstract of a concept to actually define what that behaviour should be.
        *
        * An Abstract class cannot be instantiated,  but its purpose is to serve as a superclass for more specific ...
        * subclasses to extend from. An Abstract method has no body. Only the signature or definition of the method ...
        * is defined. And it's not designed to run as is.
        *
        * It's designed to be overwritten by a subclass. In this case we know that one should be able to calculate ...
        * the area of a shape but how that is done depends on the type of shape that is.
        *
        * public abstract class shape{
        *   abstract  double calculateArea();
        * }
        *
        * There's no one such formula to add to the body of the calculateArea method in the shape class because it ...
        * because it literally does not exist. This meant to be a template to set a standard that any subclass of shape
        * should provide behaviour for this method.

        * Abstraction as the name implies is a tough concept to grasp.
        *
        * Abstract classes and methods are templates that are meant to be implemented by their subclasses.
        * The Classes abd methods are declared abstract by using the abstract reserved word.
        * If a subclass inherits from an abstract class, it must implement it's abstract methods or the class itself...
        * must ve declared as abstract.
        * */

        Shape rectangale = new Rectangle(5,7);
        System.out.print("Area of Rectangle = ");
        System.out.print(rectangale.calculateArea());
    }


    /**
     * Notes and Implementation of Interfaces
     */
    public static void function09() {
        /*
        * An Interface is similar to an abstract class in that it cannot be instantiated.
        * In that it is an template of an abstract concept.
        * Interfaces are purely meant to be abstract and therefore, don't have any state.
        *
        * A Stateless construct consisting of abstract behaviours to be implemented by other classes.
        * Interfaces don't have constructors.
        * The values of fields cannot be changed i.e. fields are final.
        * Other classes implement Interfaces as opposed to extending them.
        *
        * The same rules and conventions of naming classes also apply to interfaces.
        *
        * Let's understand this with an example of a product.
        *
        * public interface Product{
        *   private String name; // We will get an error that the variable cannot be private.
        * }
        *
        * It's so because it's purpose is to serve as a template that other classes can provide implementation details for.
        * Private fields cannot be accessed outside the scope in which they are defined.
        * So, there is no purpose for private fields within interfaces, as classes that implement interfaces..
        * would not have access to private methods of that interface.
        *
        * Likewise fields within interface cannot either, only public.
        *
        * Because of this any field defined within an interface must be constant, meaning it's static and final.
        *
        * Static: Can be accessed from any other class without any object initialization.
        * Final: Value assigned at initialization cannot be changed.
        *
        * By convention, constants are written in all caps.
        * Even if these modifiers are not explicitly written when declaring fields in an interface, it is still ...
        * implicit both static and final.
        *
        * Interfaces are used to achieve abstraction, Polymorphism in multiple inheritance
        *
        * While a class can extend only one class, it can implement multiple interfaces.
        * This how to achieve multiple inheritance in Java.
        *
        * To implement multiple inheritance, the class header must specify a comma delimited list of names ...
        * of all the interfaces that it would like to implement.
        *
        * If a class declares that it will implement multiple interfaces then it must provide implementation for ...
        * for the abstract methods of all the interfaces.
        *
        * If more than one of the interfaces being implemented contains a method with the same signature, the ...
        * implementing class can provide one overwriting implementation and that will fulfill the obligation with ...
        * all the relevant interfaces.
        *
        * However, if multiple interfaces is being implemented contain a method with the same name but with a ...
        * different return type, the class will receive an error attempting to implement them, indicating that ...
        * there is a clash.
        *
        * Methods allowed in Interfaces
        *
        * Interfaces can also contain default and static methods.
        * Unlike abstract methods both of these types of methods provide implementation.
        * In Interfaces, unless otherwise specified, the methods are implicitly public and abstract.
        *
        * So, with any new addition we have broken any non-abstract class that implemented for the Interface, cause ..
        * they are no longer adhering to the contract b/w an interface and implementing class.
        *
        * To avoid breaking all implementing classes you can define newly added method as default.
        *
        * Default Methods are methods within an interface that contain a default implementation for the method.
        * This enables you to ensure backward compatibility in implementing classes when changes are made to the ...
        * interface state implements.
        *
        * To indicate that the method is a default method, the reserved word default is used at the beginning of the ...
        * method header as follows:
        *
        * default void set_price(double price){
        *   // Body of the function
        * }
        *
        * But be very careful when implementing default methods in interfaces. Because now they are available to the ...
        * object that are instantiated with any of the classes that implement the interface.
        *
        * So, even if we were to call this method using `.` operator, it will be called even if it is not overridden ...
        * by any of the classes that implement the interface. For example:
        *
        * book.getPrice();
        *
        * While default methods provide implementation, they are not final.
        * Classes that implement interface can override the default method and provide their own implementation.
        * However, author of those classes need to be aware of the newly added methods to the interface.
        *
        * If there is no good default implementation, it may be best to leave the new method as abstract. So that, ...
        * implementing classes will get a signal in the form of a compilation error letting them know an implementation
        * ... is required.
        *
        * In addition to abstract and default methods, there is one more type of method allowed in interfaces, ...
        * Static methods.
        *
        * Static Methods are methods within an interface that contain implementation but are not inherited by ...
        * implementing classes and therefore cannot be Overwritten.
        *
        * That means an interface of static methods are not available from the instance of an implementing class ...
        * and can only be accessed from the interface itself.
        *
        * Interfaces cannot be instantiated though which is why members must be defined as static.
        * This enables us to call the static method by using the interface's name.
        *
        * This means that an interface of static methods are not available from the instance of an implementing class...
        * and can only be accessed from the interface itself.
        *
        * Interfaces cannot be instantiated though which is why the methods must be defined as static. This enables ...
        * us to call the static method by using the interface's name.
        *
        * No instantiation is required to access static members.
        *
        *
        * */

        Library lib = new Library();
        lib.add_book();
    }


    /*
     * A Collection is an object that holds reference to other objects.
     * Collections are considered Data Structures and the objects within collections are called elements.
     *
     * There are various types of collections in Java.
     * Some collections allow duplicate elements while others don't and require them to be unique.
     * Some collections are ordered while others are not.
     *
     * Collections framework is a unified architecture that provides data structures and algorithms ...
     * to manipulate them.
     *
     * Java Provides a collections framework which consists of interfaces, classes and methods to store... and
     * manipulate these group of objects.
     *
     * All the interfaces and classes for the collections framework are defined in the java.util package.
     * Collection itself is an interface and is the root of the hierarchy.
     *
     * Java does not provide any direct implementation of the collection  interface, but there are other interfaces
     * ... which inherit form the collection.
     *
     * The most common ones are set, list, queue and map.
     *
     * Set is a collection which cannot contain duplicate elements.
     *
     * List is a collection where elements are ordered. List can contain duplicate elements and the elements can ...
     * be accessed by the position they appear within the list.
     *
     * Queue is a collection of ordered elements which is typically used to hold items that are going to be ...
     * processed in some way.
     *
     * Map is a special data structure, as it does not inherit from the collection interface. However it contains ...
     * collection-like operations which enable them to be used as collections. Maps are used to hold key-value pairs.
     *
     * In addition to the collection themselves, Java also provides a collection of class which contain common ...
     * algorithms that are needed to work with the data structures.
     *
     * */


    /**
     * Notes on Sets in Java
     */
    public static void function10(){
        /*
        * Set is an unordered collection of unique objects.
        * Because set is an interface it can't be instantiated directly, but it can be an objects type.
        *
        * All the duplicate objects within the Set will be deleted.
        * */

        Set<String> fruits = new HashSet<String>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of fruits you want to add to the set: ");
        int n = sc.nextInt();

        System.out.print("Enter the name of the fruits: ");
        int i=0;
        while(i<n){
            fruits.add(sc.next());
            i++;
        }

        System.out.print("Fruits in HashSet are: ");
        for (Object fruit: fruits) {
            System.out.print(fruit + " ");
        }

        System.out.println("Enter the fruit you want to find: ");
        String search = sc.next();
        System.out.println("Is the fruit present in the set: " + fruits.contains(search));
        // The above statement returns true or false based on the fact if the element we are looking for is present ..
        // or not.

        System.out.print("Enter the fruit you want to remove: ");
        String remove = sc.next();
        fruits.remove(remove);
        System.out.print("Fruits in HashSet are: ");
        for(Object fruit: fruits){
            System.out.print(fruit + " ");
        }

        System.out.println("The size of the set is: " + fruits.size());

        /* There's also another method to create a set, which is to use the Set.of() method.
         * But using the Set.of() method, we can only create an immutable set.
         *
         * Set morefruits = Set.of("Pear", "Raisin");
         *
         * Immutable Objects are objects whose state cannot change after it is constructed.
         * By Setting a collection in this way, the collection becomes immutable meaning it cannot change.
         */

    }


    /**
     * Notes on Lists in Java
     * @ArrayList
     */
    public static void function11(){
        /*
        * List is one of the most widely used collections.
        * Some implementations of the list interface are ArrayList, LinkedList, Vector and Stack.
        *
        * */

        List<String> fruits = new ArrayList<String>();
        System.out.print("Enter the number of fruits you want to add to the list: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Enter the name of the fruit: ");
        for(int i=0;i<n;i++)
        {
            fruits.add(sc.next()); // Adds the element to the list
        }

        System.out.print("Fruits in the list are: ");
        for(Object fruit: fruits){
            System.out.print(fruit + " ");
        }

        System.out.println();

        System.out.print("Enter the fruit you want to find: ");
        String search = sc.next();
        System.out.print("The given fruit is at index " + fruits.indexOf(search));
        // Gives the index of specified element
        // Similarly, there's a function called lastIndexOf() which gives the last index of the specified element.

        System.out.println();

        System.out.print("Enter the index you want to visit: ");
        int index = sc.nextInt();
        System.out.print("The fruit at the given index is: " + fruits.get(index));
        // Retrieves the element at the given index

        System.out.println();
        System.out.print("Enter the index you want to update: ");
        int update = sc.nextInt();
        System.out.print("Enter the new fruit name: ");
        String newfruit = sc.next();
        fruits.set(update, newfruit);
        // Updates the element at the given index

        System.out.print("Fruits in the list are: ");
        for(Object fruit: fruits){
            System.out.print(fruit + " ");
        }

        System.out.println();

        System.out.println("Enter the index and the fruit name you want to remove: ");
        int remove = sc.nextInt();
        fruits.remove(remove);


        /*
        * ArrayListName.add(int index, E element)
        * Inserts the given element at specified position in the list.
        *
        * ArrayListName.equals(Object o)
        * Compares the specified object with this list for equality.
        *
        * isEmpty()
        * Returns true if this list contains no elements.
        *
        * ArrayListName.toArray();
        * Returns an array containing all the elements in this list in proper sequence (from first to last element).
        *
        * ArrayListName.clear();
        * Removes all of the elements from this list (optional operation).
        *
        * ArrayListName.get(int index);
        * Returns the element at the specified position in this list.
        *
        * ArrayListName.sort(Comparator<? super E> c);
        * Sorts this list according to the order induced by the specified Comparator.
        *
        * */

        // ArrayList Traversing using Iterator

        Collections.sort(fruits);

        System.out.print("Fruits in the list are: ");
        Iterator<String> it = fruits.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

    }


    /**
     * Notes on Lists in Java
     * @Vector
     */
    public static void function12(){
        /*
        * Vector is a dynamic array.
        * It is similar to ArrayList, but with two differences:
        * 1. Vector is synchronized.
        * 2. Vector contains many legacy methods that are not part of the collection's framework.
        * Vector implements a dynamic array which means it can grow or shrink as required.
        * Like an array, it contains components that can be accessed using an integer index.
        * The Iterators returned by the Vector class are fail-fast.
        * In the case of concurrent modification, it fails and throws the ConcurrentModificationException.
        *
        * "Vectors have all the in-built methods of ArrayList and also have some additional methods as well."
        * */

        Vector<String> team = new Vector<String>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of members you want to add to the team: ");
        int n = sc.nextInt();

        System.out.print("Enter the name of the members: ");
        for(int i=0;i<n;i++){
            team.add(sc.next());
        }

        System.out.print("Members in the team are: ");
        for(Object member: team){
            System.out.print(member + " ");
        }

        System.out.println();

        System.out.print("Index at which you want to insert new member: ");
        int index = sc.nextInt();
        System.out.print("Enter the name of the new member: ");
        String newmember = sc.next();
        team.add(index, newmember);

        team.addElement("Null Member"); // Adds the element at the end of the vector

        System.out.print("Members in the team are: ");
        for(Object member: team){
            System.out.print(member + " ");
        }

        System.out.println();

        System.out.print("Enter the index of the member you want to view: ");
        int view = sc.nextInt();
        System.out.print("The member at the given index is: " + team.elementAt(view));

        // "VectorName.elementAt(int index)" is same as "VectorName.get(int index)".

    }

    /**
     * Notes on Lists in Java
     * @Stack - Class Implementation
     */
    public static void function13(){
        /*
        * Stack is a subclass of Vector that implements a standard last-in, first-out stack.
        * Stack is a collection of objects that are inserted and removed according to the last-in first-out principle.
        * The insertion of objects into a stack is also known as push operation and removal of objects is known ...
        * as pop operation.
        *
        * Stack is a class in Java which implements the concept of Stack Data Structure.
        * Stack is a linear data structure which follows a particular order in which the operations are performed.
        * The order may be LIFO(Last In First Out) or FILO(First In Last Out).
        *
        * */

        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();

        System.out.print("Enter the number of elements you want to push: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }

        System.out.println();

        System.out.print("Elements in the stack are: ");
        System.out.print(s);

        System.out.println();

        System.out.print("Elements in the Stack in order are: ");
        while(!s.empty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }

    }

    /**
     * Notes on Lists in Java
     * @LinkedList - Class Implemented
     */
    public static void function14(){
        LinkedList l = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to add to the list: ");
        int n = sc.nextInt();

        System.out.println();

        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }

        System.out.println();

        System.out.print("Elements in the list are: ");
        for(Object i: l){
            System.out.print(i + " ");
        }

        System.out.println("Enter the index, you want to delete: ");
        int index = sc.nextInt();
        l.remove(index);

        System.out.println();

        System.out.print("Elements in the list are: ");
        for(Object i: l){
            System.out.print(i + " ");
        }
    }

    /**
     * Notes on Queue in Java
     */
    public static void function15(){
        Queue q = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to add to the queue: ");
        int n = sc.nextInt();
        System.out.println();

        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            q.add(sc.nextInt());
        }

        System.out.println();

        System.out.print("Elements in the queue are: ");
        for(Object i: q){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Do you want to delete the head of queue: ");
        int choice = sc.nextInt();
        if(choice == 1){
            q.remove();
        }

        System.out.println();

        System.out.print("The Elements in order are: ");
        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }

    }

    /**
     * Notes on Maps in Java
     */
    public static void function16(){
        /*
        * Map is an interface which is implemented by HashMap, TreeMap, LinkedHashMap, IdentityHashMap, WeakHashMap, ...
        * and Hashtable classes.
        * Map is an object that maps keys to values.
        * A map cannot contain duplicate keys; each key can map to at most one value.
        * Map is useful if you have to search, update or delete elements on the basis of key.
        *
        *
        *
        * */

        Map<Integer, String> map = new HashMap<Integer, String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to add to the map: ");
        int n = sc.nextInt();
        System.out.println();

        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            map.put(sc.nextInt(), sc.next());
        }

        System.out.println();

        System.out.print("Elements in the map are: ");
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.print(entry.getKey() + " " + entry.getValue() + " ");
        }

        System.out.println();

        System.out.print("Enter the key of the element you want to delete: ");
        int key = sc.nextInt();
        map.remove(key);

        System.out.println();

        System.out.print("Elements in the map are: ");
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.print(entry.getKey() + " " + entry.getValue() + " ");
        }

    }

    /**
     * Enhanced For Loops in Java
     */
    public static void function17() {
        /*
        * The Enhanced for-loop provides a more convenient approach to iterate over a collection than the iterator.
        * However, there's an even more straightforward approach to do so by using the forEach method.
        *
        * Inside the parenthesis of the forEach method, we provide the actions that we want to performed for every ...
        * element of this collection.
        *
        * One way to express the action to perform is with a lambda expression.
        * A Lambda expression is a block of code which takes in parameters and returns a value.
        * Lambda expressions are similar to methods, but they do not need a name, and they can be implemented right in .
        * They differ from methods in that they do not belong to any class, and they do not have names, and they are ...
        * executed in line versus being called by other methods.
        *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to add to the list: ");
        int n = sc.nextInt();

        System.out.println();

        System.out.print("Enter the elements: ");
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        System.out.println();

        System.out.print("Elements in the list are: ");

        list.forEach((i) -> {
            System.out.print(i + " ");
        }); // Implementation of Lambda Expression
    }

    /**
     * Notes on:
     * Functional Programming and Interfaces
     * Stream
     */
    public static void function18(){
        /*
        * Functional Programming is a programming style that applies pure functions to an input set to produce an output.
        * It is another style of developing software that uses mathematical functions on an input to produce an output.
        *
        * A Functional Interface is an interface with just one abstract method. ...
        * This One Method is what lambda expressions and method references implement.
        *
        * Types of Interfaces:
        *
        * Consumer: It takes an input and returns nothing : void accept(T t)
        * Supplier: It takes nothing and returns an output : T get()
        * Predicate: It takes an input and returns a boolean : boolean test(T t)
        * Function: It takes an input and returns an output : R apply(T t)
        * UnaryOperator: It takes an input and returns the same type of output : T apply(T t)
        * BinaryOperator: It takes two inputs and returns the same type of output : T apply(T t1, T t2)
        *
        * where T is the type of the input and R is the type of the output.
        *
        *
        * Stream is a sequence of elements from a data source that supports aggregate operations.
        * They do not store the elements, instead, they carry the elements from a data source such as a data structure,
        * ... and allows aggregate operations to be performed on the elements without modifying the original data.
        *
        * java.util.stream package provides the Stream interface to deal with the stream of elements.
        *
        * The stream API provides several useful operations that can be performed on streams.
        * These operations can be either intermediate or terminal.
        * Intermediate operations return the resulting stream after performing an operation.
        * This enables you to continue to perform more operations on the stream if you desire.
        * Terminal operations close the stream and return a result of the operation.
        * This result can either be void or be a value. After a terminal operation ...
        * no more operations can be performed on the stream.
        *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to add to the list: ");
        int n = sc.nextInt();

        System.out.println();

        System.out.print("Enter the elements: ");
        List<String> list = new ArrayList<String>();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }

        System.out.println();

        System.out.print("Elements in the list are: ");
        list.forEach((i) -> {
            System.out.print(i + " ");
        });

        System.out.println();

        System.out.print("Enter the Ingredient you are looking for, check if it's there in list : ");
        String ingredient = sc.next();

        // Below is an implementation of Predicate Interface and Stream.
        System.out.println("Is " + ingredient + " present in the list? " + list.stream().anyMatch(ingredient::equals));

        System.out.println();

        System.out.print("Nessecarry Ingredients in the list: ");
        System.out.println();
        list.stream().filter((v) -> v.startsWith("S")).forEach(System.out::println);

        System.out.println();

        System.out.println("All Ingredients in the list: ");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

    }

    
    /** 
     * Notes on Exception Handling
     */ 
    public static void function19() {
        /*
         * An Exception is an event that occurs at runtime due to an error.
         * It is an object that is thrown by the JVM when an error occurs.
         * 
         * Types of Exceptions:
         * 1. Checked Exceptions: These are the exceptions that are checked at compile time. They are verified by Compiler.
         * 2. Unchecked Exceptions: These are the exceptions that are not checked at compile time.
         * 
         * Exceptions are Objects, which means we have access to helpful methods for dealing with them.
         * `getMessage()` method returns the message of the exception.
         * 
         * Exceptions also have stack traces.
         * A Stack trace is an interactive log of method calls that led to a thrown exception.
         * It allows programmers to trace the path,  the program has taken and it's helpful in...
         * figuring out what and where things may have gone wrong.
         * 
         * An IOException is a checked exception, which means it must be handled or declared.
         * InputMismatchException is an unchecked exception, which means it does not need to be handled or declared.
         * 
         * There are 3 ways to handle multiple exceptions at once:
         * - Polymorphism
         * - Series of Catch Blocks
         * - Multiple Catch Blocks
         * 
         * When handling exceptions, we can use a super class, as a way to catch border exceptions.
         * All exceptions inherit from exception class.
         * 
         * We could use polymorphism, and instead of catching the IOexception, we can specify...
         * one of it's superclasses.
         * 
         * An alternative option is to use multiple catch clauses to handle different type of exceptions.
         * 
         * When resources such as input or output streams are opened and an exception interrupts ...
         * the flow of the program those resources aren't closed properly unless the programmer ...
         * took extra precautions to do so. One way to solve this is by closing the resources in a finally block.
         * But a better approach is to use try-with-resources. 
         * Try-with-resources allows you to declare resources that will be used within the try block. 
         * And Java will automatically close them for you after the execution of the block. 
         * To try-with-resources we use a set of parentheses after the word try, and inside we ...
         * declare and initialize the resource.When we have the resource...
         * declared at this level we don't need a finally clause to close the resource. 
         * You can also specify multiple resources to close.
         * 
         * Final blocks are used to execute code that must be executed no matter what.
         * 
         * Also, if you want to throw an exception of your own. Use the following method:
         * 
         * throw new IllegalArgumentException("Message");
         * 
         * Because illegal argument exception extends runtime exception, ...
         * it is an unchecked exception and we do not need to declare that our method throws this exception.
         * 
         */

         File file = new File("resources/nonexsistent.txt");
         try(Scanner fileReader = new Scanner(file)){ // this is an example of try-with-resources
            while(fileReader.hasNext()){
                System.out.println(fileReader.nextDouble());
            }
         }

         catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
         }

         /*
         finally{
            fileReader.close();
         }
         */
    }

    public static void function20()
        {
            
        }

    /**
     * @param arr is the array to be printed.
     * Just pass the array to the function mentioned below.
     */
    public static void print_int_array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * @param arr is the array in which input is to be given.
     * It's a dynamic array and you have to specify the array length, before putting in values.
     */
    public static void array_int_input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int x;
        for (int i = 0; i < arr.length; i++) {
            x = sc.nextInt();
            arr[i] = x;
        }
    }

    /**
     * This is the main function, where execution starts.
     */
    public static void main(String[] args) {
        function19();
    }

}
