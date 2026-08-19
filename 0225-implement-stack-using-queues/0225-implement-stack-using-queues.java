class MyStack {

    Queue<Integer> main = new LinkedList<>();
    Queue<Integer> helper = new LinkedList<>();

    public void push(int x) {

        helper.add(x);

        while (!main.isEmpty()) {
            helper.add(main.remove());
        }

        Queue<Integer> temp = main;
        main = helper;
        helper = temp;
    }

    public int pop() {
        return main.remove();
    }

    public int top() {
        return main.peek();
    }

    public boolean empty() {
        return main.isEmpty();
    }
}