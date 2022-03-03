import java.util.HashSet;

public class MissingNumberInArray {
    /*
    * This method takes arg as array and returns missing number in the array
    * if we pass 4,3,5,1 then it will return 2
    * */
    public int findMissingNumber(int [] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=1;i<=arr.length+1;i++){
            hs.add(new Integer(i));
        }
        for(int j=0;j<arr.length;j++){
            if(hs.contains(arr[j])){
                hs.remove(arr[j]);
            }
        }
      return hs.iterator().next();
    }

    public static void main(String[] args) {
        MissingNumberInArray mnia = new MissingNumberInArray();

    System.out.println(mnia.findMissingNumber(new int[] {4,3,2,5}));
    }
}
