package Stacks_and_queues;

public class customStack {
        protected int[] data ;
        private static final int DEFAULT_SIZE=10 ;

    public customStack(int size) {
        this.data = new int[size];
    }

    public customStack() {
        this(DEFAULT_SIZE) ;
    }

    public static void main(String[] args) {

    }
}
