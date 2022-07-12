package target.system;

public class Ex4 {
    public static void main(String[] args){
        double[] states = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
        double[] percentages = new double[states.length];
        double totalBilling = 0d;

        //ADDING TOTAL BILLING TO VARIABLE
        for (double state : states) {
            totalBilling += state;
        }
        //TRIGGERING PERCENTAGE OF VALUES, SORTED IN ORDER OF INSERTION WITHIN THE VECTOR
        for(int i = 0; i < percentages.length; i++){
            percentages[i] = (states[i] * 100) / totalBilling;
        }

        System.out.println("Billing Summary");
        System.out.println("----------------------");
        System.out.printf("SP - %.2f%%%n",percentages[0]);
        System.out.printf("RJ - %.2f%%%n",percentages[1]);
        System.out.printf("MG - %.2f%%%n",percentages[2]);
        System.out.printf("ES - %.2f%%%n",percentages[3]);
        System.out.printf("OTHERS - %.2f%%%n",percentages[4]);









    }
}
