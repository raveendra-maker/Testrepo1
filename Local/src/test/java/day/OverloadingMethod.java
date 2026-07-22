package day;

public class OverloadingMethod {
	
public static void add(int a){
				System.out.println("Integer: " + a);
				}

public static int add(int a, int b) {
				System.out.println(a+b);
				return a+b;
				}

public static double add(double a, double b) {
				System.out.println(a+b);
				return a+b;
				}

					
public static void main(String[] args) {
			add(3);
			add(10,30);
			add(10.1,30.4);

		}

	}


	


