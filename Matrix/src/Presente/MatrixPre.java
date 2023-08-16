package Presente;

import Model.*;
import View.*;
import java.util.ArrayList;

public class MatrixPre {
    private Matrix model;
    private View view;

    public MatrixPre(Matrix model, View view) {
        this.model = model;
        this.view = view;
    }

    public void displayOriginalMatrix() {
        ArrayList<ArrayList<Integer>> matrix = model.getMatrix();
        view.printMatrix(matrix);
    }

    public void displayTransposedMatrix() {
        ArrayList<ArrayList<Integer>> transposedMatrix = model.getTransposedMatrix();
        view.printMatrix(transposedMatrix);
    }
}
