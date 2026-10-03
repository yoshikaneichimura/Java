public class Practice310 {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100)+1;
        System.out.println(number);
        if(number <= 10 || number >= 90){
            System.out.println("10以下か90以上の値です。");
        }else{
            System.out.println("10より大きく90未満です。");
        }
    }
}
