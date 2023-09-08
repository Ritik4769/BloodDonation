// import java.util.Scanner;

// class MyStack1 {
//     private int arr[];
//     private int top;
//     private final int MAXSIZE = 10;
//     int count1 = 0;

//     public MyStack1() {
//         this.init();
//     }

//     public void init() {
//         this.arr = new int[MAXSIZE];
//         this.top = 0;
//     }

//     public int capacity() {
//         return arr.length;
//     }

//     public int size() {
//         return this.top;
//     }

//     public int peek() {
//         return this.arr[top];
//     }

//     public boolean isEmpty() {
//         if (this.top == 0)
//             return true;
//         return false;
//     }

//     public boolean isFull() {
//         if (this.top == MAXSIZE)
//             return true;
//         return false;
//     }

//     public void push(Scanner sc) {
//         int item;
//         if (this.isFull())
//             System.out.println("\nStack is Full...\n");
//         else {
//             System.out.println("Enter Any Element :");
//             item = sc.nextInt();
//             this.arr[this.top] = item;
//             this.top++;
//         }
//     }

//     public void pop() {
//         int item;
//         if (this.isEmpty()) {
//             System.out.println("\nStack is Empty...\n");
//         } else {
//             this.top--;
//             item = this.arr[top];
//             System.out.println(item + " is deleted from the stack...");
//         }
//     }

//     public void peep() {
//         if (this.isEmpty())
//             System.out.println("\nStack is Empty...\n");
//         else {
//             System.out.println("Stack elements are:");
//             for (int i = this.top - 1; i >= 0; i--) {
//                 System.out.print(this.arr[i] + "\t");
//             }
//             System.out.println();
//         }
//     }

//     public int count(Scanner sc) {
//         if (this.isEmpty())
//             System.out.println("\nStack is Empty...\n");
//         else {
//             count1 = 0;
//             int element;
//             System.out.println("Enter the element for count");
//             element = sc.nextInt();
//             for (int i = 0; i <= this.top - 1; i++) {
//                 System.out.print(this.arr[i] + "\t");
//                 if (this.arr[i] == element) {
//                     count1++;
//                 }
//             }
//             System.out.println();
//         }
//         return count1;

//     }

//     public int search(Scanner sc) {
//         if (this.isEmpty())
//             System.out.println("\nStack is Empty...\n");
//         else {
//             // count1=0;
//             int element;
//             System.out.println("Enter the element for search");
//             element = sc.nextInt();
//             for (int i = 0; i <= this.top - 1; i++) {
//                 System.out.print(this.arr[i] + "\t");
//                 if (this.arr[i] == element) {
//                     count1 = i + 1;

//                 }
//             }
//             System.out.println();
//         }
//         return count1;

//     }

//     public int sum() {
//         int sum = 0;
//         if (this.isEmpty())
//             System.out.println("\nStack is Empty...\n");
//         else {
//             for (int i = 0; i <= this.top - 1; i++) {
//                 sum += this.arr[i];
//             }
//         }
//         return sum;
//     }

//     public void display() {
//         if (this.isEmpty())
//             System.out.println("\nStack is Empty...\n");
//         else {
//             count1 = 0;
//             int element;
//             System.out.println("element are :");
//             for (int i = 0; i <= this.top - 1; i++) {
//                 System.out.print(this.arr[i] + "\t");
//             }
//         }
//     }

//     public int max() {
//         int max = 0;
//         if (this.isEmpty())
//             System.out.println("\nStack is Empty...\n");
//         else {

//             System.out.println("element are :");
//             for (int i = 0; i <= this.top - 1; i++) {
//                 if (max < this.arr[i]) {
//                     max = arr[i];
//                 }
//             }
//         }
//         return max;
//     }

//     public int min() {
//         int min = this.arr[0];
//         if (this.isEmpty())
//             System.out.println("\nStack is Empty...\n");
//         else {

