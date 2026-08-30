class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for (String x : operations) {
            if (x.equals("C")) {
                s.pop();
            } else if (x.equals("D")) {
                s.push(s.peek() * 2);
            } else if (x.equals("+")) {
                int z = s.pop();
                int y = s.peek();
                int sum = z + y;
                s.push(z);
                s.push(sum);
            } else {
                s.push(Integer.parseInt(x));
            }
        }
        int ans = 0;
        while (!s.isEmpty()) {
            ans = ans + s.pop();
        }
        return ans;
    }
}