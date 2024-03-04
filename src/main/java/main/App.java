package main;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        String nimi;
        Scanner sc=new Scanner(System.in);
        System.out.println( "Tervetuloa Gifu-järjestelmään" );
        System.out.println( "Mille yliopistolle haluat ottaa järjestelmän käyttöön?" );
        nimi = sc.nextLine();
        Gifu gifu = new Gifu();
        gifu.addUniName(nimi);


        boolean exit = false;
        while(!exit){
            
        
        System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");
        if(sc.hasNext()){
            int i = 0;
            String stringInput = sc.nextLine();
            i=Integer.parseInt(stringInput);

            switch(i){
                case 1:
                String turha;
                System.out.println("Anna kurssin nimi:");
                String n=sc.nextLine();
                System.out.println("Anna kurssin ID:");
                String ix=sc.nextLine();
                System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                turha=sc.nextLine();
                gifu.addCourse(n,ix);
                
                break;
            case 2:
                
                break;
            case 3:
                gifu.listCourses();
                break;
            case 4:
                break;
            case 0:
                exit=true;
                break;

        }}}
    }


}
