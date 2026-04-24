class fibonacci_sceries { 
   public static void main (int times) {
       int num = 0, f = 1, s = -1;
       System.out.print("Fibonacci series: ");
       for (int i = 0; i<=times; i++){
          num = f + s;
          if (i==times)
             System.out.print(num);
          else 
             System.out.print(num+", ");
          s = f;
          f = num;
        }
    
    }
}//https://youtu.be/XpeGVRycnk0?si=soesZ08XtabhlQWb