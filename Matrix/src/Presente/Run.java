package Presente;

import Model.Matrix;
import View.View;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> originalMatrix = new ArrayList<>();
        originalMatrix.add(new ArrayList<>(java.util.Arrays.asList(1, 2, 3)));
        originalMatrix.add(new ArrayList<>(java.util.Arrays.asList(4, 5, 6)));
        originalMatrix.add(new ArrayList<>(java.util.Arrays.asList(7, 8, 9)));

        Matrix model = new Matrix(originalMatrix);
        View view = new View();
        MatrixPre presenter = new MatrixPre(model, view);

        System.out.println("Original Matrix:");
        presenter.displayOriginalMatrix();

        System.out.println("\nTransposed Matrix:");
        presenter.displayTransposedMatrix();
    }
}

