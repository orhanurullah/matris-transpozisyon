public class Main {

    public static int[][] transPozArr(int[][] matris){
        int aLength = matris.length;
        int bLength = matris[0].length;
        int[][] newMatris = new int[bLength][aLength];
        int count = 0;
        int a = 0, b = 0, c = 0, d = 0;
        while(count++ < bLength*aLength){
            for(int i = a; i < a+1; i++){
                for(int j = b; j < b+1; j++){
                    newMatris[c][d++] = matris[i][j];
                }
            }
            if(count%2 == 0){
                a = 0;
                b++;
                d = 0;
                c++;
            }else{
                a++;
            }
        }

        return newMatris;
    }
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3,4, 7},
                {4, 5, 6,5, 8},
        };
        int[][] transpoz = transPozArr(matris);
        for(int i = 0; i < transpoz.length; i++){
            for(int j = 0; j < transpoz[i].length; j++){
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
