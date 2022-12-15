class Refernce{
    String name;
    String cast;
    
// call by refernce variable

    public static void main(String args []){
        Refernce obj = new Refernce();
        obj.name ="Nabin";
        obj.cast = "Chand";

      System.out.println(obj.name + " " +obj.cast);
    }
}