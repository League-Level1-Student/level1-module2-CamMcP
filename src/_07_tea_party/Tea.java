package _07_tea_party;

public class Tea {

public String welcome(String name, boolean isWoman, boolean isKnighted) {
if (isKnighted == true) {
	return "Hello Sir " + name;	
}
else if (isWoman == false) {
	return "Hello Mr. " + name;
}
else {
	return "Hello Ms. " + name;
}
}

}
