//Genera una matrice e popolala randomicamente in modo che i numeri non si ripetano, usando un altra matrice booleana per controllare i numeri già usati
public class Main {
    public static void main(String[] args) {
        //dichiarazione e inizializzazione delle matrici e variabili
        int[][] m = new int[3][5];
        boolean[][] b = new boolean[3][5];
        int n;
        boolean u;
        //popolamento della matrice m
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                do {
                    n = (int) (Math.random() * 90) + 1;
                    u = false;
                    for (int k = 0; k < m.length; k++) {
                        for (int l = 0; l < m[k].length; l++) {
                            if (n == m[k][l]) {
                                u = true;
                            }
                        }
                    }
                } while (u);
                m[i][j] = n;
                b[i][j] = true;
            }
        }
        //ordina la matrice m
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m.length; k++) {
                    for (int l = 0; l < m[k].length; l++) {
                        if (m[i][j] < m[k][l]) {
                            int t = m[i][j];
                            m[i][j] = m[k][l];
                            m[k][l] = t;
                        }
                    }
                }
            }
        }
        //stampa la matrice m
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}

