class Calculator{
    public static int add(int a,int b){
        return a+b;
    }
    public static int substract(int a,int b){
        int k=Math.abs(a-b);
        return k;
    }
    public static int multiplication(int a,int b){
      return a*b;
    }
    public static int division(int a,int b){
        return a/b;
    }
    public static void main(String args[]){
     System.out.println(add(12,13));
     System.out.println(multiplication(5,6 ));
     System.out.println(division(12,6 ));
     System.out.println(substract(4, 8));
    }


}