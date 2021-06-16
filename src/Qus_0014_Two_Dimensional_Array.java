

public class Qus_0014_Two_Dimensional_Array {

    public static void main(String[] args) {


        int[][] arr = new int[2][3];

        for (int x = 0; x < arr.length; x++){
            for(int y=0; y <arr[x].length; y++){
                arr[x][y] = y;
           //     System.out.println(arr[x][y] + " ");
            }
        }

        for(int [] a: arr){
            for(int b : a){
                System.out.println(b);
            }
        }

    }
}
