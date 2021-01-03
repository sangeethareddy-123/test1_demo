import java.util.Arrays;

public class ArrayExampl2 {
//class ReorgArray{
    public static void main(String[] args){
        // original elements
        int[] original = {-91, 78, 2, 46, 98, 102};
        int lengthOfArray = original.length;
        int[] reOrg = new int[lengthOfArray];
        int index =0, originalIndex=0, originalIndexFromLast = 5;
        while(index<lengthOfArray && originalIndex<=(lengthOfArray/2) && originalIndexFromLast>=(lengthOfArray/2)){
            if(index%2==0){
                reOrg[index] = original[originalIndex++];
            } else{
                reOrg[index]= original[originalIndexFromLast--];
            }
            index++;
        }

        // reorg elements
        for(int i =0;i<lengthOfArray;i++) {
            System.out.println(reOrg[i]);

        }
        Arrays.sort(original);
        boolean equals = Arrays.equals(original, reOrg);
        System.out.println(equals);
    }
}