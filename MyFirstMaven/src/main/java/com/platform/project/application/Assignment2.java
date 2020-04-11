package com.platform.project.application;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Assignment2 {

    public void q4(int num){
        System.out.println("\nQ4");
        for(int i = 1; i <= 10;i++) {
            System.out.println(num + " x " + i + " = " + String.valueOf(num * i));
        }
    }

    public void threeandfive(){
        System.out.println("\nThreeandfive");
        for(int i = 0; i <= 100; i++){
            if(i%3==0 || i%5==0 ){
                System.out.println(i);
            }
        }
    }

    public void largeArr(int a[]){
        System.out.println("\nLarge Array");
        Arrays.sort(a);
        System.out.print(a[a.length-1] + " ");
        System.out.print(a[a.length-2] + " ");
        System.out.print(a[a.length-3] + " ");
    }

    public void convert(double degree){
        System.out.println("convert");
        double cels = ((degree - 32) * 5/9);
        System.out.println("Fahrenheit " + degree +" is equal to " + " Celsius " + cels);

    }

    public void daysinmonth(){
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int day = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Input a a year: ");
        int year =input2.nextInt();

        switch(day){
            case 1:
                System.out.println("January " + year + " has 31 days");
                break;
            case 2:
                System.out.println("February " + year + " has 29 days");
                break;
            case 3:
                System.out.println("March " + year + " has 30 days");
                break;
            case 4:
                System.out.println("April " + year + " has 31 days");
                break;
            case 5:
                System.out.println("May " + year + " has 29 days");
                break;
            case 6:
                System.out.println("June " + year + " has 30 days");
                break;
            case 7:
                System.out.println("July " + year + " has 30 days");
                break;
            case 8:
                System.out.println("August " + year + " has 31 days");
                break;
            case 9:
                System.out.println("September " + year + " has 30 days");
                break;
            case 10:
                System.out.println("October " + year + " has 31 days");
                break;
            case 11:
                System.out.println("November " + year + " has 30 days");
                break;
            case 12:
                System.out.println("December " + year + " has 31 days");
                break;
            default:
                System.out.println("Choose a month and a year ");
                break;

        }
    }

    public void charsort(char a[]){
        System.out.println();
        Arrays.sort(a);
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    public void intsort(int a[]){
        System.out.println();
        Arrays.sort(a);
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    public void stringsort(String a[]){
        System.out.println();
        Arrays.sort(a);
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

    public void minandmax(int a[]){
        // uses Tim sort - O(N log N)
        System.out.println();
        Arrays.sort(a);
        System.out.println("Max : " + a[a.length-1]);
        System.out.println("Min : " + a[0]);
    }

    public void isEqual(String a){
        if(a.equals("example.com")){
            System.out.println("Comparing " + a + " and example.com: true");

        }else{
            System.out.println("Comparing " + a + " and example.com: false");
        }
    }

    public void dateandtime(){
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }

    public void countvow(String sentence){
        int count = 0;
//        System.out.println("Enter a sentence :");
//        Scanner sc = new Scanner(System.in);
//        String sentence = sc.nextLine();
        for (int i=0 ; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                count ++;
            }
        }
        System.out.println("Number of vowels in the given sentence is "+count);
    }

    public void countword(String sentence){
        int count = 0;
//        System.out.println("Enter a sentence :");
//        Scanner sc = new Scanner(System.in);
//        String sentence = sc.nextLine();
        for (int i=0 ; i<sentence.length(); ++i){
            char ch = sentence.charAt(i);
            if(ch == ' ' || ch == '\n' || ch == '\t' || ch == '.'){
                count ++;
            }
        }
        System.out.println("Number of words in the given sentence is "+count);
    }

    public void pathname(){
        try {
            System.out.println("Enter a Directory path: ");
            Scanner name = new Scanner(System.in);
            String path = name.next();

            String[] pathname;
            File f = new File(path);
            pathname = f.list();
            for (String namefile : pathname) {
                System.out.println(namefile);
            }
        }catch(Exception e){
            System.out.println("Enter a valid directory ");
        }
    }

    public void writeandread(){
        try {
            System.out.println("what do you wish to write to the file: ");
            Scanner scan = new Scanner(System.in);
            String writing = scan.nextLine();
            FileWriter writer = new FileWriter("MyFile.txt");
            writer.write(writing);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader reader = new FileReader("MyFile.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Assignment2 ass = new Assignment2();
        ass.q4(5);
        ass.threeandfive();
        ass.largeArr(new int[]{1, 5, 4, 7, 6, 9, 8, 10, 15, 14, 13, 12});
        ass.convert(212.0);
        //ass.daysinmonth();
        ass.charsort(new char[]{'a','b','d','f','z','h','m','y'});
        ass.stringsort(new String[]{"hello","my","davis","what","is","your","name"});
        ass.intsort(new int[]{5,3,2,6,1,7,43,9,5,9,0,7,4,2,6});
        ass.minandmax(new int[]{5,3,2,6,1,7,43,9,5,9,0,7,4,2,6});
        ass.isEqual("Example.com");
        ass.dateandtime();
        ass.countvow("hello my name is davis");
        ass.countword("hello my name is davis.");
       // ass.pathname();
        ass.writeandread();
    }
}



