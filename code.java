package first;

public class matrisTranspoz {
    public static void main(String[] args) {
        int[][] matris = new int[2][3];
        int[][] transpoz = new int[3][2];
        int number = 1;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = number;
                number++;
                transpoz[j][i]=matris[i][j];
            }
            System.out.println();
        }
        for(int[] val : transpoz){
            for(int k : val){
                System.out.print(k+ " ");
            }
            System.out.println();
        }
    }
}
