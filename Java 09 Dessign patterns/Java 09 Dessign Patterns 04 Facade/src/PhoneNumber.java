public class PhoneNumber {
    private static String selectedInterPrefix;
    private String internationalPrefix;
    private String areaNumber;
    private String netNumber;

    public PhoneNumber(String intPrefix, String areaNumber, String netNumber) {
        this.internationalPrefix = intPrefix;
        this.areaNumber = areaNumber;
        this.netNumber = netNumber;
    }
    
    public String getInternationalPrefix(){ return internationalPrefix; }
    public String getAreaNumber(){ return areaNumber; }
    public String getNetNumber(){ return netNumber; }
    public static String getSelectedInterPrefix(){ return selectedInterPrefix; }
    
    public void setInternationalPrefix(String newPrefix){ internationalPrefix = newPrefix; }
    public void setAreaNumber(String newAreaNumber){ areaNumber = newAreaNumber; }
    public void setNetNumber(String newNetNumber){ netNumber = newNetNumber; }
    public static void setSelectedInterPrefix(String prefix) { selectedInterPrefix = prefix; }
    
    public String toString(){
        return internationalPrefix + areaNumber + netNumber;
    }
}