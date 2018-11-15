package com.demo_Srtring;
/**
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * 
 *
 */
public class Replace {

	public static void main(String[] args) {
		String str=" We Are Happy";
		String res = replaceString(str);
		System.out.println(res);
		StringBuffer strb= new StringBuffer(" We Are Happy");
		String resb = replaceStringBuffer(strb);
		System.out.println(resb);
		int replaceBlank = replaceBlank(str,13);
		System.out.println(replaceBlank);
		replace(str);
		

	}
	//ʹ��String
	public static String replaceString(String str){
		char[] c= str.toCharArray();
		String nstr="";
		for (int i = 0; i < c.length; i++) {
			if(c[i]==' '){
				nstr=nstr+"%20";
			}else {
				nstr=nstr+c[i];
			}
		}
		
		return nstr;
	}
	public static int replaceBlank(String string, int length) {
        // write your code here
        char[] c= string.toCharArray();
		String nstr="";
		for (int i = 0; i < length; i++) {
			if(c[i]==' '){
				nstr=nstr+"%20";
			}else {
				nstr=nstr+c[i];
			}
		}
        return nstr.length();
    }
	//ʹ��StringBuffer
	public static String replaceStringBuffer(StringBuffer strb){
		String nstr=strb.toString();
		char[] c=nstr.toCharArray();
		StringBuffer strbb= new StringBuffer();
		for (int i = 0; i < c.length; i++) {
			if(c[i]==' '){
				strbb.append("%20");
			}else {
				strbb.append(c[i]);
			}
		}
		return strbb.toString();
	}

	public static void replace(String str){

		String s = str.replaceAll(" ", "%20");
		System.out.println(s);

	}

}
