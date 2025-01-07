class Calculator{
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");   
 	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Number");
	int fno=sc.nextInt();
	int sno=sc.nextInt();
	System.out.println("Enter your choice \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division");
        int choice=sc.nextInt();
	int result=0;
      	switch(choice){
	case 1:
	result=fno+sno;
	break;
	case 2:
	result=fno-sno;
	break;

	default:
	System.out.println("Enter a valid choice");
	}
	System.out.println("Your result is "+result);
    }

}