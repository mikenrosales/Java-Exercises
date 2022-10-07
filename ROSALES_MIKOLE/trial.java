// public class trial{
//  public static void unique(int array[], int input[]) {
//         boolean isUnique;
//         int ctr = 0;
//         for(int i = 0; i < input.length; i++) {
//             isUnique = true;
//             for(int n : array) {
//                 if(n == input[i]) {
//                     isUnique = false;
//                     break;
//                 }
//             }
//             if(isUnique) {
//                 array[ctr] = input[i];
//                 ctr++;
//             }
//         }
 
//         for(int n : array) {
 
//             System.out.println(n);
//         }
//     }   
//     public static void main(String[] args) {
//         int array[] = new int[8];
//         int input[] = {1,2,3,1,2,3,1,2};
//         unique(array,input);
//     }
// }


public class trial{
    public static void unique(int array[ ], int input[ ]){ // mansueto
        boolean isUnique;
        int ctr = 0;
        for(int i= 0; i < input.length; i++){
            System.out.println(input[i]);
        }
    }
   
    public static void main(String[] args) {
        int array[] = new int[8];
        int input[] = {1,2,3,1,2,3,1,2};
        unique(array,input);
    }
}

