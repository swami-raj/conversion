import java.util.Scanner;
public class assigments {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true) {
            System.out.println("press 1 to convert currency :");
            System.out.println("press 2 to convert temprature: ");
            System.out.println("press 3 to convert distance: ");
            System.out.println("press 4 to exit: ");

            int choice = sc.nextInt();
            if (choice == 4) {
                break;
            }
            switch(choice){
                case 1:
                    System.out.println("press 1 to convert INR to USD");
                    System.out.println("press 2 to convert USD to INR");
                    System.out.println("press 3 to convert INR to EURO");
                    System.out.println("press 4 to convert EURO to INR");
                    System.out.println("press 5 to convert INR to POUND");
                    System.out.println("press 6 to convert POUND to INR");
                    int slayer= sc.nextInt();
                    System.out.println("enter the amount: ");
                    double amount= sc.nextDouble();
                    switch(slayer){
                        case 1:
                            System.out.println("converted amount is :" + amount/82.34);
                            break;
                        case 2:
                            System.out.println("converted amount is :" + amount*82.34);
                            break;
                        case 3:
                            System.out.println("converted amount is :" + amount/89.34);
                            break;
                        case 4:
                            System.out.println("converted amount is :" + amount*89.34);
                            break;
                        case 5:
                            System.out.println("converted amount is :" + amount/82.34);
                            break;
                        case 6:
                            System.out.println("converted amount is :" + amount*102.46);
                            break;
                        default:
                            System.out.println("sahi number daal le bhai");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("press 1 for farenheit to celcius: ");
                    System.out.println("press 2 for celcius to farenheit : ");
                    int slayer1= sc.nextInt();
                    System.out.println("enter temp :");
                    double temp= sc.nextDouble();
                    switch(slayer1){
                        case 1:
                            System.out.println("converted temp is: "+ (temp-32)*0.55);
                            break;
                        case 2:
                            System.out.println("converted temp is: "+((temp*0.55)+32));
                            break;
                        default:
                            System.out.println("sahi daal le bhai");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("press 1 for km to m: ");
                    System.out.println("press 2 for m to km: ");
                    System.out.println("press 3 for km to foot: ");
                    System.out.println("press 4 for foot to km: ");
                    int slayer2 = sc.nextInt();
                    System.out.println("enter distance: ");
                    double dis= sc.nextDouble();
                    switch (slayer2){
                        case 1:
                            System.out.println("converted distance is: "+1000*dis);
                            break;
                        case 2:
                            System.out.println("converted distance is: "+dis/1000);
                            break;
                        case 3:
                            System.out.println("converted distance is: "+dis*3281);
                            break;
                        case 4:
                            System.out.println("converted distance is: "+dis/3281);
                            break;
                        default:
                            System.out.println("kya kar raha hi: ");
                            break;
                    }
                    break;
                default:
                    System.out.println("sudhar ja yrr!!");
                    break;
            }
        }
    }
}
