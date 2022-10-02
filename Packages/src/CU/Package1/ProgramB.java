package CU.Package1;

// არაქვეკლასები იმავე პაკეტში
public class ProgramB {

    void show(){
        ProgramA pa=new ProgramA();
        System.out.println(pa.a);  // Default ჩანს
        System.out.println(pa.b); // public - ჩანს
        System.out.println(pa.c); // private არ ჩანს
        System.out.println(pa.d); // protected ჩანს


    }
}
