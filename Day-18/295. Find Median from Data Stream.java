
import java.util.PriorityQueue;
public class MedianFinder {
    private PriorityQueue<Integer> lo;
    private PriorityQueue<Integer> hi;
    public MedianFinder() {
        lo = new PriorityQueue<>((a, b) -> b - a);
        hi = new PriorityQueue<>();
    }
    public void addNum(int num) {
        if (lo.isEmpty() || num <= lo.peek()) lo.offer(num);
        else hi.offer(num);
        if (lo.size() > hi.size() + 1) hi.offer(lo.poll());
        else if (hi.size() > lo.size()) lo.offer(hi.poll());
    }
    public double findMedian() {
        if (lo.size() == hi.size()) return (lo.peek() + hi.peek()) / 2.0;
        return lo.peek();
    }
}
