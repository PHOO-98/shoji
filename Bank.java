interface Bank {
        int calculate(int money, int months);
    }

    //NihonBank
    class NihonBank implements Bank{
        public int calculate(int money, int months) {
            return (int) (money * months * 1.01);
        }
    }
    //MizuhoBank
    class MizuhoBank implements Bank{
        public int calculate(int money, int months) {
            return (int) (money * months * 0.02);
        }
    }
    //RisonaBank
    class RisonaBank implements Bank{
        public int calculate(int money, int months){
            return (int)(money * months * 0.10);
        }
    }

class Printer{
    public void print(Bank b, int money, int months) {
        int sum = b.calculate(money, months);
        System.out.println(sum);
    }
}
class Test{
    public static void main(String[] args) {
        Bank b = new NihonBank();
        Bank m = new MizuhoBank();
        Bank r = new RisonaBank();

        Printer p = new Printer();
        
        p.print(b, 10000, 5);
        p.print(m, 10000, 5);
        p.print(r, 10000, 5);
    }

}


//hib
