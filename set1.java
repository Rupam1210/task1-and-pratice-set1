import java.util.Scanner;

public class set1 {
    public static void main(String[] args) {
                    // ---------------------
                    //   question1
                    // ----------------------
        System.out.println("Ouestion 1");
        System.out.print("Sum of the three no. is  ");
        int a=23;
        int b=53;
        int c=9;
        System.out.println(a+b+c);
                        // ---------------------
                        //   question2
                        // ----------------------
        System.out.println("Ouestion 2");
        System.out.print("CGPA of three sub is : ");
        float subj1=80;
        float subj2=78;
        float subj3=85;
        float cgpa=(subj1+subj2+subj3)/30;
        System.out.println(cgpa);
                        
                        // ---------------------
                        //   question3
                        // ----------------------
        System.out.println("Ouestion 3");
        System.out.println("What is your Name ");
        Scanner sn = new Scanner(System.in) ;
        String name=sn.next();
        System.out.println("hello "+name +" have a good day");
        sn.close();
        
                            // ---------------------
                            //   question4
                            // ----------------------
            System.out.println("Ouestion 4");
            System.out.println("Enter the kilometer to change into miles ");
            Scanner s=new Scanner(System.in);
            double kilo=s.nextDouble();
            double miles=kilo *0.621371;
            s.close();
            System.out.println(kilo +" km chnage into "+miles +" miles");
        

                        // ---------------------
                        //   question5
                        // ----------------------
        System.out.println("Ouestion 5");
        System.out.println("Enter your Number ");
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()){
            int Num=sc.nextInt();
            System.out.println(Num+" is a integer");
        }else{
            String input=sc.next();
            System.out.println(input+" is not a integer");
        }
        sc.close();


                            // ---------------------
                            //   Task1
                            // ----------------------



        Scanner input=new Scanner(System.in);
        System.out.println("Enter the marks of Subject 1:");
        int sub1=input.nextInt();
        System.out.println("Enter the marks of Subject 2:");
        int sub2=input.nextInt();
        System.out.println("Enter the marks of Subject 3:");
        int sub3=input.nextInt();
        System.out.println("Enter the marks of Subject 4:");
        int sub4=input.nextInt();
        System.out.println("Enter the marks of Subject 5:");
        int sub5=input.nextInt();

        input.close();
        int totalmarks=sub1+sub2+sub3+sub4+sub5;
        double percentage=(totalmarks/500.0)*100;
        System.out.println("Total Marks:"+totalmarks);
        System.out.print("Percentage(%) : " );
        System.out.println(String.format("%.2f", percentage));
          
    }
     
}