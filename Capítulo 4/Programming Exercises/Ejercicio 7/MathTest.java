/*
Escriba una aplicación Java que use la clase Math para determinar 
las respuestas para cada uno de los siguientes:
 */
package mathtest;

public class MathTest {

 
    public static void main(String[] args) {
        System.out.println("a. The square root of 37: "+Math.sqrt(37));
        System.out.println("\nb. The sine and cosine of 300:\nsine: "+Math.sin(300)+"\ncosine: "+Math.cos(300));
        System.out.println("\nc. The value of the floor, ceiling, and round of 22.8:\nfloor: "+Math.floor(22.8)+
                "\nceiling: "+Math.ceil(22.8)+"\nround: "+Math.round(22.8));
        System.out.println("\nd. The larger and the smaller of the character “D” and the integer 71:\nlarger: "+Math.max('D',71)+
                "\nsmaller: "+Math.min('D',71));
        System.out.println("\ne. A random number between 0 and 20 (Hint: The random() method returns a\n" +
"value between 0 and 1; you want a number that is 20 times larger.): "+ Math.random() * 20 + 1);

    }
    
}
