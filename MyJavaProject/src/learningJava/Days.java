package learningJava;
	public class Days {
	int n1=10;
	static int n2=20;
			public static void add() {
				Days obj = new Days();
				int n3=20;
				int result=obj.n1+n3;
				System.out.println(result);
			}
			public static int substract() {
				int n4=40;
				int result=n4-n2;
				System.out.println(result);
				return result;
			}
				public void multiplication() {
					int n5=5;
					int result=n5*n1;
					System.out.println("Multiplication is : "+result);
				}
				public static int division(int n6,int n7) {
					int result=n6/n7;
					System.out.println(result);
					
					Days obj1=new Days();
					obj1.multiplication();
					return result;
				}
		
			public static void main(String args[]) {
				Days obj=new Days();
				
		Days.add();
		substract();
		obj.multiplication();
		division(20,5);
			}
		}

	



