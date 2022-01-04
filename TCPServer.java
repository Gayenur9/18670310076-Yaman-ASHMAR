import java.io.*;
import java.net.*;
import java.util.*;


public class TCPServer {
    private static InetAddress host;
    private static final int PORT1 = 10;
    private static final int PORT2 = 20;
    private static final int PORT3 = 30;
    private static final int PORT4 = 40; 
    private static final int PORT5 = 50;
    private static final int PORT6 = 60;
    private static final int PORT7 = 70;
    private static final int PORT8 = 80;
    
    public static void main(String[] args) {
        try {
            System.out.println("Localhost IP adresi alınıyor...");
            host = InetAddress.getLocalHost();
        } catch (Exception uhEx) {
            System.out.println("Host'un ID'si bulunamadı !");
            System.exit(1);
        }
        accessServer();
    }

    private static void accessServer() {
        Socket link1 = null;
        Socket link2 = null;
        Socket link3 = null;
        Socket link4 = null;
        Socket link5 = null;
        Socket link6 = null;
        Socket link7 = null;
        Socket link8 = null;
        
        try {
            link1 = new Socket(host, PORT1);
            link2 = new Socket(host, PORT2);
            link3 = new Socket(host, PORT3);
            link4 = new Socket(host, PORT4);
            link5 = new Socket(host, PORT5);
            link6 = new Socket(host, PORT6);
            link7 = new Socket(host, PORT7);
            link8 = new Socket(host, PORT8);
            

            Scanner input1 =
                    new Scanner(link1.getInputStream());

            PrintWriter output1 =
                    new PrintWriter(
                            link1.getOutputStream(), true);

            Scanner input2 =
                    new Scanner(link2.getInputStream());
            PrintWriter output2 =
                    new PrintWriter(
                            link2.getOutputStream(), true);

            Scanner input3 =
                    new Scanner(link3.getInputStream());
            PrintWriter output3 =
                    new PrintWriter(
                            link3.getOutputStream(), true);
            
            Scanner input4 =
                    new Scanner(link4.getInputStream());

            PrintWriter output4 =
                    new PrintWriter(
                            link4.getOutputStream(), true);
            
           Scanner input5 =
                    new Scanner(link5.getInputStream());

            PrintWriter output5 =
                    new PrintWriter(
                            link5.getOutputStream(), true);
            
            Scanner input6 =
                    new Scanner(link6.getInputStream());

            PrintWriter output6 =
                    new PrintWriter(
                            link6.getOutputStream(), true);
            
            Scanner input7 =
                    new Scanner(link7.getInputStream());

            PrintWriter output7 =
                    new PrintWriter(
                            link7.getOutputStream(), true);
            
            Scanner input8 =
                    new Scanner(link8.getInputStream());

            PrintWriter output8 =
                    new PrintWriter(
                            link8.getOutputStream(), true);
            Scanner userEntry = new Scanner(System.in);

            int id = 0;

            for (int i = 0; i < 100; i++) {

                System.out.println("Kaç tane paket gonderilecek ? ");

                String message, response;
                int number;
                response = userEntry.nextLine();
                number = Integer.parseInt(response);

                int counter = 0, attempt = 0;
                int timeoutCounter = 0;
                double timer = 0.008;

                long startTime = System.nanoTime();

                do {
                    message = "PCK" + id;

                    double time = 0;

                    do {
                        long startTimer = System.nanoTime();
                            if (controller(id) == 1) {
                            output1.println(message);
                            output2.println();
                            output3.println();
                            output4.println();
                            output5.println();
                            output6.println();
                            output7.println();
                            output8.println();                         

                            String str1 = null;
                            if (input1.hasNext())
                                str1 = input1.nextLine();

                            if (str1 != null) System.out.println("Receiver2: " + str1 + "\t");

                        } 
                        
                            else if (controller(id) == 2) {
                            output1.println();
                            output2.println(message); 
                            output3.println();
                            output4.println();
                            output5.println();
                            output6.println();
                            output7.println();
                            output8.println();

                            String str2 = null;
                            if (input2.hasNext())
                                str2 = input2.nextLine();

                            if (str2 != null) System.out.println("Receiver3: " + str2 + "\t");
                        } 
                            else if (controller(id) == 3) {
                            output1.println();
                            output2.println();
                            output3.println(message);
                            output4.println();
                            output5.println();
                            output6.println();
                            output7.println();
                            output8.println();

                            String str3 = null;
                            if (input3.hasNext())
                                str3 = input3.nextLine();

                            if (str3 != null) System.out.println("Receiver3: " + str3 + "\t");
                            }
                            else if (controller(id) == 4) {
                            output1.println();
                            output2.println();
                            output3.println();
                            output4.println(message);
                            output5.println();
                            output6.println();
                            output7.println();
                            output8.println();
                            
                            String str4 = null;
                            if (input4.hasNext())
                                str4 = input4.nextLine();

                            if (str4 != null) System.out.println("Receiver4: " + str4 + "\t");
                            }
                            else if (controller(id) == 5) {
                            output3.println();
                            output2.println();
                            output1.println();
                            output4.println();
                            output5.println(message);
                            output6.println();
                            output7.println();
                            output8.println();

                            String str5 = null;

                            if (input5.hasNext())
                                str5 = input5.nextLine();

                            if (str5 != null) System.out.println("Receiver5: " + str5 + "\t");
                        }
                            else if (controller(id) == 6) {
                            output1.println();
                            output2.println();
                            output3.println();
                            output4.println();
                            output5.println();
                            output6.println(message);
                            output7.println();
                            output8.println();

                            String str6 = null;
                            if (input6.hasNext())
                                str6 = input6.nextLine();

                            if (str6 != null) System.out.println("Receiver6: " + str6 + "\t");
                            }
                            else if (controller(id) == 7) {
                            output1.println();
                            output2.println();
                            output3.println();
                            output4.println();
                            output5.println();
                            output6.println();
                            output7.println(message);
                            output8.println();        

                            String str7 = null;
                            if (input7.hasNext())
                                str7 = input7.nextLine();

                            if (str7 != null) System.out.println("Receiver7: " + str7 + "\t");
                            }
                            else {
                            output1.println();
                            output2.println();
                            output3.println();
                            output4.println();
                            output5.println();
                            output6.println();
                            output7.println();
                            output8.println(message);            
                            String str8 = null;
                            if (input8.hasNext())
                                str8 = input8.nextLine();

                            if (str8 != null) System.out.println("Receiver8: " + str8 + "\t");
                            }

                        long finishTimer = System.nanoTime();
                        time = timerCalculate(startTimer, finishTimer);
                        if (time > timer) {
                            timeoutCounter++;
                            System.out.println("Zaman aşımı");
                        }
                    } while (time > timer);

                    attempt++;
                    counter++;
                    id++;

                    if ((counter % 10) == 0) {
                        System.out.println();
                    }
                } while (counter < number);
                long finishTime = System.nanoTime();
                System.out.println("Toplam deneme sayısı: " + attempt);
                System.out.println("veri kayıp olasılığı: " + (double) (timeoutCounter * 100 / attempt) + "%");
                System.out.println("Total time: " + (finishTime - startTime) + " nano seconds.");
            }
            output1.println("**KAPAT**");
            output2.println("**KAPAT**");
            output3.println("**KAPAT**");
            output4.println("**KAPAT**");
            output5.println("**KAPAT**");
            output6.println("**KAPAT**");
            output7.println("**KAPAT**");
            output8.println("**KAPAT**");
            userEntry.close();
        } catch (IOException  ioEx) {
            
        } finally {
            try {
                System.out.println(
                        "\n* Closing connections*");
                link1.close();
            } catch (IOException ioEx) {
                System.out.println(
                        "Unable to disconnect!");
                System.exit(1);
            }
        }
    }


    private static int controller(int id) {

        if (id % 2 == 0)
            return 1;
        else if (id % 3 == 0)
            return 2;
        else if (id % 5 == 0)
            return 3;
        else if (id % 7 == 0)
            return 4;
        else if (id % 11 == 0)
            return 5;
        else if (id % 13 == 0)
            return 6;
        else if (id % 17 == 0)
            return 7;
        else
            return 8;

    }
    
    private static double timerCalculate(double start, double finish) {
        return (finish - start) / Math.pow(10, 9);
    }


}