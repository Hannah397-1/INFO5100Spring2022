package Q2;

import javax.xml.crypto.Data;

public class Difference {
    /*
    Difference between abstract class and interface:

    Abstract class is abstracted for its child class use.
    interface usually means a standard.

    a class can implements multiple interface
    a class can only extends one abstract class?????

    1.There could be no abstract method in abstract class.
    But if there exists an abstract method in a class, that class must be a abstract class.
     Before JDK8, there could only be abstract method in interface, after JDK8,
     there could be other method in interface,(like normal method and static method)
      but normal method must have the "default" modifier before its method.
    2. How to use them:

    interface: The keyword is "implements"
    abstract class: The keyword is "extends"

    3. abstract class:faster
        interface: slower

    4. If there is attributes in interface, they must be "public static final" attributes
    which means we can't change the value of them afterwords outside the interface.
        But attributes in abstract class doesn't have to be "final". we can change it in abstract class's child class.
    * */
    /**
    An abstract class permits you to make functionality that subclasses can implement or override whereas an interface only permits you to state functionality but not to implement it. A class can extend only one abstract
    class while a class can implement multiple interface
    * */
    /**
     * Parameters	Interface	Abstract class
     *     Speed	Slow	Fast
     *                     Multiple Inheritances	Implement several Interfaces	Only one abstract class
     *     Structure	Abstract methods	Abstract & concrete methods
     *     When to use	Future enhancement	To avoid independence
     *     Inheritance/ Implementation	A Class can implement multiple interfaces	The class can inherit only one Abstract Class
     *             Inheritance/ Implementation	A Class can implement multiple interfaces	The class can inherit only one Abstract Class
     *             Default Implementation	While adding new stuff to the interface, it is a nightmare to find all the implementors and implement newly defined stuff.	In case of Abstract Class, you can take advantage of the default implementation.
     *     Access Modifiers	The interface does not have access modifiers. Everything defined inside the interface is assumed public modifier.	Abstract Class can have an access modifier.
     *     When to use	It is better to use interface when various implementations share only method signature. Polymorphic hierarchy of value types.	It should be used when various implementations of the same kind share a common behavior.
     *     Data fields	the interface cannot contain data fields.	the class can have data fields.
     *     Multiple Inheritance Default	A class may implement numerous interfaces.	A class inherits only one abstract class.
     */


}
