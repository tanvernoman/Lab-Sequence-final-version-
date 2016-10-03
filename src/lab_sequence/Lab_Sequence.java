/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_sequence;

/**
 *
 * @author B00316640
 */
public class Lab_Sequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     test();
    }

    private static void test() {
          Sequence<Integer> s1 = new ArraySequence<>(20);

        s1.append(1);
        s1.append(2);
        s1.append(3);
        s1.append(4);
        s1.append(5);
        s1.append(6);

        s1.display();
//        System.out.println("The size is " + s1.size());
//        s1.remove(2);
//        System.out.println("--------------");
//        s1.display();
//      System.out.println("-----------");
//      s1.set(1, 5);
//      
//      s1.display();
//      
        System.out.println("The size is " + s1.size());
//      
      s1.add(2, 100);
      
      s1.display();
      System.out.println("The size is "+s1.size());
      
      System.out.println("----------------------");
       s1.add(3, 300);
       s1.display();
       System.out.println("The size is "+s1.size());
       
       s1.remove(5);
       
       s1.display();
       System.out.println("The size is "+s1.size());
       
       System.out.println(s1.contains(6));
    }

}
