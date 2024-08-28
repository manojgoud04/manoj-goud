class add {
    public static void main(String args[]) {
        add.sum(new int[] { 10, 30, 50 });
    }

    static void sum(int[] no) {
        int l = 0;
        for (int i : no) {
            l = l + i;
        }
        System.out.println("Sum is:" + l);
    }
}
