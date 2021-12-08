package Day;

public class StringClass {

	public static void main(String[] args) {
	String name="Chinnamma";
	String name1=new String("Chinnamma");
	
	name=name+"Noolvi";
	
	StringBuffer strbuf=new StringBuffer(name);
	strbuf.append("working at ArisGlobal");
	strbuf.reverse();
	System.out.println(strbuf);
	StringBuilder strb=new StringBuilder(name);
	strb.append("one 134");
	System.out.println(strb);

	}

}
