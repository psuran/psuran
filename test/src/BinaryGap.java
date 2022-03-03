public class BinaryGap {
    /*
    * This method will take interger as arg and return binary gap count
    * if input is 9 then binary of 9 is 1001 then it should return 2 the count of zeros between two ones
    * if it is 529 then binary is 1000010001 then it should return 7 first 4 + 3
    * if it is 8 then binary is 1000 then it should return 0
    * */
    public int getCountBinaryGap(int n){
        String bString = Integer.toString(n,2);
        System.out.println(bString);
        boolean started=false;
        int counter =0;
        int maxCounter =0;
        for(int i=0;i<bString.length();i++){
            String c = bString.substring(i,i+1);
            if(c.equals("1")){
                if(started){
                    if(counter>maxCounter){
                        maxCounter = counter;
                    }
                }
              started = true;
            }
            if(c.equals("0")){
                counter++;
            }
        }
        return maxCounter;
    }
    public static void main(String[] args) {
        BinaryGap bg = new BinaryGap();
       System.out.println(bg.getCountBinaryGap(8));
    }
}
