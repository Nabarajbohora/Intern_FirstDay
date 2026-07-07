package ArrayExamples;

public class EasyExample {
    public static void main(String[]args){


        String [] Dabba = {"banana", "apple", "Orange", "Papaya"};
        System.out.println("=== mero Dabba ko kura haru===\n");
        System.out.println("What is position two ="+Dabba[1]);
        System.out.println("Sabaii khana haru:.=");
        for(int i= 0; i< Dabba.length;i++){
            System.out.println("No."+i+"ma-"+Dabba[i]);


            String [] Sathi = {"junmaya", "Sunita", "Bipana", "Karama"};
            System.out.println("==Sabaii sathiki harulaii mero nameste===\n");
            for(int j= 0; j < Sathi.length;j++){
                System.out.println("Nameste  " +Sathi[j]+"..How are you.?");
            }
        }

    }
}
