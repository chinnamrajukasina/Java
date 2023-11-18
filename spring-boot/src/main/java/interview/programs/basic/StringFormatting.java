package interview.programs.basic;
public class StringFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String 	name = "Raju";
String country = "India";
String technology = "Java";
System.out.println("Hi, My name is %s.\nI am from %s and I'm using Technology %s\n".formatted(name, country, technology));

System.out.printf("Hi, My name is %s.\nI am from %s and I'm using Technology %s",name,country,technology);


	}

}
