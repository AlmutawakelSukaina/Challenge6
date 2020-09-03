fun main()
{
    val Emp=Employee("",10,100.0)


}


open class Employee{

    var Name=" "
    var Age=0
    var Salary=0.0
    constructor(Name:String,Age:Int,Salary:Double)
    {
        this.Name=Name;
        this.Age=Age;
        this.Salary=Salary

    }

}
class WebDeveloper:Employee
{
var Website=" "
    constructor(Website:String):super("Mohammed",24,100.0)
    {
        this.Website=Website
    }

}
class androidDevelpoer:Employee
{
 var android=" "
    constructor(android:String):super("Noor",20,500.0)
    {
        this.android=android
    }



}
class IOSdeveloper:Employee
{
var IOSApp=" "
    constructor(IOSApp:String):super("Sondos",29,8900.0)
    {
        this.IOSApp=IOSApp
    }


}