public class Practice312 {
    public static void main(String[] args) {
        int min = -10;
        int max = 10;
        int number = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println(number);

        if(number <= -1){
            System.out.println("負の値です。");
        }else if(number >= 1){
            System.out.println("正の数です。");
        }else if(number == 0){
            System.out.println("0です。");
        }
    }
}
