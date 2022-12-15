class Method{
    String address;
    String name;
//  call by method

    public void show(String a, String n){
        address = a;
        name = n;

    }
    public  void display(){
        System.out.println(address+ " " +name);
    }

    public  static void main(String  args[]){
        Method obj = new Method();
        obj.show("kanchanpur","Nabin");
        obj.display();
    }
}