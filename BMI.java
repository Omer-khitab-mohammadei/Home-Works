 
package bmi;

 
public class BMI {
 
    public static void main(String[] args) {
            computeBmI person = new computeBmI("Ahmad", 30, 75, 1.86);
        String name = person.getName();
        int age = person.getAge();
        System.out.printf( "%.2f \n" ,person.getBMI());
        System.out.println("The " + name + " weight is  " + person.getStatus() + 
                " and he is " + age + " years old.");
    }
    
}
