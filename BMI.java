//SCIENCE EXIBITION BMI PROGRAM
import java.util.*;
class BMI
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double weight,height,BMI;//double data types
        int i;
        for(i=0;i<20;i++)//for repeition of  program
        {
            System.out.println();
            System.out.println("                           'BMI CALCULATOR'  ");
            System.out.println();
            System.out.println("INPUT WEIGHT in Kilogram :");
            weight=sc.nextDouble();
            System.out.println();
            System.out.println("INPUT HEIGHT in Meter :");
            height=sc.nextDouble();
            BMI=weight/Math.pow(height,2);
            System.out.println();
            System.out.println("YOUR BMI RANGE IS  "+ BMI +"  kilogram per meter square.");
            System.out.println();
            System.out.println("YOUR RESULT IS : ");
            System.out.println();
            if(BMI<16)//begin of if conditon
            {
                System.out.println("Severe Thinness.");
                double wt;
                wt=18.5*Math.pow(height,2);
                System.out.println();
                System.out.println("YOUR WEIGHT SHOULD BE "+wt+" kg FOR NORMAL BMI.");
            }//bmi range below 16
            else if(BMI>=16&&BMI<17)
            {
                System.out.println("Modrate Thinness.");
                double wt;
                wt=18.5*Math.pow(height,2);
                System.out.println();
                System.out.println("YOUR WEIGHT SHOULD BE "+wt+" kg FOR NORMAL BMI.");
            }//bmi range between 16-17
            else if(BMI>=17&&BMI<18.5)
            {
                System.out.println("Mild Thinness.");
                double wt;
                wt=18.5*Math.pow(height,2);
                System.out.println();
                System.out.println("YOUR WEIGHT SHOULD BE "+wt+" kg FOR NORMAL BMI.");
            }//bmi range between 17-18.5
            else if(BMI>=18.5&&BMI<25)
            {
                System.out.println("Normal.");
            }//bmi range between 18.5-25
            else if(BMI>=25&&BMI<30)
            {
                System.out.println("Over Weight.");
                double wt;
                wt=25*Math.pow(height,2);
                System.out.println();
                System.out.println("YOUR WEIGHT SHOULD BE "+wt+" kg FOR NORMAL BMI.");
            }//bmi range between 25-30
            else if(BMI>=30&&BMI<35)
            {
                System.out.println("Obese Class First.");
                double wt;
                wt=25*Math.pow(height,2);
                System.out.println();
                System.out.println("YOUR WEIGHT SHOULD BE "+wt+" kg FOR NORMAL BMI.");
            }//bmi range between 30-35
            else if(BMI>=35&&BMI<=40)
            {
                System.out.println("Obese Class Second.");
                double wt;
                wt=25*Math.pow(height,2);
                System.out.println();
                System.out.println("YOUR WEIGHT SHOULD BE "+wt+" kg FOR NORMAL BMI.");
            }//bmi range between 35-40
            else if(BMI>40)
            {
                System.out.println("Obese Class Third.");
                double wt;
                wt=25*Math.pow(height,2);
                System.out.println();
                System.out.println("YOUR WEIGHT SHOULD BE "+wt+" kg FOR NORMAL BMI.");
            }//bmi range above 40
        }//end of for loop
    }//end of main
}//end of class