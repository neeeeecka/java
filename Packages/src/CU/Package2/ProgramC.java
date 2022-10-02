package CU.Package2;

import CU.Package1.ProgramA;
// დამოუკიდებელი კლასები სხვადასხვა პაკეტში
public class ProgramC {

    void show(){
        ProgramA pa=new ProgramA();
        System.out.println(pa.a); // default არ ჩანს
        System.out.println(pa.b); // public  ჩანს
        System.out.println(pa.c);//  private  არ ჩანს
        System.out.println(pa.d); // protected   არ ჩანს
    }

}


