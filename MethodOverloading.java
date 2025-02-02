class MathOperations{
int calculate(int a){
return a*a;
}
int calculate(int a, int b){
return a*b;
}
int calculate(int a, int b, int c){
return a*b*c;
}
}
class  MethodOverloading{
public static void main(String[] args){
MathOperations M=new MathOperations();
M.calculate(9);
M.calculate(5,7);
M.calculate(6,9,10);
System.out.println("Square of one:"+M.calculate(9));
System.out.println("Square of two:"+M.calculate(5,7));
System.out.println("Square of one:"+M.calculate(6,9,10));
}
}










