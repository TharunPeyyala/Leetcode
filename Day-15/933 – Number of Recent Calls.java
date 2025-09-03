class RecentCounter {
    private Deque<Integer> queue = new ArrayDeque<>();

    public RecentCounter() {}

    public int ping(int t) {
        queue.addLast(t);
        while (queue.peekFirst() < t - 3000) {
            queue.removeFirst();
        }
        return queue.size();
    }
}
