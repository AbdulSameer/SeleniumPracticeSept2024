package selenium_java_interview_questions.accessModifiers.privatePackage;

public class Car {
    private String model;

    private void getModel(){
        System.out.println("model: "+model);
    }
    public void setModel(String model){
        this.model = model;
        getModel();
    }
}

//A member with private access is accessible only within the class in which it is declared.
