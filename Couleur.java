public class Couleur {
    public static void main(String args[]) {
        if(args.length == 0){
            System.out.println("Enter an Integer after java Couleur ...");
        }
        else{
            if( args[0].compareTo("1") >= 0 && args[0].compareTo("7")<=0){
                String rainbow[];
                int jour = Integer.parseInt(args[0]);
                rainbow = new String[7];
                rainbow[0] = "RED";
                rainbow[1] = "ORANGE";
                rainbow[2] = "YELLOW";
                rainbow[3] = "GREEN";
                rainbow[4] = "BLUE";
                rainbow[5] = "INDIGO";
                rainbow[6] = "VIOLET";
                System.out.println(rainbow[jour-1]);
            }else{
                System.out.println("Enter an Integer between 1 and 7");
            }
        }
    }
}