//             System.out.println("element are min :");
//             for (int i = 0; i <= this.top - 1; i++) {
//                 if (min > this.arr[i]) {
//                     min = arr[i];
//                 }
//             }
//         }
//         return min;
//     }

//     public int secmax() {
//         int max = 0;
//         int secmax = 0;
//         if (this.isEmpty())
//             System.out.println("\nStack is Empty...\n");
//         else {

//             System.out.println("element are :");
//             for (int i = 0; i <= this.top - 1; i++) {
//                 if (max < this.arr[i]) {
//                     max = arr[i];
//                 }
//             }

//             for (int i = 0; i <= this.top - 1; i++) {
//                 if (max > this.arr[i] && secmax < max) {
//                     secmax = arr[i];
//                 }
//             }
//         }
//         return secmax;
//     }

//     public int secmin() {
//         int min = this.arr[0];
//         int secmin = this.arr[0];
//         int index = 0;
//         if (this.isEmpty())
//             System.out.println("\nStack is Empty...\n");
//         else {

//             System.out.println("element are min :");
//             for (int i = 0; i <= this.top - 1; i++) {
//                 if (min > this.arr[i]) {
//                     min = arr[i];
//                     index = i;
//                 }
//             }
//             System.out.println("min : " + min);
//             for (int i = 0; i <= this.top - 1; i++) {
//                 if (secmin < this.arr[i] && i != index) {
//                     secmin = arr[i];
//                     // System.out.println(secmin+" "+arr[i]);
//                 }
//             }
//         }
//         return secmin;
//     }

//   public void second_min() {
//         if (isEmpty())
//             System.out.println("Stack is Empty...");
//         else {
//             int max = this.arr[0];
//             int min = this.arr[0];
//             for (int i = 1; i < this.top; i++) {
//                 if (this.arr[i] > max) {
//                     max = this.arr[i];
//                 }
//             }
//             for (int i = 1; i < this.top; i++) {
//                 if (this.arr[i] < min) {
//                     min = this.arr[i];
//                 }
//             }
//             int min2 = max;
//             for (int i = 0; i < this.top; i++) {
//                 if (this.arr[i] < min2 && this.arr[i] > min) {
//                     min2 = this.arr[i];
//                 }
//             }
//             System.out.println("Second Minimum Element is : " + min2);
//         }

//     public void reverse() {
//         if (this.isEmpty())
//             System.out.println("Stack is Empty");
//         else {
//             for (int i = 0; i < this.top / 2; i++) {
//                 int temp = this.arr[i];
//                 this.arr[i] = this.arr[top - i];
//                 this.arr[top - i] = temp;
//             }
//             for (int i = 0; i < top; i++) {
//                 System.out.print(this.arr[i] + "\t");
//             }
//         }
//     }

//     public void update(Scanner sc) {
//         if (this.isEmpty())
//             System.out.println("Stack is empty");
//         else {
//             System.out.println("Enter index to update value");
//             int index = sc.nextInt();
//             System.out.println("Enter Update Value");
//             int element = sc.nextInt();
//             boolean bool = false;
//             for (int i = 0; i < this.top; i++) {
//                 if (i == index) {
//                     this.arr[i] = element;
//                     bool = true;
//                     System.out.println("Elements updated successful");
//                     break;
//                 }
//             }
//             if (!bool)
//                 System.out.println("please enter right index");
//         }
//     }

//     public void sort() {
//         if (this.isEmpty())
//             System.out.println("Stack is Empty");
//         else {
//             for (int i = 0; i < this.top - 1; i++) {
//                 for (int j = i + 1; j < this.top; j++) {
//                     if (this.arr[i] > this.arr[j]) {
//                         int temp = this.arr[i];
//                         this.arr[i] = this.arr[j];
//                         this.arr[j] = temp;
//                     }
//                 }
//             }
//             for (int i = 0; i < top; i++)
//                 System.out.print(this.arr[i] + "\t");
//         }
//     }

