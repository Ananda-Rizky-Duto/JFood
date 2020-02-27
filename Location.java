public class Location
{
    /**
     * Kelas ini digunakan untuk getter data lokasi pada JFood.
     * 
     * @author Ananda Rizky Duto Pamungkas
     * @version 27 Februari 2020
     * 
     */
    
    private String province;
    private String description;
    private String city;

    public Location(String city, String province, String description)
    {
        this.city = city;
        this.province = province;
        this.description = description;
    }

    public String getProvince()
    {
        return province;
    }

    public String getCity()
    {
        return city;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public void printData()
    {
        System.out.println(this.province);
    }
}
