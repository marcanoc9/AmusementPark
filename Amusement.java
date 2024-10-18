//This is a program to manage and log multiple rides at a theme park using threads.
//This program  keeps track of when rides are running, when they stop and the number of passengers at a time.
//Adv Java
//Christopher Marcano
//***********************************************************************************************************************

// make sure to extend the thread
public class Amusement extends Thread{
    // this section describes the ride and sets up some necessary variables
    private Integer maximumRiders,rideLength,waitQueue,onTheRide;
    private String nameOfRide;
    private Boolean isOn;
//******************************************************************************************************************
    // sets up the inputs using the above variables
    public Amusement(String name,Integer wait,Integer ride,Integer maximum,Integer length){
        nameOfRide = name;
        waitQueue = wait;
        onTheRide = ride;
        maximumRiders = maximum;
        rideLength = length;
        isOn = false;}
//**************************************************************************************************************************
    //executes the threads and prints information to keep user appraised of ride status
    @Override
    public void run(){
        try{
            isOn = true;
            System.out.println(nameOfRide + " has started.");
            Thread.sleep(rideLength);
            isOn = false;
            System.out.println( nameOfRide + " has ended."); }
//**************************************************************************************************************************
        // throws the exception and displays an error message
        catch (Exception e){
            System.out.println(e);
            System.out.println("error with threads");}}}

