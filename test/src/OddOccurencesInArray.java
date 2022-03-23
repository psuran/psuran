import java.util.HashSet;

public class OddOccurencesInArray {
/*
*if input is 9,3,3,9,7,3,9 then odd is 7
 */
    public int findOddOccurencesInArray(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0; i< arr.length; i++){
            int a =arr[i];
            if(hs.contains(a)){
                hs.remove(new Integer(a));
            }else{
                hs.add(a);
            }
        }
        return hs.iterator().next();
    }

    public static void main(String[] args) {
        OddOccurencesInArray oria = new OddOccurencesInArray();
        System.out.println(oria.findOddOccurencesInArray(new int[] {3,9,3,9,3,7,3}));
    }
}
