public class LuckyFive {

    public static void main(String[] args){
        int hedgehogs = 5;

        // This will cause an infinite loop:
        while (hedgehogs < 6) {

            System.out.println("Not enough hedgehogs!");

        }
    }
}
