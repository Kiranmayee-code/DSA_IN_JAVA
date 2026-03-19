package com.methods;

public class PassByValueAndReference {
    public static void change(int x){
        x=10;
    }
    public static void main(String[] args){
       int x=6;
        System.out.println(x);
        change(x);  //just value is passed means a copy is sent no change to original
        System.out.println(x);
    }
}



//🔹 Pass by Value
//
//A copy of the variable is passed to the function.
//
//Changes made inside the function do NOT affect the original value.
//
//Example (Java):
//void change(int x) {
//    x = 50;
//}
//
//public static void main(String[] args) {
//    int a = 10;
//    change(a);
//    System.out.println(a); // Output: 10
//}
//
//👉 a remains 10 because only a copy was modified.
//
//        🔹 Pass by Reference
//
//The actual reference (address) of the variable is passed.
//
//Changes made inside the function affect the original value.
//
//Example (Conceptual):
//void change(int[] arr) {
//    arr[0] = 50;
//}
//
//public static void main(String[] args) {
//    int[] a = {10};
//    change(a);
//    System.out.println(a[0]); // Output: 50
//}
//
//👉 Original value changes because reference is passed.
//
//🔥 Important (Java Concept)
//
//Java is always pass by value
//
//BUT for objects/arrays, the reference is passed by value, so it acts like pass by reference
//
//🧠 Easy Memory Trick
//
//Value → Copy → No change
//
//Reference → Original → Changes happen