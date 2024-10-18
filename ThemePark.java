//This is the class that contains the actual workings of the program
//***********************************************************************************************************************
import java.util.*;
class ThemePark extends Thread{
    @Override
    public void run(){
        try{
// this generates the number of people attending the park in this individual instance of the program
            // sets it as a number between 1 and 1000
            Integer parkGoers = new Random().nextInt(1000)+1;
            Integer max;
//*******************************************************************************************************************
// this sets up the specifics of each ride, such as their name, how much they carry, and how long they run for
            //ferris wheel
            while(parkGoers > 0){
                // this determines how many people board a ride, repeat until out of visitors
                max = new Random().nextInt(40)+20;
                Thread t1 = new Amusement("Ferris wheel", parkGoers, max,60,300);
                //first thread
                t1.start();
                Thread.State currState = Thread.currentThread().getState();
                if (currState != Thread.State.NEW && currState != Thread.State.TERMINATED){
                    // subtracts from total number of parkGoers once ride actually starts
                    parkGoers -= max;}
                if(parkGoers <= 0){
                    break;}
//*******************************************************************************************************************
                //Water slide
                max = new Random().nextInt(40)+20;
                Thread t2 = new Amusement("Water slide", parkGoers, max,60,30);
                t2.start();
                Thread.State currState1 = Thread.currentThread().getState();
                if (currState1 != Thread.State.NEW && currState1 != Thread.State.TERMINATED){
                    parkGoers -= max;}
                if(parkGoers <= 0){
                    break;}
//*********************************************************************************************************************
                //roller coaster
                max = new Random().nextInt(40)+20;
                Thread t3 = new Amusement("Roller coaster", parkGoers, max,60,240);
                t3.start();
                Thread.State currState2 = Thread.currentThread().getState();
                if (currState2 != Thread.State.NEW && currState2 != Thread.State.TERMINATED){
                    parkGoers -= max;}
                if(parkGoers <= 0){
                    break;}
//***********************************************************************************************************************
                //tower of terror
                max = new Random().nextInt(40)+20;
                Thread t4 = new Amusement("Tower of terror", parkGoers, max,60,160);
                t4.start();
                Thread.State currState3 = Thread.currentThread().getState();
                if (currState3 != Thread.State.NEW && currState3 != Thread.State.TERMINATED){
                    parkGoers -= max;}
                if(parkGoers <= 0){
                    break;}
//***********************************************************************************************************************
                //roller coaster 2
                max = new Random().nextInt(40)+20;
                Thread t5 = new Amusement("Roller Coaster #2", parkGoers, max,20,120);
                t5.start();
                Thread.State currState4 = Thread.currentThread().getState();
                if (currState4 != Thread.State.NEW && currState4 != Thread.State.TERMINATED){
                    parkGoers -= max;}
                if(parkGoers <= 0){
                    break;}}
//**************************************************************************************************************************
            // ends the loop and prints "out of attendees" message
            System.out.println("All passengers have now boarded...");}
//**********************************************************************************************************************
        catch(Exception e){
// Throw an exception and print error message
            System.out.println(e);
        System.out.println("error with threads");}}
//************************************************************************************************************************
    //creates new class thread
    public static void main(String[] args){
        Thread m = new ThemePark();
        m.start();}}