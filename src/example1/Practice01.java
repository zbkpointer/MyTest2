//: src/Practice01.java
package example1;

/** Learning javadoc
 *
 * @author 张博康
 * @version 0.1
 *
 */

/** A class Comment */
public class Practice01 {

    /** A filed Comment */
    private int a;

    /** A filed Comment */
    private char b;

    /** A method Comment */
    private void print(){
        System.out.println(this.a);
        System.out.println(this.b);
    }

    public static void main(String[] args) {
        Practice01 practice01 = new Practice01();
        practice01.print();
    }
} ///:~
