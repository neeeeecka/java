package CU.Package1;
// იმავე კლასში
public class ProgramA { // კლასს შეიძლება ჰქონდეს მხოლოდ Public ან Default წვდომის მოდიფიკატორი
    public int a=10; // იმავე კლასში / ქვეკლასები იმავე პაკეტში / არაქვეკლასები იმავე პაკეტში
    public int b=20; // ყველგან
    public int c=30; // მარტო იმავე კლასში
    public int d=40; // იმავე კლასში// ქვეკლასები იმავე პაკეტში / არაქვეკლასები იმავე პაკეტში / ქვეკლასები სხვადასხვა პაკეტში

     void show(){
        System.out.println(a); //  Default - ით ჩანს
        System.out.println(b); // public - ით ჩანს
        System.out.println(c); // private - ით ჩანს
        System.out.println(d); // protected - ით ჩანს
    }
     public ProgramA(){

    }
    ProgramA(int a){

    }
    private  ProgramA(int a, int b){

    }
    protected  ProgramA(int a, int b, int c){

    }
}
