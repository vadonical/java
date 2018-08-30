public class Hello {
    private int number;
    private String name;
    private String address;

    void setAddress(String address) {
        this.address = address;
    }

    String getAddress() {
        return address;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setNumber(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    void printSome(String newName,String newAddress,int newNumber){
        setAddress(newAddress);
        setName(newName);
        setNumber(newNumber);

        Hello hello = new Hello();

        System.out.println(getName());
    }

    public static void main(String [] args){
        Hello hello = new Hello();
        hello.printSome("beijing","Beijing",10086);

    }
}
