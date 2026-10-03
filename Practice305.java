public class Practice305 {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100)+1;
        System.out.println(number);
        if(20 <= number && 80 > number)
            System.out.println("20以上80未満です。");
    }
}
