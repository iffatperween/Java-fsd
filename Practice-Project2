package acess;
//Public class with a public method
class PublicAccessModifierExample {
 public void publicMethod() {
     System.out.println("This is a public method.");
 }
}

//Class with the default access modifier (package-private)
class DefaultAccessModifierExample {
 void defaultMethod() {
     System.out.println("This is a default (package-private) method.");
 }
}

//Class with a private field and a private method
class PrivateAccessModifierExample {
 private int privateField;

 private void privateMethod() {
     System.out.println("This is a private method.");
 }

 public void setPrivateField(int value) {
     privateField = value;
 }

 public int getPrivateField() {
     return privateField;
 }
}

//Class with a protected field and a protected method
class ProtectedAccessModifierExample {
 protected int protectedField;

 protected void protectedMethod() {
     System.out.println("This is a protected method.");
 }


}

public class AccessModifier {
	public static void main(String[] args) {
	     // Public access modifier example
	     PublicAccessModifierExample publicExample = new PublicAccessModifierExample();
	     publicExample.publicMethod();

	     // Default access modifier example
	     DefaultAccessModifierExample defaultExample = new DefaultAccessModifierExample();
	     defaultExample.defaultMethod();

	     // Private access modifier example
	     PrivateAccessModifierExample privateExample = new PrivateAccessModifierExample();
	     privateExample.setPrivateField(42);
	     System.out.println("Private Field Value: " + privateExample.getPrivateField());

	     // Protected access modifier example
	     ProtectedAccessModifierExample protectedExample = new ProtectedAccessModifierExample();
	     protectedExample.protectedMethod();
	 }
	}
