public class Triangle {
    int a;
    int b;
    int c;

    public void getArea (){
        // Уч бурчтуктун аянтын Герондун формуласы менен табабыз
        // Биринчи жарым периметрды таап алабыз
        double P = (double) (a+b+c)/2;
        System.out.println("Жарым периметрдин чыккан мааниси: " +P);
        double count = Math.sqrt(P*(P-a)*(P-b)*(P-c));
        System.out.println("Уч бурчтуктун аянты: "+Math.round(count));
    }

}
