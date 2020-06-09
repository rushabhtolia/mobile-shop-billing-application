// Welcome to MOBILE SHOP
import java.io.*;
public class live
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        int choice,type,company,sam,micro,nokia,sony,LG,company1,lumia,htc,company2,samk,nokiak,price,sp,d=0;
        int wish=1;
        char con;
        String name,add,name1,comp1,model;
         System.out.println("Welcome to mobile store");
          System.out.println("");
           System.out.println("What do you want to do");
            System.out.println("");
        System.out.println(" 1. To purchase a mobile");
        System.out.println(" 2. To sell a mobile");
        System.out.println("");
        System.out.println(" Enter your choice");        
        choice=Integer.parseInt(in.readLine());
        System.out.println("");
        switch (choice)
        {
        case 1:
        System.out.println("You can purchase phone of your own choice :");
        System.out.println("");
        System.out.println(" Select the type of mobile with O.S to be purchased");
        System.out.println("");
        System.out.println(" 1. Android");
        System.out.println(" 2. Windows");
        System.out.println(" 3. Keypad");
        System.out.println("");
        type=Integer.parseInt(in.readLine());
        System.out.println("");
        
        switch (type)
        {
            case 1:
            System.out.println(" Select the mobile company with Andriod OS");
            System.out.println("");
            System.out.println(" 1. Samsung");
            System.out.println(" 2. Micromax");
            System.out.println(" 3. Nokia");
            System.out.println(" 4. Sony");
            System.out.println(" 5. LG");
            System.out.println("");
            System.out.println("Enter your choice");
            company=Integer.parseInt(in.readLine());
            System.out.println("");
            switch (company)
        {
            case 1:
            while(wish==1)
            {
            System.out.println(" Select the mobile to view specifications :");
            System.out.println("  ");
            System.out.println(" 1. Samsung Alpha  ");
            System.out.println(" 2. Samsung Galaxy Note II  ");
            System.out.println(" 3. Samsung Galaxy Grand ");
            System.out.println(" 4. Samsung Galaxy Note III ");
            System.out.println(" 5. Samsung Galaxy S V Mini ");
            System.out.println(" 6. Samsung Galaxy S Advance ");
            System.out.println(" 7. Samsung Galaxy S II ");
            System.out.println(" 8. Samsung Galaxy Core ");
            System.out.println(" 9. Samsung Galaxy Star Advance ");
            System.out.println(" 10.Samsung Galaxy Core 2 DUAL  ");
            System.out.println("");
            System.out.println("Enter your choice");
            sam=Integer.parseInt(in.readLine());
            System.out.println("");
        switch (sam)
           {
            case 1:
            System.out.println("");
            System.out.println(" The specifications for Samsung Alpha are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 2 GB   ");
            System.out.println("SIM: nano SIM   ");
            System.out.println("MEMORY: 32 GB   ");
            System.out.println("OS: Android OS, v4.4.4 (KitKat)   ");
            System.out.println("M.P. : 12 MP, 4608 x 2592 pixels, autofocus, LED flash   ");
            System.out.println("DISPLAY : 720 x 1280 pixels, 4.7 inches (~312 ppi pixel density)   ");
            System.out.println("COLOR : White,Black   ");
            System.out.println("PRICE :  Rs. 37,000.00   ");
            break;
            case 2:
            System.out.println("");
            System.out.println(" The specifications for Samsung Galaxy Note II are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 2 GB   ");
            System.out.println("SIM: micro SIM   ");
            System.out.println("MEMORY: 16/32/64 GB   ");
            System.out.println("OS: Android OS, v4.1.1 (Jelly Bean), upgradable to v4.4.2 (KitKat)   ");
            System.out.println("M.P. : 8 MP, 3264 x 2448 pixels, autofocus, LED flash   ");
            System.out.println("DISPLAY : 720 x 1280 pixels, 5.5 inches (~267 ppi pixel density)   ");
            System.out.println("COLOR : White,Black   ");
            System.out.println("PRICE :  Rs. 31,500.00   ");
            break;
            case 3:
            System.out.println("");
            System.out.println(" The specifications for Samsung Galaxy Grand are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 2 GB   ");
            System.out.println("SIM: Dual SIM (Mini-SIM, dual stand-by)   ");
            System.out.println("MEMORY: card- microSD, up to 64 GB , INTERNAL : 8 GB   ");
            System.out.println("OS: Android OS, v4.1.2 (Jelly Bean), upgradable to v4.2.2 (Jelly Bean)");
            System.out.println("M.P. : 8 MP, 3264 x 2448 pixels, autofocus, LED flash   ");
            System.out.println("DISPLAY : 480 x 800 pixels, 5.0 inches (~187 ppi pixel density)   ");
            System.out.println("COLOR : White,Black   ");
            System.out.println("PRICE :  Rs. 12,570.00   ");
            break;
            case 4:
            System.out.println("");
            System.out.println(" The specifications for Samsung Galaxy Note III are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 2 GB   ");
            System.out.println("SIM: micro SIM   ");
            System.out.println("MEMORY: 16 GB (11 GB user available)   ");
            System.out.println("OS: Android OS, v4.3 (Jelly Bean), upgradable to v4.4.2 (KitKat)   ");
            System.out.println("M.P. :8 MP, 3264 x 2448 pixels, autofocus, LED flash   ");
            System.out.println("DISPLAY : 720 x 1280 pixels, 5.5 inches (~267 ppi pixel density)   ");
            System.out.println("COLOR : White,Black   ");
            System.out.println("PRICE :  Rs. 23,900.00   ");
            break;
            case 5:
            System.out.println("");
            System.out.println(" The specifications for Samsung Galaxy S V Mini are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1.5 GB   ");
            System.out.println("SIM: Dual SIM (Micro-SIM, dual stand-by)  ");
            System.out.println("MEMORY: 16 GB   ");
            System.out.println("OS:  Android OS, v4.4.4 (KitKat)   ");
            System.out.println("M.P. : 8 MP, 3264 x 2448 pixels, autofocus, LED flash  ");
            System.out.println("DISPLAY : 720 x 1280 pixels, 4.5 inches (~326 ppi pixel density");
            System.out.println("COLOR : White,Black   ");
            System.out.println("PRICE :  Rs. 22,999.00   ");
            break;
            case 6:
            System.out.println("");
            System.out.println(" The specifications for Samsung Galaxy S Advance are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 768 MB   ");
            System.out.println("SIM: mini SIM   ");
            System.out.println("MEMORY: microSD, up to 32 GB   ");
            System.out.println("OS: Android OS, v2.3.6 (Gingerbread), upgradable to v4.1.2 (Jelly Bean)");
            System.out.println("M.P. : 5 MP, 2592 x 1944 pixels, autofocus, LED flash   ");
            System.out.println("DISPLAY : 480 x 800 pixels, 4.0 inches (~233 ppi pixel density)   ");
            System.out.println("COLOR : Grey,Black   ");
            System.out.println("PRICE :  Rs. 21,000.00   ");
            break;
            case 7:
            System.out.println("");
            System.out.println(" The specifications for Samsung Galaxy S II are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: mini SIM   ");
            System.out.println("MEMORY: 16/32 GB   ");
            System.out.println("OS: Android OS, v2.3.4 (Gingerbread), v4.0.4 (Ice Cream Sandwich), upgradable to v4.1 (Jelly Bean)   ");
            System.out.println("M.P. : 8 MP, 3264 x 2448 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY :  480 x 800 pixels, 4.3 inches (~217 ppi pixel density) ");
            System.out.println("COLOR : Black ");
            System.out.println("PRICE :  Rs. 27,600.00   ");
            break;
            case 8:
            System.out.println("");
            System.out.println(" The specifications for Samsung Galaxy Core are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 768 MB   ");
            System.out.println("SIM: Dual SIM (Micro-SIM, dual stand-by)   ");
            System.out.println("MEMORY: 4 GB   ");
            System.out.println("OS: Android OS, v4.4.2 (KitKat)   ");
            System.out.println("M.P. : 5 MP, 2592 ? 1944 pixels, autofocus, LED flash   ");
            System.out.println("DISPLAY : 480 x 800 pixels, 4.5 inches (~207 ppi pixel density)  ");
            System.out.println("COLOR : White,Black   ");
            System.out.println("PRICE :  Rs. 14,180.00   ");
            break;
            case 9:
            System.out.println("");
            System.out.println(" The specifications for Samsung Galaxy Star Advance are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 512 MB   ");
            System.out.println("SIM: Optional Dual SIM (Micro-SIM, dual stand-by)   ");
            System.out.println("MEMORY: 4 GB   ");
            System.out.println("OS: Android OS, v4.4.2 (KitKat)  ");
            System.out.println("M.P. :  3.15 MP, 2048 x 1536 pixels, LED flash  ");
            System.out.println("DISPLAY : 480 x 800 pixels, 4.3 inches (~217 ppi pixel density)   ");
            System.out.println("COLOR : White,Black   ");
            System.out.println("PRICE :  Rs. 6,490.00   ");
            break;
            case 10:
            System.out.println("");
            System.out.println(" The specifications for Samsung Galaxy Core 2 DUAL are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 768 GB   ");
            System.out.println("SIM:  Dual SIM (Micro-SIM, dual stand-by)   ");
            System.out.println("MEMORY: 4 GB   ");
            System.out.println("OS:  Android OS, v4.4.2 (KitKat) ");
            System.out.println("M.P. : 5 MP, 2592 ? 1944 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 480 x 800 pixels, 4.5 inches (~207 ppi pixel density)");
            System.out.println("COLOR : White,Black   ");
            System.out.println("PRICE :  Rs. 8,099.99   ");
            break;
            default:
            System.out.println("Please try again");
           }
           System.out.println("");
            System.out.println("");
           System.out.println("If want to buy: press 0 ");
           System.out.println("");
           wish=Integer.parseInt(in.readLine());
           if(wish==0)
           {
           System.out.println("Enter your name:");
           name=in.readLine();
           System.out.println("");
           System.out.println("Enter your address:");
           add=in.readLine();
           System.out.println("");
           System.out.println("It will be delivered within 2 working days ");
           System.out.println("");
           System.out.println("The transaction is successful ");
           System.out.println("");
System.out.println("THANK YOU FOR SHOPPING ");
System.out.println("");
System.out.println("PLEASE VISIT US AGAIN ");
        }
    }
         break;
            case 2:
            wish=1;
     while(wish==1)
         {
             System.out.println("");
            System.out.println(" Select the mobile to view specifications :");
            System.out.println("  ");
            System.out.println(" 1. Micromax Canvas 3D  ");
            System.out.println(" 2. Micromax Canvas 4  ");
            System.out.println(" 3. Micromax A90 ");
            System.out.println(" 4. Micromax Canvas Nitro ");
            System.out.println(" 5. Micromax A119 Canvas XL ");
            System.out.println(" 6. Micromax A91 Ninja ");
            System.out.println("");
            System.out.println("Enter your choice");
            micro=Integer.parseInt(in.readLine());
            switch (micro)
        {
            case 1:
            System.out.println("");
            System.out.println(" The specifications for Micromax Canvas 3D are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 512 MB   ");
            System.out.println("SIM: Dual SIM (dual stand-by) ");
            System.out.println("MEMORY: 4 GB   ");
            System.out.println("OS: Android OS, v4.1.2 (Jelly Bean)  ");
            System.out.println("M.P. : 5 MP, 2560 x 1920 pixels, autofocus, LED flash  ");
            System.out.println("DISPLAY :  480 x 800 pixels, 5.0 inches (~187 ppi pixel density)   ");
            System.out.println("COLOR : White,Black   ");
            System.out.println("PRICE :  Rs. 14,549.00   ");
            break;
            case 2:
            System.out.println("");
            System.out.println(" The specifications for Micromax Canvas 4 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Dual SIM (dual stand-by)   ");
            System.out.println("MEMORY: 16 GB (10 GB user available)   ");
            System.out.println("OS:  Android OS, v4.2.1 (Jelly Bean)  ");
            System.out.println("M.P. : 13 MP, 4128 x 3096 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 720 x 1280 pixels, 5.0 inches (~294 ppi pixel density) ");
            System.out.println("COLOR : White ");
            System.out.println("PRICE :  Rs. 13,752.00");
            break;
            case 3:
            System.out.println("");
            System.out.println(" The specifications for Micromax A90 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 512 MB   ");
            System.out.println("SIM: Dual SIM (Mini-SIM) ");
            System.out.println("MEMORY: 4 GB (2 GB user available) ");
            System.out.println("OS:  Android OS, v4.0.3 (Ice Cream Sandwich)   ");
            System.out.println("M.P. :  8 MP, 3264 x 2448 pixels, LED flash  ");
            System.out.println("DISPLAY : 480 x 800 pixels, 4.3 inches (~217 ppi pixel density) ");
            System.out.println("COLOR : White ");
            System.out.println("PRICE :  Rs. 11,931.00   ");
            break;
            case 4:
            System.out.println("");
            System.out.println(" The specifications for Micromax Canvas Nitro are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 2 GB   ");
            System.out.println("SIM: Dual SIM   ");
            System.out.println("MEMORY: 8 GB   ");
            System.out.println("OS: Android OS, v4.4.2 (KitKat) ");
            System.out.println("M.P. : 13 MP, 4128 x 3096 pixels, autofocus, LED flash   ");
            System.out.println("DISPLAY :  720 x 1280 pixels, 5.0 inches (~294 ppi pixel density)");
            System.out.println("COLOR : White,Black   ");
            System.out.println("PRICE :  Rs. 12,271.00   ");
            break;
            case 5:
            System.out.println("");
            System.out.println(" The specifications for Micromax A119 Canvas XL are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Dual SIM (Dual stand-by)   ");
            System.out.println("MEMORY: 4 GB (2 GB user available)   ");
            System.out.println("OS:   Android OS, v4.2 (Jelly Bean)  ");
            System.out.println("M.P. : 8 MP, 3264 x 2448 pixels, autofocus, dual-LED flash ");
            System.out.println("DISPLAY : 540 x 960, 6.0 inches (~184 ppi pixel density)  ");
            System.out.println("COLOR : White,Blue ");
            System.out.println("PRICE :  Rs. 12,999.00   ");
            break;
            case 6:
            System.out.println("");
            System.out.println(" The specifications for Micromax A91 Ninja are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 512 MB   ");
            System.out.println("SIM: Dual SIM   ");
            System.out.println("MEMORY: 2 GB   ");
            System.out.println("OS: Android OS, v4.0 (Ice Cream Sandwich) ");
            System.out.println("M.P. :  5 MP, 2592 ? 1944 pixels  ");
            System.out.println("DISPLAY :  480 x 854 pixels, 4.5 inches (~218 ppi pixel density)   ");
            System.out.println("COLOR : White,Black ");
            System.out.println("PRICE :  Rs. 8,237.00 ");
            break;
            default:
            System.out.println("Please try again");
        }
        System.out.println("");
           

           System.out.println("");
           System.out.println("If want to buy: press 0 ");
           System.out.println("");
           wish=Integer.parseInt(in.readLine());
           if(wish==0)
           {
           System.out.println("Enter your name:");
           name=in.readLine();
           System.out.println("");
           System.out.println("Enter your address:");
           add=in.readLine();
           System.out.println("");
           System.out.println("It will be delivered within 2 working days ");
           System.out.println("");
           System.out.println("The transaction is successful ");
           System.out.println("");
System.out.println("THANK YOU FOR SHOPPING ");
System.out.println("");
System.out.println("PLEASE VISIT US AGAIN ");
        }
    }
        break;
        case 3:
        wish=1;
            while(wish==1)
         {
             System.out.println("");
        System.out.println(" Select the mobile to view specifications :");
            System.out.println("  ");
            System.out.println(" 1. Nokia X  ");
            System.out.println(" 2. Nokia XL  ");
            System.out.println("");
            nokia=Integer.parseInt(in.readLine());
            switch (nokia)
        {
            case 1:
            System.out.println("");
            System.out.println(" The specifications for Nokia X are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 512 MB   ");
            System.out.println("SIM: Optional Dual SIM (Micro-SIM) ");
            System.out.println("MEMORY: 4 GB   ");
            System.out.println("OS: Android OS, v4.1.2 (Jelly Bean)  ");
            System.out.println("M.P. :  3.15 MP, 2048 x 1536 pixels ");
            System.out.println("DISPLAY : 480 x 800 pixels, 4.0 inches (~233 ppi pixel density) ");
            System.out.println("COLOR : Black, Yellow, Green, Light Blue ");
            System.out.println("PRICE :  Rs. 5,319.00   ");
            break;
            case 2:
            System.out.println("");
            System.out.println(" The specifications for Nokia XL are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 768 MB   ");
            System.out.println("SIM: Optional Dual SIM (Micro-SIM) ");
            System.out.println("MEMORY: 4 GB   ");
            System.out.println("OS: Android OS, v4.1.2 (Jelly Bean)  ");
            System.out.println("M.P. : 5 MP, 2592 ? 1944 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY :  480 x 800 pixels, 5.0 inches (~187 ppi pixel density)  ");
            System.out.println("COLOR : Green, Yellow, Pink ");
            System.out.println("PRICE :  Rs. 11,200.00   ");
            break;
            default:
            System.out.println("Please try again");
        }
        System.out.println("");
           System.out.println("Do you want to choose another model: Press 1 ");
            
           System.out.println("If want to buy: press 0 ");
           System.out.println("");
           wish=Integer.parseInt(in.readLine());
           if(wish==0)
           {
           System.out.println("Enter your name:");
           name=in.readLine();
           System.out.println("");
           System.out.println("Enter your address:");
           add=in.readLine();
           System.out.println("");
           System.out.println("It will be delivered within 2 working days ");
           System.out.println("");
           System.out.println("The transaction is successful ");
           System.out.println("");
System.out.println("THANK YOU FOR SHOPPING ");
System.out.println("");
System.out.println("PLEASE VISIT US AGAIN ");
System.out.println("");
        }
    }
    break;
        case 4:
        wish=1;
    while(wish==1)
      {
            System.out.println(" Select the mobile to view specifications :");
            System.out.println("  ");
            System.out.println(" 1. Xperia E3 Dual  ");
            System.out.println(" 2. Xperia Z3  ");
            System.out.println(" 3. Xperia T3 ");
            System.out.println(" 4. Xperia C2 dual ");
            System.out.println(" 5. Xperia Z2 ");
            System.out.println(" 6. Xperia M2 ");
            System.out.println(" 7. Xperia Z1 ");
            System.out.println(" 8. Xperia M ");
            System.out.println(" 9. Xperia C ");
            System.out.println(" 10. Xperia ZR  ");
            System.out.println("");
            System.out.println("Enter your choice");
            sony=Integer.parseInt(in.readLine());
        switch (sony)
          {
            case 1:
            System.out.println("");
            System.out.println(" The specifications for Xperia E3 Dual  are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM:  Dual SIM (Micro-SIM, dual stand-by)   ");
            System.out.println("MEMORY: 4 GB   ");
            System.out.println("OS: Android OS, v4.4.2 (KitKat)   ");
            System.out.println("M.P. :  5 MP, 2592 ? 1944 pixels, autofocus, LED flash   ");
            System.out.println("DISPLAY : 480 x 854 pixels, 4.5 inches (~218 ppi pixel density)  ");
            System.out.println("COLOR : White,Black,Gold ");
            System.out.println("PRICE :  Rs. 12,000.00 ");
            break;
             case 2:
             System.out.println("");
            System.out.println(" The specifications for Xperia Z3  are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 3 GB   ");
            System.out.println("SIM:  Nano SIM   ");
            System.out.println("MEMORY: 16/32 GB   ");
            System.out.println("OS: Android OS, v4.4.4 (KitKat), planned upgrade to v5.0 (Lollipop)");
            System.out.println("M.P. : 20.7 MP, 5248 ? 3936 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 1080 x 1920 pixels, 5.2 inches (~424 ppi pixel density)  ");
            System.out.println("COLOR : White,Black ");
            System.out.println("PRICE :  Rs. 49,843.00 ");
            break;
             case 3:
             System.out.println("");
            System.out.println(" The specifications for Xperia T3 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM:  Micro-SIM");
            System.out.println("MEMORY: 8 GB   ");
            System.out.println("OS:  Android OS, v4.4.2 (KitKat)   ");
            System.out.println("M.P. :  8 MP, 3264 x 2448 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 720 x 1280 pixels, 5.3 inches (~277 ppi pixel density) ");
            System.out.println("COLOR : White,Black");
            System.out.println("PRICE :  Rs. 25,000.00 ");
            break;
             case 4:
             System.out.println("");
            System.out.println(" The specifications for Xperia C2 dual are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM:  Dual SIM (Micro-SIM, dual stand-by, dual call)  ");
            System.out.println("MEMORY: 8 GB   ");
            System.out.println("OS: Android OS, v4.4.2 (KitKat)   ");
            System.out.println("M.P. :  8 MP, 3264 x 2448 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 720 x 1280 pixels, 5.5 inches (~267 ppi pixel density) ");
            System.out.println("COLOR : White,Black");
            System.out.println("PRICE :  Rs. 23,000.00 ");
            break;
             case 5:
             System.out.println("");
            System.out.println(" The specifications for Xperia Z2 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 3 GB   ");
            System.out.println("SIM:  Micro SIM  ");
            System.out.println("MEMORY: 16 GB   ");
            System.out.println("OS:  Android OS, v4.4.2 (KitKat), planned upgrade to v5.0 (Lollipop)   ");
            System.out.println("M.P. : 20.7 MP, 5248 ? 3936 pixels, autofocus, LED flash  ");
            System.out.println("DISPLAY : 1080 x 1920 pixels, 5.2 inches (~424 ppi pixel density)  ");
            System.out.println("COLOR : White,Black ");
            System.out.println("PRICE : Rs. 34,493.00 ");
            break;
             case 6:
             System.out.println("");
            System.out.println(" The specifications for Xperia M2 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Micro SIM  ");
            System.out.println("MEMORY: 8 GB   ");
            System.out.println("OS: Android OS, v4.3 (Jelly Bean), upgradable to v4.4.4 (KitKat) ");
            System.out.println("M.P. : 8 MP, 3264 x 2448 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 540 x 960 pixels, 4.8 inches (~229 ppi pixel density) ");
            System.out.println("COLOR : White,Black");
            System.out.println("PRICE :  Rs. 15,490.00 ");
            break;
             case 7:
             System.out.println("");
            System.out.println(" The specifications for Xperia Z1 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 2 GB   ");
            System.out.println("SIM: Micro SIM ");
            System.out.println("MEMORY: 16 GB   ");
            System.out.println("OS: Android OS, v4.2 (Jelly Bean), upgradable to v4.4.4 (KitKat), planned upgrade to v5.0 (Lollipop) ");
            System.out.println("M.P. : 20.7 MP, 5248 ? 3936 pixels, autofocus, LED flash   ");
            System.out.println("DISPLAY : 1080 x 1920 pixels, 5.0 inches (~441 ppi pixel density) ");
            System.out.println("COLOR : White,Black,Purple ");
            System.out.println("PRICE :  Rs. 31,990.00 ");
            break;
             case 8:
             System.out.println("");
            System.out.println(" The specifications for Xperia M are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Optional dual-SIM (Micro SIM) ");
            System.out.println("MEMORY: 4 GB");
            System.out.println("OS: Android OS, v4.1 (Jelly Bean)/ v4.2.2 - C2004/C2005 models, upgradable to v4.3 (Jelly Bean)  ");
            System.out.println("M.P. : 5 MP, 2592 ? 1944 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 480 x 854 pixels, 4.0 inches (~245 ppi pixel density) ");
            System.out.println("COLOR : White,Black,Purple ");
            System.out.println("PRICE :  Rs. 11,350.00 ");
            break;
             case 9:
             System.out.println("");
            System.out.println(" The specifications for Xperia C are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM:  Dual SIM (Micro-SIM, dual stand-by)  ");
            System.out.println("MEMORY: 4 GB   ");
            System.out.println("OS: Android OS, v4.2.2 (Jelly Bean) ");
            System.out.println("M.P. : 8 MP, 3264 x 2448 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 540 x 960 pixels, 5.0 inches (~220 ppi pixel density) ");
            System.out.println("COLOR : White,Purple ");
            System.out.println("PRICE :  Rs. 14,420.00 ");
            break;
            case 10:
            System.out.println("");
            System.out.println(" The specifications for Xperia ZR are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 2 GB   ");
            System.out.println("SIM: Micro-SIM ");
            System.out.println("MEMORY: 8 GB   ");
            System.out.println("OS: Android OS, v4.1 (Jelly Bean), upgrad?ble to v4.4.2 (KitKat), planned upgrade to v5.0 (Lollipop) ");
            System.out.println("M.P. : 13.1 MP, 4128 x 3096 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY :  720 x 1280 pixels, 4.55 inches (~323 ppi pixel density) ");
            System.out.println("COLOR : White,Black ");
            System.out.println("PRICE :  Rs. 24,890.00 ");
            break;
        }
           System.out.println("");
           System.out.println("Do you want to choose another model: Press 1 ");
           
           System.out.println("");
           System.out.println("If want to buy: press 0 ");
           System.out.println("");
           wish=Integer.parseInt(in.readLine());
            if(wish==0)
           {
           System.out.println("Enter your name:");
           name=in.readLine();
           System.out.println("");
           System.out.println("Enter your address:");
           add=in.readLine();
           System.out.println("");
           System.out.println("It will be delivered within 2 working days ");
           System.out.println("");
           System.out.println("The transaction is successful ");
           System.out.println("");
System.out.println("THANK YOU FOR SHOPPING ");
System.out.println("");
System.out.println("PLEASE VISIT US AGAIN ");
System.out.println("");
        }
    }
        break;
        case 5:
         wish=1;
     while(wish==1)
      {
          System.out.println("");
            System.out.println(" Select the mobile to view specifications :");
            System.out.println("  ");
            System.out.println(" 1. LG G Pro 2 ");
            System.out.println(" 2. LG F70 4G  ");
            System.out.println(" 3. LG L70 ");
            System.out.println(" 4. LG G3 S ");
            System.out.println(" 5. LG Nexus 5 ");
            System.out.println(" 6. LG G3 ");
            System.out.println(" 7. LG L Bello ");
            System.out.println(" 8. LG G Pro LITE ");
            System.out.println(" 9. LG Optimus G Pro E985 ");
            System.out.println(" 10.LG Tribute  ");
            System.out.println("");
            System.out.println("Enter your choice");
            LG=Integer.parseInt(in.readLine());
      switch (LG)
          {
            case 1:
            System.out.println("");
            System.out.println(" The specifications for LG G Pro 2  are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 3 GB   ");
            System.out.println("SIM: Micro-SIM ");
            System.out.println("MEMORY: 16/32 GB   ");
            System.out.println("OS: Android OS, v4.4.2 (KitKat)  ");
            System.out.println("M.P. : 13 MP, 4208 x 3120 pixels, autofocus, optical image stabilization, LED flash ");
            System.out.println("DISPLAY : 1080 x 1920 pixels, 5.9 inches (~373 ppi pixel density) ");
            System.out.println("COLOR : White,Black ");
            System.out.println("PRICE :  Rs. 37,345.00 ");
            break;
            case 2:
            System.out.println("");
            System.out.println(" The specifications for LG F70 4G are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Micro-SIM ");
            System.out.println("MEMORY: 4/8 GB   ");
            System.out.println("OS: Android OS, v4.4.2 (KitKat)  ");
            System.out.println("M.P. : 5 MP, 2592 ? 1944 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 480 x 800 pixels, 4.5 inches (~207 ppi pixel density) ");
            System.out.println("COLOR : White,Black ");
            System.out.println("PRICE :  Rs. 12,500.00 ");
            break;
            case 3:
            System.out.println("");
            System.out.println(" The specifications for LG L70 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Mini-SIM ");
            System.out.println("MEMORY: 4 GB   ");
            System.out.println("OS: Android OS, v4.4.2 (KitKat)  ");
            System.out.println("M.P. :  5 MP, 2592 ? 1944 pixels, autofocus, LED flash/ 8 MP (D320F8 model) ");
            System.out.println("DISPLAY : 480 x 800 pixels, 4.5 inches (~207 ppi pixel density) ");
            System.out.println("COLOR : White,Black");
            System.out.println("PRICE :  Rs. 8,220.00 ");
            break;
            case 4:
            System.out.println("");
            System.out.println(" The specifications for LG G3 S are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Micro-SIM ");
            System.out.println("MEMORY: 8 GB   ");
            System.out.println("OS: Android OS, v4.4.2 (KitKat)  ");
            System.out.println("M.P. : 8 MP, 3264 x 2448 pixels, laser autofocus, LED flash ");
            System.out.println("DISPLAY : 720 x 1280 pixels, 5.0 inches (~294 ppi pixel density)");
            System.out.println("COLOR : Silk,White");
            System.out.println("PRICE :  Rs. 18,500.00 ");
            break;
            case 5:
            System.out.println("");
            System.out.println(" The specifications for LG Nexus 5 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 2 GB   ");
            System.out.println("SIM: Micro-SIM ");
            System.out.println("MEMORY: 16/32 GB   ");
            System.out.println("OS: Android OS, v4.4 (KitKat), upgradable to v4.4.4 (KitKat), planned upgrade to v5.0 (Lollipop)  ");
            System.out.println("M.P. : 8 MP, 3264 x 2448 pixels, autofocus, optical image stabilization, LED flash");
            System.out.println("DISPLAY : 1080 x 1920 pixels, 4.95 inches (~445 ppi pixel density)");
            System.out.println("COLOR : Black");
            System.out.println("PRICE :  Rs. 27,995.00 ");
            break;
            case 6:
            System.out.println("");
            System.out.println(" The specifications for LG G3 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 2 GB, 3 GB   ");
            System.out.println("SIM: Micro-SIM ");
            System.out.println("MEMORY: 16/32 GB   ");
            System.out.println("OS: Android OS, v4.4.2 (KitKat)  ");
            System.out.println("M.P. : 13 MP, 4160 x 3120 pixels, phase detection/laser autofocus, optical image stabilization, dual-LED (dual tone) flash ");
            System.out.println("DISPLAY :  1440 x 2560 pixels, 5.5 inches (~534 ppi pixel density)");
            System.out.println("COLOR : Grey,Black,Brown ");
            System.out.println("PRICE :  Rs. 40,690.00 ");
            break;
            case 7:
            System.out.println("");
            System.out.println(" The specifications for LG L Bello are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Optional Dual SIM (Micro-SIM, dual stand-by) ");
            System.out.println("MEMORY: 8 GB   ");
            System.out.println("OS: Android OS, v4.4.2 (KitKat)  ");
            System.out.println("M.P. :  8 MP, 3264 x 2448 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 480 x 854 pixels, 5.0 inches (~196 ppi pixel density) ");
            System.out.println("COLOR : White,Black,Gold ");
            System.out.println("PRICE :  Rs. 14,413.00 ");
            break;
            case 8:
            System.out.println("");
            System.out.println(" The specifications for LG G Pro LITE are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Mini-SIM ");
            System.out.println("MEMORY: 8 GB   ");
            System.out.println("OS: Android OS, v4.1.2 (Jelly Bean), upgrad?ble to v4.4.2 (KitKat) ");
            System.out.println("M.P. :  8 MP, 3264 x 2448 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY :  540 x 960 pixels, 5.5 inches (~200 ppi pixel density) ");
            System.out.println("COLOR : White,Black ");
            System.out.println("PRICE :  Rs. 13,928.00 ");
            break;
            case 9:
            System.out.println("");
            System.out.println(" The specifications for LG Optimus G Pro E985 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 2 GB   ");
            System.out.println("SIM: Micro-SIM ");
            System.out.println("MEMORY: 16/32 GB   ");
            System.out.println("OS: Android OS, v4.1.2 (Jelly Bean), planned upgrade to v4.4.2 (KitKat) ");
            System.out.println("M.P. : 13 MP, 4208 x 3120 pixels, autofocus, LED flash");
            System.out.println("DISPLAY : 1080 x 1920 pixels, 5.5 inches (~401 ppi pixel density)");
            System.out.println("COLOR : White,Black ");
            System.out.println("PRICE :  Rs. 37,440.00 ");
            break;
            case 10:
            System.out.println("");
            System.out.println(" The specifications for LG Tribute  are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Micro-SIM ");
            System.out.println("MEMORY: 4 GB   ");
            System.out.println("OS: Android OS, v4.4.2 (KitKat)  ");
            System.out.println("M.P. : 5 MP, 2560 ? 1920 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 480 x 800 pixels, 4.5 inches (~207 ppi pixel density) ");
            System.out.println("COLOR : White,Black");
            System.out.println("PRICE :  Rs. 25,586.00 ");
            break;
            }
           System.out.println("");
           System.out.println("Do you want to choose another model for the same company : Press 1 ");
           
           System.out.println("");
           System.out.println("If want to buy: press 0 ");
           System.out.println("");
           System.out.println("Enter your choice");
           wish=Integer.parseInt(in.readLine());
            if(wish==0)
           {
           System.out.println("Enter your name:");
           name=in.readLine();
           System.out.println("");
           System.out.println("Enter your address:");
           add=in.readLine();
           System.out.println("");
           System.out.println("It will be delivered within 2 working days ");
           System.out.println("");
          System.out.println("The transaction is successful ");
          System.out.println("");
System.out.println("THANK YOU FOR SHOPPING ");
System.out.println("");
System.out.println("PLEASE VISIT US AGAIN ");
      }
    }

      break;
      
    }
    break;
         case 2:
         System.out.println("");
            System.out.println(" Select the mobile company with widows O.s");
            System.out.println(" 1. Nokia");
            System.out.println(" 2. HTC");
            System.out.println(" 3. Samsung");
            System.out.println("");
            System.out.println("Enter your choice");
            company1=Integer.parseInt(in.readLine());
            switch (company1)
            {
            case 1:
            wish=1;
    while(wish==1)
        {
            System.out.println(" Select the mobile to view specifications :");
            System.out.println("  ");
            System.out.println(" 1. Nokia Lumia 530 Dual Sim ");
            System.out.println(" 2. Nokia Lumia 630 Dual Sim ");
            System.out.println(" 3. Nokia Lumia 1520 ");
            System.out.println(" 4. Nokia Lumia 920 ");
            System.out.println(" 5. Nokia Lumia 530 ");
            System.out.println(" 6. Nokia Lumia 1320 ");
            System.out.println(" 7. Nokia Lumia 1020 ");
            System.out.println(" 8. Nokia Lumia 925 ");
            System.out.println(" 9. Nokia Lumia 625 ");
            System.out.println(" 10. Nokia Lumia 520  ");
            System.out.println("");
            System.out.println("Enter your choice");
            lumia=Integer.parseInt(in.readLine());
            switch (lumia)
        {
            case 1:
            System.out.println("");
            System.out.println(" The specifications for Nokia Lumia 530 Dual Sim are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 512 MB   ");
            System.out.println("SIM:  Dual SIM (Micro-SIM, dual stand-by) ");
            System.out.println("MEMORY: 4 GB   ");
            System.out.println("OS: Microsoft Windows Phone 8.1 ");
            System.out.println("M.P. : 5 MP, 2592 x 1936 pixels ");
            System.out.println("DISPLAY : 480 x 854 pixels, 4.0 inches (~245 ppi pixel density) ");
            System.out.println("COLOR : White,Black ");
            System.out.println("PRICE :  Rs. 5,329.00 ");
            break;
            case 2:
            System.out.println("");
            System.out.println(" The specifications for Nokia Lumia 630 Dual Sim are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Micro-SIM ");
            System.out.println("MEMORY: 4/8 GB   ");
            System.out.println("OS:Microsoft Windows Phone 8.1   ");
            System.out.println("M.P. : 5 MP, 2592 ? 1944 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 480 x 800 pixels, 4.5 inches (~207 ppi pixel density) ");
            System.out.println("COLOR : White,Black ");
            System.out.println("PRICE :  Rs. 12,500.00 ");
            break;
            case 3:
            System.out.println("");
            System.out.println(" The specifications for Nokia Lumia 1520 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Mini-SIM ");
            System.out.println("MEMORY: 4 GB   ");
            System.out.println("OS: Microsoft Windows Phone 8.1  ");
            System.out.println("M.P. :  5 MP, 2592 ? 1944 pixels, autofocus, LED flash/ 8 MP (D320F8 model) ");
            System.out.println("DISPLAY : 480 x 800 pixels, 4.5 inches (~207 ppi pixel density) ");
            System.out.println("COLOR : White,Black");
            System.out.println("PRICE :  Rs. 8,220.00 ");
            break;
            case 4:
            System.out.println("");
            System.out.println(" The specifications for Nokia Lumia 920 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Micro-SIM ");
            System.out.println("MEMORY: 8 GB   ");
            System.out.println("OS: Microsoft Windows Phone 8.1  ");
            System.out.println("M.P. : 8 MP, 3264 x 2448 pixels, laser autofocus, LED flash ");
            System.out.println("DISPLAY : 720 x 1280 pixels, 5.0 inches (~294 ppi pixel density)");
            System.out.println("COLOR : Silk,White");
            System.out.println("PRICE :  Rs. 18,500.00 ");
            break;
            case 5:
            System.out.println("");
            System.out.println(" The specifications for Nokia Lumia 530  are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 2 GB   ");
            System.out.println("SIM: Micro-SIM ");
            System.out.println("MEMORY: 16/32 GB   ");
            System.out.println("OS: Microsoft Windows Phone 8.1  ");
            System.out.println("M.P. : 8 MP, 3264 x 2448 pixels, autofocus, optical image stabilization, LED flash");
            System.out.println("DISPLAY : 1080 x 1920 pixels, 4.95 inches (~445 ppi pixel density)");
            System.out.println("COLOR : Black");
            System.out.println("PRICE :  Rs. 27,995.00 ");
            break;
            case 6:
            System.out.println("");
            System.out.println(" The specifications for Nokia Lumia 1320 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 2 GB, 3 GB   ");
            System.out.println("SIM: Micro-SIM ");
            System.out.println("MEMORY: 16/32 GB   ");
            System.out.println("OS: Microsoft Windows Phone 8.1  ");
            System.out.println("M.P. : 13 MP, 4160 x 3120 pixels, phase detection/laser autofocus, optical image stabilization, dual-LED (dual tone) flash ");
            System.out.println("DISPLAY :  1440 x 2560 pixels, 5.5 inches (~534 ppi pixel density)");
            System.out.println("COLOR : Grey,Black,Brown ");
            System.out.println("PRICE :  Rs. 40,690.00 ");
            break;
            case 7:
            System.out.println("");
            System.out.println(" The specifications for Nokia Lumia 1020 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Optional Dual SIM (Micro-SIM, dual stand-by) ");
            System.out.println("MEMORY: 8 GB   ");
            System.out.println("OS: Microsoft Windows Phone 8.1  ");
            System.out.println("M.P. :  8 MP, 3264 x 2448 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 480 x 854 pixels, 5.0 inches (~196 ppi pixel density) ");
            System.out.println("COLOR : White,Black,Gold ");
            System.out.println("PRICE :  Rs. 14,413.00 ");
            break;
            case 8:
            System.out.println("");
            System.out.println(" The specifications for Nokia Lumia 925 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Mini-SIM ");
            System.out.println("MEMORY: 8 GB   ");
            System.out.println("OS: Microsoft Windows Phone 8.1 ");
            System.out.println("M.P. :  8 MP, 3264 x 2448 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY :  540 x 960 pixels, 5.5 inches (~200 ppi pixel density) ");
            System.out.println("COLOR : White,Black ");
            System.out.println("PRICE :  Rs. 13,928.00 ");
            break;
            case 9:
            System.out.println("");
            System.out.println(" The specifications for Nokia Lumia 625 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 2 GB   ");
            System.out.println("SIM: Micro-SIM ");
            System.out.println("MEMORY: 16/32 GB   ");
            System.out.println("OS: Microsoft Windows Phone 8.1 ");
            System.out.println("M.P. : 13 MP, 4208 x 3120 pixels, autofocus, LED flash");
            System.out.println("DISPLAY : 1080 x 1920 pixels, 5.5 inches (~401 ppi pixel density)");
            System.out.println("COLOR : White,Black ");
            System.out.println("PRICE :  Rs. 37,440.00 ");
            break;
            case 10:
            System.out.println("");
            System.out.println(" The specifications for Nokia Lumia 520 are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Micro-SIM ");
            System.out.println("MEMORY: 4 GB   ");
            System.out.println("OS: Microsoft Windows Phone 8.1  ");
            System.out.println("M.P. : 5 MP, 2560 ? 1920 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 480 x 800 pixels, 4.5 inches (~207 ppi pixel density) ");
            System.out.println("COLOR : White,Black");
            System.out.println("PRICE :  Rs. 25,586.00 ");
            break;
        }
           System.out.println("");
           System.out.println("Do you want to choose another model: Press 1 ");
           System.out.println("");
           System.out.println("If want to buy: press 0 ");
           System.out.println("");
           System.out.println("Enter your choice");
           wish=Integer.parseInt(in.readLine());
            if(wish==0)
           {
           System.out.println("Enter your name:");
           name=in.readLine();
           System.out.println("");
           System.out.println("Enter your address:");
           add=in.readLine();
           System.out.println("");
           System.out.println("It will be delivered within 2 working days ");
           System.out.println("");
           System.out.println("The transaction is successful ");
           System.out.println("");
System.out.println("THANK YOU FOR SHOPPING ");
System.out.println("");
System.out.println("PLEASE VISIT US AGAIN ");
        }
    }
        break;
          case 2:
          wish=1;
            while(wish==1)
           {
            System.out.println(" Select the mobile to view specifications :");
            System.out.println("  ");
            System.out.println(" 1. Windows 8X  by HTC ");
            System.out.println(" 2. Windows 8S by HTC ");
            System.out.println("");
            System.out.println("Enter your choice");
            htc=Integer.parseInt(in.readLine());
        switch (htc)
            {
            case 1:
            System.out.println("");
            System.out.println(" The specifications for Windows 8X  by HTC are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Micro SIM ");
            System.out.println("MEMORY: 16 GB   ");
            System.out.println("OS: Microsoft Windows Phone 8, upgradeable to WP8 GDR3 ");
            System.out.println("M.P. : 8 MP, 3264 x 2448 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 720 x 1280 pixels, 4.3 inches (~342 ppi pixel density) ");
            System.out.println("COLOR : White,Black,Graphite ");
            System.out.println("PRICE :  Rs. 24,700.00 ");
            break;
            case 2:
            System.out.println("");
            System.out.println(" The specifications for Windows 8S by HTC are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 512 MB   ");
            System.out.println("SIM: Micro SIM ");
            System.out.println("MEMORY: 4 GB   ");
            System.out.println("OS: Microsoft Windows Phone 8, upgradeable to WP8 GDR3 ");
            System.out.println("M.P. : 5 MP, 2592 ? 1944 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 480 x 800 pixels, 4.0 inches (~233 ppi pixel density) ");
            System.out.println("COLOR : White,Yellow,Blue ");
            System.out.println("PRICE :  Rs. 15,699.00 ");
            break;
            }
    
           System.out.println("");
           System.out.println("Do you want to choose another model: Press 1 ");
           System.out.println("");
           System.out.println("If want to buy: press 0 ");
           wish=Integer.parseInt(in.readLine());
            if(wish==0)
           {
           System.out.println("Enter your name:");
           name=in.readLine();
           System.out.println("");
           System.out.println("Enter your address:");
           add=in.readLine();
           System.out.println("");
           System.out.println("It will be delivered within 2 working days ");
           System.out.println("");
           System.out.println("The transaction is successful ");
           System.out.println("");
System.out.println("THANK YOU FOR SHOPPING ");
System.out.println("");
System.out.println("PLEASE VISIT US AGAIN ");
        }
    }
        break;
         case 3:
          wish=1;
            while(wish==1)
           {
            System.out.println(" Select the mobile to view specifications :");
            System.out.println("  ");
            System.out.println(" 1.Samsung ATIV S ");
            System.out.println(" 2.Samsung ATIV SE ");
            System.out.println(" 3.Samsung ATIV S Neo ");
            System.out.println(" 4.Samsung ATIV S Odyssey ");
            System.out.println(" 5.Samsung ATIV TAB ");
            System.out.println("");
            System.out.println("Enter your choice");
            sam=Integer.parseInt(in.readLine());
        switch (sam)
            {
            case 1:
            System.out.println("");
            System.out.println(" The specifications for Samsung ATIV S are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Micro SIM ");
            System.out.println("MEMORY: 16/32 GB   ");
            System.out.println("OS: Microsoft Windows Phone 8 ");
            System.out.println("M.P.: 8 MP, 3264 x 2448 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY: 720 x 1280 pixels, 4.8 inches (~306 ppi pixel density) ");
            System.out.println("COLOR: Black, White ");
            System.out.println("PRICE:Rs. 40,999.00  ");
            break;
            case 2:
            System.out.println("");
            System.out.println(" The specifications for Samsung ATIV SE are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 2 GB   ");
            System.out.println("SIM: Micro SIM ");
            System.out.println("MEMORY: 16 GB   ");
            System.out.println("OS: Microsoft Windows Phone 8, planned upgrade to v8.1 ");
            System.out.println("M.Pl. : 13 MP, 4128 x 3096 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 1080 x 1920 pixels, 5.0 inches (~441 ppi pixel density) ");
            System.out.println("COLOR : Black, White ");
            System.out.println("PRICE :Rs 16,599  ");
            break;
            case 3:
            System.out.println("");
            System.out.println(" The specifications for Samsung ATIV S Neo are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1 GB   ");
            System.out.println("SIM: Micro SIM ");
            System.out.println("MEMORY: 16 GB   ");
            System.out.println("OS: Microsoft Windows Phone 8");
            System.out.println("M.P. : 8 MP, 3264 x 2448 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 720 x 1280 pixels, 4.77 inches (~308 ppi pixel density) ");
            System.out.println("COLOR : Black, White ");
            System.out.println("PRICE : Rs 21,912  ");
            break;
            case 4:
            System.out.println("");
            System.out.println(" The specifications for Samsung ATIV S Odyssey are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 1GB  ");
            System.out.println("SIM: Micro SIM ");
            System.out.println("MEMORY: 8 GB   ");
            System.out.println("OS: Microsoft Windows Phone 8 ");
            System.out.println("M.P. : 5 MP, 2592 ? 1944 pixels, autofocus, LED flash ");
            System.out.println("DISPLAY : 480 x 800 pixels, 4.0 inches (~233 ppi pixel density) ");
            System.out.println("COLOR :  Black, White ");
            System.out.println("PRICE : Rs.15000   ");
            break;
            case 5:
            System.out.println("");
            System.out.println(" The specifications for Samsung ATIV TAB are as follows  :  ");
            System.out.println(" ");
            System.out.println("RAM: 2 GB ");
            System.out.println("SIM: No Sim ");
            System.out.println("MEMORY: 32/64 GB   ");
            System.out.println("OS: Microsoft Windows RT ");
            System.out.println("M.P. : 5 MP, 2592 ? 1944 pixels, autofocus, LED flash");
            System.out.println("DISPLAY : 1366 x 768 pixels, 10.1 inches (~155 ppi pixel density) ");
            System.out.println("COLOR : Black, White ");
            System.out.println("PRICE :Rs 38000   ");
            break;
            }
           System.out.println("");
           System.out.println("Do you want to choose another model: Press 1 ");
           System.out.println("");
           System.out.println("If want to buy: press 0 ");
           wish=Integer.parseInt(in.readLine());
            if(wish==0)
           {
           System.out.println("Enter your name:");
           name=in.readLine();
           System.out.println("");
           System.out.println("Enter your address:");
           add=in.readLine();
           System.out.println("");
           System.out.println("It will be delivered within 2 working days ");
           System.out.println("");
           System.out.println("The transaction is successful ");
           System.out.println("");
System.out.println("THANK YOU FOR SHOPPING ");
System.out.println("");
System.out.println("PLEASE VISIT US AGAIN ");
        }
    }
        break;
    }
    break;
    case 3:
    System.out.println(" Select the mobile company with keypad");
            System.out.println(" 1. Samsung");
            System.out.println(" 2. Nokia");
            System.out.println("");
            System.out.println("Enter your choice");
            company2=Integer.parseInt(in.readLine());
             switch (company2)
            {
            case 1:
            wish=1;
      while(wish==1)
        {
            System.out.println(" Select the mobile to view specifications :");
            System.out.println("  ");
            System.out.println(" 1. Samsung Metro DUOS C3322 ");
            System.out.println(" 2. Samsung Metro GT-E2252 ");
            System.out.println(" 3. Samsung Primo S5610 ");
            System.out.println(" 4. Samsung Guru E1207T ");
            System.out.println(" 5. Samsung Guru E1200 ");
            System.out.println("");
            System.out.println("Enter your choice");
            samk=Integer.parseInt(in.readLine());
        switch (samk)
        {
            case 1:
            System.out.println("");
            System.out.println(" The specifications for Samsung Metro DUOS C3322 are as follows  :  ");
            System.out.println(" ");
            System.out.println("Screen : 2.2 inches Screen");
            System.out.println("Expandable : Micro SD, Upto 16 GB ");
            System.out.println("Camera : 2.0 Megapixels ");
            System.out.println("Talk time : Up to 12 hrs ");
            System.out.println("Dual SIM : Yes ");
            System.out.println("Resolution : 320 x 240 Pixels ");
            System.out.println("Inbuilt Storage : 45 MB ");
            System.out.println("GPRS : Yes ");
            System.out.println("PRICE: Rs. 3,260 ");
            break;
            case 2:
            System.out.println("");
            System.out.println(" The specifications for Samsung Metro GT-E2252 are as follows  :  ");
            System.out.println(" ");
            System.out.println("Screen : 2 inches Screen   ");
            System.out.println("Expandable : Micro SD , Upto 32 GB ");
            System.out.println("Camera : VGA  ");
            System.out.println("Talk time : Up to 11 hrs  ");
            System.out.println("Dual SIM : Yes ");
            System.out.println("Resolution : 320 x 240 Pixels ");
            System.out.println("Inbuilt Storage : 20 MB ");
            System.out.println("GPRS : Yes ");
            System.out.println("PRICE: Rs. 3,499 ");
            break;
            case 3:
            System.out.println("");
            System.out.println(" The specifications for Samsung Primo S5610 are as follows  :  ");
            System.out.println(" ");
            System.out.println("Screen : 2.4 inches Screen  ");
            System.out.println("Expandable : Micro SD, Upto 32 GB ");
            System.out.println("Camera : 5.0 Megapixels   ");
            System.out.println("Talk time : Up to 15 hrs 16 min  ");
            System.out.println("Secondary Camera : VGA ");
            System.out.println("Resolution : QVGA, 320 x 240 Pixels ");
            System.out.println("Inbuilt Storage : 108 MB");
            System.out.println("3G : 7.2 Mbps HSDPA ");
            System.out.println("Price: Rs, 4850 ");
            break;
            case 4:
            System.out.println("");
            System.out.println(" The specifications for Samsung Guru E1207T are as follows  :  ");
            System.out.println(" ");
            System.out.println("Screen : 1.52 inches Screen   ");
            System.out.println("Talk time : Up to 8 hrs (2G) ");
            System.out.println("Dual SIM : Yes   ");
            System.out.println("Resolution : 128 x 128 Pixels  ");
            System.out.println("Inbuilt Storage : 8 MB ");
            System.out.println("Standby Time : Up to 430 hrs (2G)");
            System.out.println("Radio FM : Yes");
            System.out.println("PRICE Rs. 1,340 ");
            break;
            case 5:
            System.out.println("");
            System.out.println(" The specifications for Samsung Guru E1200  are as follows  :  ");
            System.out.println(" ");
            System.out.println("Screen : 1.52 inches Screen   ");
            System.out.println("Talk time : Upto 8.6 hrs ");
            System.out.println("Resolution : 128 X 128 Pixels   ");
            System.out.println("Standby Time : Upto 720 hrs  ");
            System.out.println("Radio FM : Yes");
            System.out.println("PRICE  Rs. 1,120");
            break;
            case 6:
            System.out.println("");
            System.out.println(" The specifications for Samsung Metro DUOS C3322 are as follows  :  ");
            System.out.println(" ");
            System.out.println("Screen : 2.2 inches Screen   ");
            System.out.println("Expandable : Micro SD, Upto 16 GB ");
            System.out.println("Camera : 2.0 Megapixels   ");
            System.out.println("Talk time : Up to 12 hrs  ");
            System.out.println("Dual SIM : Yes ");
            System.out.println("Resolution : 320 x 240 Pixels");
            System.out.println("GPRS : Yes ");
            System.out.println("PRICE Rs. 3,260 ");
            break;
  }
  System.out.println("");
           System.out.println("Do you want to choose another model: Press 1 ");
           System.out.println("");
           System.out.println("If want to buy: press 0 ");
           wish=Integer.parseInt(in.readLine());
            if(wish==0)
           {
           System.out.println("Enter your name:");
           name=in.readLine();
           System.out.println("");
           System.out.println("Enter your address:");
           add=in.readLine();
           System.out.println("");
           System.out.println("It will be delivered within 2 working days ");
           System.out.println("");
           System.out.println("The transaction is successful ");
           System.out.println("");
System.out.println("THANK YOU FOR SHOPPING ");
System.out.println("");
System.out.println("PLEASE VISIT US AGAIN ");
System.out.println("");
}
break;
}
break;
case 2:
            wish=1;
   while(wish==1)
      {
            System.out.println(" Select the mobile to view specifications :");
            System.out.println("  ");
            System.out.println(" 1. Nokia 220 Dual ");
            System.out.println(" 2. Nokia 225 Dual ");
            System.out.println(" 3. Nokia 105 ");
            System.out.println(" 4. Nokia Asha 206 (Dual Sim) ");
            System.out.println(" 5. Nokia Asha 301 ");
            System.out.println("");
            System.out.println("Enter your choice");
            nokiak=Integer.parseInt(in.readLine());
          switch (nokiak)
          {
            case 1:
            System.out.println("");
            System.out.println(" The specifications for Nokia 220 Dual are as follows  :  ");
            System.out.println(" ");
            System.out.println("Screen : 2.4 inches Screen");
            System.out.println("Expandable : Micro SD, Upto 32 GB ");
            System.out.println("Camera : 2.0 Megapixels ");
            System.out.println("Talk time : Up to 15 hrs (2G) ");
            System.out.println("Dual SIM : Yes ");
            System.out.println("Resolution : 320 x 240 Pixels ");
            System.out.println("Inbuilt Storage : 45 MB ");
            System.out.println("GPRS : Yes ");
            System.out.println("PRICE Rs. 2,480 ");
            break;
            case 2:
            System.out.println("");
            System.out.println(" The specifications for Nokia 225 Dual are as follows  :  ");
            System.out.println(" ");
            System.out.println("Screen : 2.8 inches Screen   ");
            System.out.println("Expandable : MicroSD, Upto 32 GB ");
            System.out.println("Camera : 2.0 Megapixels  ");
            System.out.println("Talk time : Up to 21 hrs (2G)  ");
            System.out.println("Dual SIM : Yes ");
            System.out.println("Resolution : 320 x 240 Pixels ");
            System.out.println("Inbuilt Storage : 20 MB ");
            System.out.println("GPRS : Yes ");
            System.out.println("PRICE Rs. 2,999 ");
            break;
            case 3:
            System.out.println("");
            System.out.println(" The specifications for Nokia 105 are as follows  :  ");
            System.out.println(" ");
            System.out.println("Screen : 1.4 inches Screen  ");
            System.out.println("Memory : 8 MB RAM ");
            System.out.println("Talk time : Up to 12.5 hrs (2G)   ");
            System.out.println("Resolution : 128 x 128 Pixels  ");
            System.out.println("Inbuilt Storage : 384 KB ");
            System.out.println("Standby Time : Up to 842 hrs (2G) ");
            System.out.println("Radio FM : Yes");
            System.out.println("PRICE Rs. 1,020 ");
            break;
            case 4:
            System.out.println("");
            System.out.println(" The specifications for Nokia Asha 206 (Dual Sim) are as follows  :  ");
            System.out.println(" ");
            System.out.println("OS : Symbian Series 40   ");
            System.out.println("Screen : 2.4 inches Screen ");
            System.out.println("Expandable : Micro SD, Upto 32 GB   ");
            System.out.println("Camera : 1.3 Megapixels  ");
            System.out.println("Talk time : Up to 20 hrs ");
            System.out.println("Dual SIM : Yes");
            System.out.println("Resolution : 320 x 240 Pixels");
            System.out.println("PRICE Rs. 3,549 ");
            break;
            case 5:
            System.out.println("");
            System.out.println(" The specifications for Nokia Asha 301  are as follows  :  ");
            System.out.println(" ");
            System.out.println("OS : Symbian Series 40   ");
            System.out.println("Screen : 2.4 inches Screen ");
            System.out.println("Memory : 64 MB RAM, 256 MB ROM   ");
            System.out.println("Expandable : Micro SD, Upto 32 GB  ");
            System.out.println("Camera : 3.15 Megapixels");
            System.out.println("PRICE Rs. 5,498");
            break;
  }
  System.out.println("");
           System.out.println("Do you want to choose another model: Press 1 ");
           System.out.println("");
           System.out.println("If want to buy: press 0 ");
           wish=Integer.parseInt(in.readLine());
            if(wish==0)
           {
           System.out.println("Enter your name:");
           name=in.readLine();
           System.out.println("");
           System.out.println("Enter your address:");
           add=in.readLine();
           System.out.println("");
           System.out.println("It will be delivered within 2 working days ");
           System.out.println("");
           System.out.println("The transaction is successful ");
           System.out.println("");
System.out.println("THANK YOU FOR SHOPPING ");
System.out.println("");
System.out.println("PLEASE VISIT US AGAIN ");
}
}
break;
}
break;
}
break;

    case 2:
System.out.println(" ");
System.out.println("You can sell your phone here");
System.out.println(" ");
System.out.println("Enter your name : ");
name1=in.readLine();
System.out.println("Enter the mobile company : ");
comp1=in.readLine();
System.out.println("Enter the model no. : ");
model=in.readLine();
System.out.println("Enter the original price of the mobile : Rs. ");
price=Integer.parseInt(in.readLine());
d=(20*price)/100;
sp=price-d;
System.out.println("Dear "+name1+" ,your model "+model+" of "+comp1+" can be sold at Rs.:"+sp);
System.out.println("Press y to confirm ");
System.out.println("Press n to reject the offer");
con=(char)(in.read());
if(con=='y')
{
System.out.println("The transaction is successful ");
System.out.println("");
System.out.println("THANK YOU FOR SHOPPING ");
System.out.println("");
System.out.println("PLEASE VISIT US AGAIN ");
}
else
System.out.println("THANK YOU FOR VISITING THE SHOP");
}
}
}





        
        
            