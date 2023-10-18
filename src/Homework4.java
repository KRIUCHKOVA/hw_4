public class Homework4 {
    public int a = 2;
    public int b = 2;
    public int c = 3;
    public int d = 2;
    public int sum1;
    public int sum2;
    public void sumAB(){
        sum1 = a + b;
        System.out.println("sum a+b equals: " + sum1);
    }
    public int sumCD(){
        sum2 = (c + d); //присвоєне значення тому шо буде возвращать функція для подальшого використання
        return sum2;
    }
    public void isSum1MoreThanSum2(){
        System.out.println("sum1 > sum2?: " + (sum1 > sum2));
    }
    public void increaseSum1to1(){
        sum1 += 1;
        System.out.println("increase sum1 +1 = " + sum1);
    }
    public void decreaseSum2to2(){
        sum2 -= 2;
        System.out.println("decrease sum 2 -2 = " + sum2);
    }
    public void isSum1OrSum2Times2() {
        System.out.println("sum1 or sum2 times 2 ?: " + ((sum1 % 2 == 0) || (sum2 % 2 == 0)));
    }
}


