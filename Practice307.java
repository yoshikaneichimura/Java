public class Practice307 {
    public static void main(String[] args) {
        int number = (int)(Math.random()*10)+1;
        System.out.println(number);
        if(number >= 5){
            System.out.println("5以上です。");
        }else if(number < 5){
            System.out.println("5未満です。");
        }
    }
}
