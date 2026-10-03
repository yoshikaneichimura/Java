public class Practice313 {
    public static void main(String[] args) {
        int number = (int)(Math.random()*3)+1;
        System.out.println(number);
        if(number == 1){
            System.out.println("グー");
        }else if(number == 2){
            System.out.println("パー");
        }else if(number == 3){
            System.out.println("チョキ");
        }
    }
}
