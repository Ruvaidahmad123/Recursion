class Hanoi {
    int count = 0;

    public long toh(int n, int from, int to, int aux) {
        if (n == 1) {
            System.out.println("move disk 1 from rod " + from + " to rod " + to);
            count++;
            return count;
        }
        toh(n - 1, from, aux, to);
        System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
        count++;
        toh(n - 1, aux, to, from);

        return count;
    }
}
