package javaEnum;

public class EnumDemo {

    public static void main(String[] args) {
        EnumDemo.EnumValues[] enumValuesArray=EnumDemo.EnumValues.values();
        for (EnumValues anEnumValuesArray : enumValuesArray) {
            System.out.println(anEnumValuesArray.getId() + " " + anEnumValuesArray.getKeyValue());
        }
        /* output
        0 COUNTRY
        1 PROVINCE
        2 CITY
         */
        EnumValues em= EnumValues.valueOf("COUNTRY");
        System.out.println(em);
    }
    public enum EnumValues{
        COUNTRY("COUNTRY"),
        PROVINCE("PROVINCE"),
        CITY("CITY");
        private String keyValue;

        EnumValues(String keyValue) {
            this.keyValue = keyValue;
        }

        public String getKeyValue() {
            return keyValue;
        }

        public Integer getId(){
            return ordinal();
        }
    }
}
