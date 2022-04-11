import java.util.Scanner;

public class matrix {public static void main(String[] args) {
	MatrixOperation obj=new MatrixOperation();
	System.out.println("choose an option"
			+ "\n1:MATRIX ADDITION"
			+ "\n2:MATRIX MULTIPLICATION"
			+ "\n3:MATRIX SUBSTRACTION"
			+ "\n4:MATRIX TRANSPOSE");
	Scanner sc=new Scanner(System.in);
	int option=sc.nextInt();
	switch(option){case 1:
		
		obj.MATRIXADDITION();
		break;
	case 2:
		
		obj.stringconcatenation();
		
		break;
	case 3:
		
		obj.stringreverse();
		break;
	case 4:
		
		obj.exit();

		break;
	}
	
	
}


}
