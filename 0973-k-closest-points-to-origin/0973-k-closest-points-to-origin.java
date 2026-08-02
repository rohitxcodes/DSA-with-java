import java.util.*;

class Solution {

    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;

        public Point(int x, int y, int distSq) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
        }

        @Override
        public int compareTo(Point p2) {
            return Integer.compare(this.distSq, p2.distSq);
        }
    }

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Point> pq = new PriorityQueue<>();

        // Put all points into min-heap
        for (int i = 0; i < points.length; i++) {

            int x = points[i][0];
            int y = points[i][1];

            int distSq = x * x + y * y;

            pq.add(new Point(x, y, distSq));
        }

        // Take k closest points
        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {

            Point p = pq.remove();

            ans[i][0] = p.x;
            ans[i][1] = p.y;
        }

        return ans;
    }
}