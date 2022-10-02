package CU.Package1;

// ქვეკლასები იმავე პაკეტში
public class SubProgram extends ProgramA {

    void show(){
        System.out.println(a);  // default - ჩანს
        System.out.println(b); //  public - ჩანს
        System.out.println(c); //  private - არ ჩანს
        System.out.println(d);// protected - ჩანს
    }
}
