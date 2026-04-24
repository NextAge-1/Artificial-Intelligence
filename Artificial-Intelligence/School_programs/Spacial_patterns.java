class Spacial_patterns {
    public static void main (){
        int sp = 0;
        for (int i = 1; i<= 4; i++){
            for (int j = 1; j<=sp; j++){
                System.out.print("  ");
            }
            sp++;
            for (int j = 4; j>i; j--){
                System.out.print(j+" ");
            }
            for (int j = i; j<=4; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    
    }
   
}