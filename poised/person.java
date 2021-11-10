public class person{
// class for the individual people
// creating private variables
    private String name;
    private int telephone;
    private String email;
    private String address;

    // creating a method for all the variables
    public person(String name,int telephone,String email, String address){
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    // getters for the questions to be asked through the method
    public String getName() {
        return name;
    }
    
    public int getTelephone(){
        return telephone;
    }

    public String gatEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    // to
    public String toString() {
        String persons =
        "\n name: " + name +
        "\n Telephone NUmber: " + telephone+
        "\nemail address: " + email +
        "\nPhysical address: " + address;
        return persons;

    }












}