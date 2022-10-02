package CU.Package2;


import CU.Package1.ProgramA;

// ქვეკლასები სხვადასხვა პაკეტში
public class SubProgram  extends ProgramA{

    void show(){
        System.out.println(a);  // default არჩანს
        System.out.println(b); // public - ჩანს
        System.out.println(c);// არ ჩანს private - ცვლადი
        System.out.println(d); // protected - ჩანს
    }
}


