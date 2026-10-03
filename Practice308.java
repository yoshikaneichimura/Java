public class Practice308 {
    public static void main(String[] args) {
        int number = (int)(Math.random()*10)+1;
        System.out.println(number);
        if(number != 1){
            System.out.println("1ではありません。");
        }else{
            System.out.println("1です。");
        }
    }
}
