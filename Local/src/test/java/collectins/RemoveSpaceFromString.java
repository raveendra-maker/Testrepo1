package collectins;

import org.apache.commons.lang3.StringUtils;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		String str="    welcome to java   ";
		System.out.println(str.replaceAll("\\s+",""));
		
		//Using StringUtils
		String remString= StringUtils.deleteWhitespace(str);
		System.out.println(remString);

	}

}
