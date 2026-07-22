package day;

public class NumberToString {

	public static void main(String[] args) {
		int num = 100;
        double d = 99.99;

        // int → String
        String str1 = String.valueOf(num);
        System.out.println("int to String: " + str1);

        // double → String
        String str2 = Double.toString(d);
        System.out.println("double to String: " + str2);
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        sb.append(num);
        sb.reverse();
		System.out.println("StringBuffer: " + sb());
	}    

}

