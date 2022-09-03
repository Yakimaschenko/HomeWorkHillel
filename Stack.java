public class Stack {

    int[] array = new int[10];
    int pointer = -1;

    void push(int i){
         array[++pointer] = i;
    }

    int pop() {
        return array[pointer--];
    }

    boolean isEmpty(){
        return pointer<0;
    }


    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.push(5);

        while(stack.isEmpty()){
            System.out.println("stack " + stack);
        }

    }
}