//     public void descending() {
//         if (this.isEmpty())
//             System.out.println("Stack is Empty");
//         else {
//             int arr1[] = new int[top];
//             for (int i = 0; i < this.top; i++) {
//                 arr1[i] = this.arr[i];
//             }
//             for (int i = 0; i < this.top - 1; i++) {
//                 for (int j = i + 1; j < this.top; j++) {
//                     if (arr1[i] < arr1[j]) {
//                         int temp = arr1[i];
//                         arr1[i] = arr1[j];
//                         arr1[j] = temp;
//                     }
//                 }
//             }
//             for (int i = 0; i < top; i++)
//                 System.out.print(arr1[i] + "\t");
//         }
//     }

//     public void ascending() {
//         if (this.isEmpty())
//             System.out.println("Stack is Empty");
//         else {
//             int arr1[] = new int[top];
//             for (int i = 0; i < this.top; i++) {
//                 arr1[i] = this.arr[i];
//             }
//             for (int i = 0; i < this.top - 1; i++) {
//                 for (int j = i + 1; j < this.top; j++) {
//                     if (arr1[i] > arr1[j]) {
//                         int temp = arr1[i];
//                         arr1[i] = arr1[j];
//                         arr1[j] = temp;
//                     }
//                 }
//             }
//             for (int i = 0; i < top; i++)
//                 System.out.print(arr1[i] + "\t");
//         }
//     }


// }

// public class Stack {
//     public static void main(String[] args) {
//         MyStack1 obj = new MyStack1();
//         Scanner sc = new Scanner(System.in);
//         int choice = 0;
//         do {
//             System.out.println("\nYour choices are:\n1 for PUSH\n2 for POP\n3 for PEEP");
//             System.out.println(
//                     "4 for SIZE\n5 for PEEK\n6 for CAPACITY\n7 for COUNT\n8 for SEARCH\n9 for SUM\n10 for DISPLAY\n11 for MAX\n12 for MIN\n13 for SECMAX\n 14 for SECMIN\n\15 for reverse\n16 for update\n17 for sort\n18 for descending\n19 for acending\n20 for size");
//             System.out.print("Enter Your Choice:");
//             choice = sc.nextInt();
//             switch (choice) {
//                 case 1:
//                     obj.push(sc);
//                     break;
//                 case 2:
//                     obj.pop();
//                     break;
//                 case 3:
//                     obj.peep();
//                     break;
//                 case 4:
//                     System.out.println(obj.size());
//                     break;
//                 case 5:
//                     System.out.println(obj.peek());
//                     break;
//                 case 6:
//                     System.out.println(obj.capacity());
//                     break;
//                 case 7:
//                     System.out.println("Numbers comes " + obj.count(sc) + " times");
//                     break;
//                 case 8:
//                     System.out.println("Search element index is : " + obj.search(sc));
//                     break;
//                 case 9:
//                     System.out.println("Total sum  : " + obj.sum());
//                     break;
//                 case 10:
//                     obj.display();
//                     break;
//                 case 11:
//                     System.out.println("Max Element  : " + obj.max());
//                     break;
//                 case 12:
//                     System.out.println("Min Element  : " + obj.min());
//                     break;
//                 case 13:
//                     System.out.println("secMax Element  : " + obj.secmax());
//                     break;
//                 case 14:
//                     System.out.println("secMin Element  : " + obj.secmin());
//                     break;
//                 case 15:
//                     obj.reverse();
//                     break;
//                 case 16:
//                     obj.update(sc);
//                     break;
//                 case 17:
//                     obj.sort();
//                     break;
//                 case 18:
//                     obj.descending();
//                     break;

//                 case 19:
//                     obj.ascending();
//                     break;
//                 case 20:
//                     obj.size();
//                     break;
//             }
//         } while (choice != 15);
//     }
// }

// // https://templates.bwlthemes.com/blood_donation/v_2/about-us.html
// // https://tkpro-demos.envalab.com/30/template-kit/blod-home_page/
// // https://www.behance.net/gallery/85230265/Blood-Bank-Website