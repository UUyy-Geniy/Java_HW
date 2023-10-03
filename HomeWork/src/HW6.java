public class HW6 {
    public static class ArrayStack {
        private int Maxsize;
        private int top;
        private int[] stackArray;

        public ArrayStack(int size){
            Maxsize = size;
            top=0;
            stackArray = new int[Maxsize];
        }
        public boolean isFull(){
            return top == Maxsize-1;
        }
        public boolean isEmpty(){
            return top==0;
        }

        public void push(int elem){
            if(isFull()){
                System.out.println("Stack is full!");
                return;
            }
            stackArray[++top] = elem;
            System.out.println("Element was added: " + elem);
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty!");
                return -1;
            }
            int poppedelem = stackArray[top--];
            System.out.println("Popped elem: " + poppedelem);
            return poppedelem;
        }

        }
        public static void main(String[] args) {
            ArrayStack stack = new ArrayStack(5);
            stack.push(1);
            stack.push(2);
            stack.push(3);

            stack.pop();


        }

}

