package selenium_java_interview_questions.accessModifiers.defaultPackage;

 class Bike {
     String brand;
     void showBrand(){
         System.out.println("Brand: "+brand);
     }
}

//When no access modifier is specified, the member has default access (also called package-private). Members with default access can only be accessed by classes in the same package