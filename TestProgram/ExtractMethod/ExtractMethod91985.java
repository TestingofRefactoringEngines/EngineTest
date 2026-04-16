class MatrixSolution {
    private double[][] matrix;

    public MatrixSolution(int rows, int cols) {
        matrix = new double[rows][cols];
    }

    public void setValue(int row, int col, double value) {
        if (row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length) {
            matrix[row][col] = value;
        }
    }

    public double getValue(int row, int col) {
        if (row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length) {
            return matrix[row][col];
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        int i = 0;
        MatrixSolution solution = new MatrixSolution(5, 5);
        solution.setValue(i + 1, 0, 10.0);
        double result = solution.getValue(i + 1, 0);
        System.out.println(result);
    }
}    