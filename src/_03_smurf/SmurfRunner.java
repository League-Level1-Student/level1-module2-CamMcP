package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
Smurf Handy = new Smurf("Handy");
Handy.eat();
String name = Handy.getName();
System.out.println(name);
String color = Handy.getHatColor();
System.out.println(color);
String gender = Handy.isGirlOrBoy();
System.out.println(gender);
Smurf Papa = new Smurf("Papa");
Papa.eat();
String Name = Papa.getName();
System.out.println(Name);
String Color = Papa.getHatColor();
System.out.println(Color);
String Gender = Papa.isGirlOrBoy();
System.out.println(Gender);
Smurf Smurfette = new Smurf("Smurfette");
Smurfette.eat();
String nAme = Smurfette.getName();
System.out.println(nAme);
String cOlor = Smurfette.getHatColor();
System.out.println(cOlor);
String gEnder = Smurfette.isGirlOrBoy();
System.out.println(gEnder);
}
}

