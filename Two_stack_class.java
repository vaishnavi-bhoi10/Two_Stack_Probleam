
package Day1Stack;
import java.util.Scanner;

public class Two_stack_class
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Two_stack obj = new Two_stack();

		System.out.println("Enter Size the size of Sta:");
		int size = sc.nextInt();
		obj.createStack(size);
		int ch, num;
		do {

			System.out.println("---- Menu ----");
			System.out.println();
			System.out.println(" 1. Push to Stack 1 ");
			System.out.println(" 2. Pop from Stack 1 ");
			System.out.println(" 3. Peek at Stack 1 ");
			System.out.println(" 4.Check if Stack 1 is empty ");
			System.out.println(" 5.print Stack 1 ");
			System.out.println(" 6.Push to Stack 2 ");
			System.out.println(" 7.Pop from Stack 2 ");
			System.out.println(" 8.Peek at Stack 2 ");
			System.out.println(" 9.Check if Stack 2 is empty ");
			System.out.println(" 10.print Stack 2 ");
			System.out.println(" 11.Exit");

			System.out.println("---------------------------------------------");

			System.out.println("Enter Your Choice:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				if (obj.isFull1() != true) {
					System.out.println("Enter Element :");
					num = sc.nextInt();

					obj.push1(num);
				} else {
					System.out.println("Stack is FUll..");
				}
				break;

			case 2:

				if (obj.isEmpty1() != true) {
					System.out.println("Element delete" + obj.pop1());
				} else {
					System.out.println("Stack is Empty..");
				}
				break;

			case 3:
				if (obj.isEmpty1() != true) {
					System.out.println("Element is " + obj.peek1());
				} else {
					System.out.println("Stack is Empty..");
				}
				break;

			case 4:
				System.out.println(obj.isEmpty1());
				break;

			case 5:
				if (obj.isEmpty1() != true) {
					obj.printStack1();
				} else {
					System.out.println("Stack is Empty..");
				}

				break;

			case 6:
				if (obj.isFull2() != true) {
					System.out.println("Enter Element:");
					num = sc.nextInt();

					obj.push2(num);
				} else {
					System.out.println("Stack is FUll..");
				}
				break;

			case 7:

				if (obj.isEmpty2() != true) {
					System.out.println("Element delete" + obj.pop2());
				} else {
					System.out.println("Stack is Empty..");
				}
				break;

			case 8:
				if (obj.isEmpty2() != true) {
					System.out.println("Element is " + obj.peek2());
				} else {
					System.out.println("Stack is Empty..");
				}
				break;

			case 9:
				System.out.println(obj.isEmpty2());
				break;

			case 10:
				if (obj.isEmpty2() != true) {
					obj.printStack2();
				} else {
					System.out.println("Stack is Empty..");
				}

				break;

			case 0:
				System.out.println("------END------");
				System.exit(0);
				break;

			default:
				System.out.println("Enter Valid Choice.");

			}
		} while (ch != 0);

	}

}
