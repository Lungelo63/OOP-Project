public class poised{
// creating private variables
    private int number;
    private String name;
    private String building;
    private String address;
    private int erf;
    private int total;
    private int paid;
    private String deadline;

// creating  method that includes all the variables
    public poised(int number, String name, String building, String address,
    int erf, int total, int paid, String deadline) {

        this.number = number;
        this.name = name;
        this.building = building;
        this.address = address;
        this.erf = erf;
        this.total = total;
        this.paid = paid;
        this.deadline = deadline;
        
    }

    // creating getters for all the variables
    public int getNumber() {
        return number;}
    
    public String getName() {
        return name;
    }

    public String getBuilding(){
        return building;
    }

    public String getAddress(){
        return address;
    }

    public int getErf() {
        return erf;
    }

    public int getTotal() {
        return total;
    }

    public int getPaid(){
        return paid;
    }

    public String getDeadline() {
        return deadline;
    }

    // A toString that will print in a easy to read format with return function
    public String toString() {
        String poisedString = "\nProject number: " + number +
            "\nproject name: " + name +
            "\nBuilding Type: " + building +
            "\nPhysical address: " + address +
            "\nERF number: " + erf +
            "\nTotal fee: " + total +
            "\nAmount paid: " + paid +
            "\nDeadline: " + deadline;
        return poisedString;
    }









}