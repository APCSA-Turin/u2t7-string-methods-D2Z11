public class Runner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        Boolean isLonger = methods.longerThan("Sup", -1);
        System.out.println(isLonger);
        String str = methods.funnyString("null", 0);
        System.out.println(str);
        str = methods.halvesReversed("I'm not half anymore");
        System.out.println(str);
        str = methods.pigLatin("piglatin");
        System.out.println(str);
        str = methods.removeCharacter("HOLA", 1);
        System.out.println(str);
        str = methods.insertAt("Hello ", "World!", " ");
        System.out.println(str);
        str = methods.endUp("Sup", 3);
        System.out.println(str);
        str = methods.yellOrWhisper("I'M ALL CAPS");
        System.out.println(str);
        str = methods.starBetween("YOLO");
        System.out.println(str);
    }
}