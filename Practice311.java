public class Practice311 {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100);
        System.out.println(number);
        if(number >= 20 && number < 80){
            System.out.println("20以上か80未満です。");
        }else{
            System.out.println("20未満か80以上です。");
        }
    }
}
