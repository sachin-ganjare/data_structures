class _02_NPTELArrayDemonstration {
    public static void main(String args[]) {
        int month[];
        month = new int[12];
        month[0] = 31; //jan
        month[1] = 28; //feb
        month[2] = 31; //mar
        month[3] = 30; //apr
        month[4] = 31; //may
        month[5] = 30; //june
        month[6] = 31;// jul
        month[7] = 31; //aug
        month[8] = 30; //sept
        month[9] = 31; //oct
        month[10] = 30; //nove
        month[11] = 31; //dec
        System.out.println("April has " + month[3] + " days.");
    }
}
