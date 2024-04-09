package practice;

public class InheritancePractice {

	public static void main(String[] args) {

		BusinessInheritanceClass businessPerson = new BusinessInheritanceClass();

		businessPerson.name = "Taro";
		businessPerson.age = 30;

		System.out.println(businessPerson.work());

		System.out.println(businessPerson.show());

	}

}
