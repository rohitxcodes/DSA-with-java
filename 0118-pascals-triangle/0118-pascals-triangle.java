class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>(Collections.nCopies(row + 1, 1));

            for (int col = 1; col < row; col++) {
                int valueAbove = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                currentRow.set(col, valueAbove);
            }

            triangle.add(currentRow);
        }

        return triangle;
    }
}