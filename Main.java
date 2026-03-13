public class Main {
    public static void main (String[] args){
        System.out.println("Hello world");
    }
}


// Notes: 
// 1. Java code must inside a class
// 2. filename must match the classname i.e. Main.java
// 3. public static void main (String[] args) - entry point of the program (the JVM starts execution from here)
// 4. java runs in two steps: 
//      - javac Main.java (compile & it create Main.class)
//      - Java Main (to run)
// Java Code -> ByteCode (.class) -> JVM runs it
// 
// # JRE vs JDK: (JDK = JRE + developement tools)
//      JRE (Java Runtime Environment): JVM + core libraries (It's only job is to run compiled java programs)
//                                     e.g. if you have already compiled .class file, then JRE can run it. 
//      JDK (Java Developement Kit): JRE + javac compiler + developer tools
//                                  So it lets you write + compile + run java
// # why main is lower case at entry point?
//      Because java naming convention says: 
//          1. class - Pascal case
//          2. Method - Camel case
//          3. variables - Camel case
// # why is it println (ln meaning?)
// 
