package Model;

import java.util.ArrayList;
public class Matrix {
    private ArrayList<ArrayList<Integer>> matrix;

    public Matrix(ArrayList<ArrayList<Integer>> matrix) {
        this.matrix = matrix;
    }

    public ArrayList<ArrayList<Integer>> getMatrix() {
        return matrix;
    }

    public ArrayList<ArrayList<Integer>> getTransposedMatrix() {
        int rows = matrix.size();
        int cols = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> transposed = new ArrayList<>();
        for (int j = 0; j < cols; j++) {
            ArrayList<Integer> column = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                column.add(matrix.get(i).get(j));
            }
            transposed.add(column);
        }
        return transposed;
    }
}

