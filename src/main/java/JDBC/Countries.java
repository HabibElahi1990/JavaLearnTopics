package JDBC;

public class Countries {

    private String countryId;
    private String countryName;
    private Integer regionId;

    Countries(String countryId, String countryName, Integer regionId) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.regionId = regionId;
    }


    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    String insertCountry(){
        return "insert into COUNTRIES (COUNTRY_ID,COUNTRY_NAME,REGION_ID) values" +
                "(" + "'"+ this.countryId +"' , '"+ this.countryName+" ', "+ this.regionId+
                ")";
    }

    String updateCountry(String countryName){
        return "update COUNTRIES c set c.COUNTRY_NAME= '"+countryName + "' where c.COUNTRY_ID ='"+this.countryId+"'";
    }

    String selectCountry(){
        return "select * from COUNTRIES c where c.COUNTRY_ID ='"+this.countryId+"'";
    }
    String deleteCountry(){
        return "delete from COUNTRIES c where c.COUNTRY_ID=?";
    }

    @Override
    public String toString() {
        return "Countries{" +
                "countryId='" + countryId + '\'' +
                ", countryName='" + countryName + '\'' +
                ", regionId=" + regionId +
                '}';
    }
}
