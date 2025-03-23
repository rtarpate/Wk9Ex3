public static void main (Strings[] args)
{
    //creates scanner
    Scanner myObj = new Scanner(System.in);

    //decaslves vairbles
    double ftemp;
    double ctemp;

    //promt user input
    System.out.println("Enter the temp in ferhiehght");
    //collect user input
    ftemp = Double.parseDouble(myObj.nextLine());

    //caluates temp
    ctemp = 59*(ftemp-32);


    //outputs results
    System.out.println("temp in ferihiehgt: " + ftemp + " temp in cleisus: " + ctemp);

}