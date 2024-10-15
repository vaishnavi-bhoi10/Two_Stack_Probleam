package Day1Stack;

public class Two_stack {
	int stack[], maxSize, tos1, tos2;

	void createStack(int size) {
		tos1 = -1;
		stack = new int[size];
		maxSize = size;
		tos2 = maxSize;
	}

	void push1(int e) {
		tos1++;
		stack[tos1] = e;
		System.out.println(e + "pushed");
	}

	boolean isFull1() {
		if (tos1 == maxSize - 1)
			return true;
		else
			return false;
	}

	int pop1() {
		int temp = stack[tos1];
		tos1--;
		return temp;
	}

	boolean isEmpty1() {
		if (tos1 == -1)
			return true;
		else
			return false;
	}

	int peek1() {
		return stack[tos1];
	}

	void printStack1() {
		System.out.println("Elements Are :");
		for (int i = tos1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

	void push2(int e) {
		tos2--;
		stack[tos2] = e;
		System.out.println(e + "pushed");
	}

	boolean isFull2() {
		if (tos2 == -1)
			return true;
		else
			return false;
	}

	int pop2() {
		int temp = stack[tos2];
		tos2++;
		return temp;
	}

	boolean isEmpty2() {
		if (tos1 == maxSize)
			return true;
		else
			return false;
	}

	int peek2() {
		return stack[tos2];
	}

	void printStack2() {
		System.out.println("Elements Are :");
		for (int i = tos2; i < maxSize; i++) {
			System.out.println(stack[i]);
		}
	}

}
