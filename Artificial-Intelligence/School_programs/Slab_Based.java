class Slab_Based {
    public static void main(double cost){
        double price = 0;
        if (cost <= 5000)
            price = (cost*0.02);
        else if (cost >5000 && cost <= 8000)
            price = (5000*0.02)+(cost-5000)*0.05;
        else if (cost >8000 && cost <= 10000)
            price = (5000*0.02)+(3000*0.05)+(cost-8000)*0.1;
        else 
            price = (5000*0.02)+(3000*0.05)+(2000*0.1)+(cost-10000)*0.15;  
        System.out.println("Final amount is "+price); 
    }
    
}