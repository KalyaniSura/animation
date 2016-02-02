Class Singletone
{
 private Singletone() {
     
 }
  private static SingleObject instance = new SingleObject();
  public static SingletoneObject getInstance(){
      return instance;
   }
}
class SingletonImpl extend Singletone  {
  public static void main(String [] args)  {
      SingletoneObject object = SingletoneObject.getInstance();
  }
}



