public class Practice304 {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100)+1;
        System.out.println(number);
        if(10 >= number || 90 <= number )
            System.out.println("10以下か90以上の値です。");
    }
}
