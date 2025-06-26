package unit2;

public class Matrix {
    private double[][] matr;
    private int r;
    private int c;

    public Matrix(int r, int c) {
        this.r = r;
        this.c = c;
        this.matr = new double[r][c];
    }

    public void setMatr(int i, int j, double value) {
        if (i >= 0 && i < r && j >= 0 && j < c) {
            matr[i][j] = value;
        }
        else {
            System.out.println("Ошибка");
        }
    }

    // сложение матриц
    public Matrix add(Matrix m2) {
        if (r != m2.r || c != m2.c) {
            System.out.println("Матрицы разных размеров");
            return null;
        }

        Matrix m3 = new Matrix(r, c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m3.matr[i][j] = matr[i][j] + m2.matr[i][j];
            }
        }
        return m3;
    }

    // умножение матрицы на число
    public Matrix mulNum(double number) {
        Matrix m2 = new Matrix(r, c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m2.matr[i][j] = matr[i][j] * number;
            }
        }
        return m2;
    }

    // умножение матриц
    public Matrix multiply(Matrix m2) {
        if (c != m2.r) {
            System.out.println("Количество столбцов первой матрицы не равно количеству строк второй");
            return null;
        }

        Matrix m3 = new Matrix(r, m2.c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < m2.c; j++) {
                for (int j2 = 0; j2 < c; j2++) {
                    m3.matr[i][j] += matr[i][j2] * m2.matr[j2][j];
                }
            }
        }
        return m3;
    }

    public void printM() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
