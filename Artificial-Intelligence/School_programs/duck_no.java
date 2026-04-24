class duck_no {
   public static void main (int num) {
       int d =0,count=0;
       while(num!=0){
           d = num%10;
           if (d==0){
               count++;System.out.print("It is a duck no.");
               System.exit(404);
           
               
            }
           num/=10;
           
        }
       System.out.print("not a duck no.");
        
       
    }
}