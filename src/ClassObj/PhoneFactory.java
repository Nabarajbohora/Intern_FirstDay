package ClassObj;

class ClassObjExample {
    //attribute proporties

    String brands;
    String color;
    int storage;
    int batteryLevel;
    ClassObjExample (String brands,  String color, int storage, int bettryLevel){
        this.brands = brands;
        this.color = color;
        this.storage = storage;
        this.batteryLevel =batteryLevel;

    }
    void call(String personname){
        if(batteryLevel<5){
            System.out.println(brands+ "please check your mobile battery try again later  ");

        }else {
            System.out.println(brands+" from"+personname+"to calling......");
            batteryLevel = batteryLevel -5;
        }
    }
    void charge(){
        batteryLevel = 100;
        System.out.println(brands+"completed  charge 100%");
    }
    void showDetail(){
        System.out.println("📱 फोनको विवरण: ");
        System.out.println("   Brand: " + brands);
        System.out.println("   Color: " + color);
        System.out.println("   Storage: " + storage + "GB");
        System.out.println("   Battery: " + batteryLevel + "%");
        System.out.println("-----------------------------");
    }
}
public class PhoneFactory{
    public static void main(String[]args){
        System.out.println("===== फ्याक्ट्रीमा फोन बनाउँदै =====");

        ClassObjExample ramPhone = new ClassObjExample("sumsung","Red",128,28);
        ClassObjExample shyamPhone = new ClassObjExample("Apple", "Black", 256, 20);
        ClassObjExample nabaraj = new ClassObjExample("Android","yellow", 512,75);
        System.out.println("\n--- रामको फोन ---");
        ramPhone.showDetail(); // Method call गर्दै

        System.out.println("--- श्यामको फोन ---");
        shyamPhone.showDetail();

        // २.३) Object ले काम (Methods) गरौं
        System.out.println("\n===== फोन प्रयोग गर्दै =====");

        ramPhone.call("सीता"); // रामको फोनले कल गर्छ
        shyamPhone.call("हरि"); // श्यामको फोनले कल गर्छ (ब्याट्री २०% छ)

        System.out.println("\n--- श्यामको फोन चार्ज गरौं ---");
        shyamPhone.charge(); // श्यामको फोन मात्र चार्ज हुन्छ

        System.out.println("\n--Nabaraj phone");
        nabaraj.charge();
        System.out.println("\n--- फेरि Details हेरौं (कति फरक पर्यो?) ---");
        ramPhone.showDetail();
        shyamPhone.showDetail();
        nabaraj.showDetail();
    }

}




