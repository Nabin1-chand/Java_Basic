class Animal{
    void dog(){
        System.out.println("Dog bark");

    }

    void tiger(){
        System.out.println("Tiger is strong animal");
    }
    public static void main(String args []){
        Animal obj = new Animal();
        obj.dog();
        obj.tiger();
        Bird obj1 = new Bird();
        obj1.crow();
    }
}


class Bird{
    void crow(){
        System.out.println("Crow is intelligent bird");
    }
}