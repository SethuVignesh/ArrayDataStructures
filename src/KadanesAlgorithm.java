public class KadanesAlgorithm {

    public static void main(String[] args) {
        int a[]={-2,-3,4,-1,-2,1,5,-3,1};
        int maxSoFar=0;
        int maxCalc=0;
        int startIndex=0;
        int endIndex=0;
   for(int i=0;i<a.length;i++){
       maxSoFar=maxSoFar+a[i];
       if(maxSoFar<0) maxSoFar =0;
       else{
           if(maxCalc<maxSoFar){
               if(maxCalc==0) startIndex=i;
               maxCalc=maxSoFar;
               endIndex=i;
           }

       }


   }
   System.out.print("maxCalc "+maxCalc);
   System.out.print("startIndex "+startIndex);
   System.out.print("endIndex "+endIndex);

    }

}
