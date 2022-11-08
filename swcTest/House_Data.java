package swcTest;
import java.io.*;
import java.util.StringTokenizer;

public class House_Data {
    public static void main(String[] args) throws IOException {
        try {
            String Business_Registration, property_Name, house_Type;
            double development_Phase, cost_Per_Unit;
            int total_Houses;

            FileReader fR = new FileReader("Property.txt");
            BufferedReader br = new BufferedReader(fR);
            FileWriter fW = new FileWriter("Quantity.txt");
            PrintWriter pW = new PrintWriter(fW);
            FileWriter fW1 = new FileWriter("total.txt");
            PrintWriter pW1 = new PrintWriter(fW1);

            String line = br.readLine();
            int semiD_Quantity = 0, bungalow_Quantity = 0, town_House_Quantity = 0, double_Storey_Quantity = 0, single_Storey_Quantity = 0;

            double mudra = 0, salam = 0, creative = 0, azlan = 0, nick = 0;
            pW1.println("The total cost for each Property is : ");
            while (line != null) {
                StringTokenizer st = new StringTokenizer(line, ",");
                st.nextToken();
                property_Name = st.nextToken();
                house_Type = st.nextToken();
                st.nextToken();
                total_Houses = Integer.parseInt(st.nextToken());
                cost_Per_Unit = Double.parseDouble(st.nextToken());

                if (house_Type.equalsIgnoreCase("Semi D")) {
                    semiD_Quantity = semiD_Quantity + total_Houses;
                } else if (house_Type.equalsIgnoreCase("Bungalow")) {
                    bungalow_Quantity = bungalow_Quantity + total_Houses;
                } else if (house_Type.equalsIgnoreCase("Town House")) {
                    town_House_Quantity = town_House_Quantity + total_Houses;
                } else if (house_Type.equalsIgnoreCase("Double Storey")) {
                    double_Storey_Quantity = double_Storey_Quantity + total_Houses;
                } else if (house_Type.equalsIgnoreCase("Single Storey")) {
                    single_Storey_Quantity = single_Storey_Quantity + total_Houses;
                }
                if (property_Name.equals("Mudra Sdn Bhd")) {
                    mudra = mudra + cost_Per_Unit;
                } else if (property_Name.equals("Salam Property")) {
                    salam = salam + cost_Per_Unit;
                } else if (property_Name.equals("Creative Partner")) {
                    creative = creative + cost_Per_Unit;
                } else if (property_Name.equals("Azlan Adik Beradik")) {
                    azlan = azlan + cost_Per_Unit;
                } else if (property_Name.equals("Nick & Rakan")) {
                    nick = nick + cost_Per_Unit;
                }
                line = br.readLine();
            }
            pW.println("Semi D is " + semiD_Quantity +" houses");
            pW.println("Bungalow is " + bungalow_Quantity +" houses");
            pW.println("Town House is " + town_House_Quantity +" houses");
            pW.println("Double Storey is " + double_Storey_Quantity +" houses");
            pW.println("Single Storey is " + single_Storey_Quantity +" houses");

            pW1.println("Mudra Sdn. Bhd : " + mudra);
            pW1.println("salam Property : " + salam);
            pW1.println("Creative Partner : " + creative);
            pW1.println("Azlan Adik Beradik : " + azlan);
            pW1.println("Nick & Rakan : " + nick);

            pW.close();
            pW1.close();
            br.close();
        } catch (FileNotFoundException f_N_F) {
            System.out.print(f_N_F.getMessage());
        } catch (EOFException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException iO) {
            System.out.print(iO.getMessage());
        } catch (Exception nF) {
            System.out.print(nF);
        } finally {
            System.out.println("====== System Ends ======");
        }
    }
}
