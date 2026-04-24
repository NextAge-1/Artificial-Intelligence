class error_Finder {
    public static void main (String[] args) {
        byte b = 127;
        System.out.print(b+" ");
        if (true){
            b++;
        }
        System.out.print(b+" ");
        System.out.print(b+" ");
        if (true){
            b++;
        }
        System.out.print(b);
    }

}