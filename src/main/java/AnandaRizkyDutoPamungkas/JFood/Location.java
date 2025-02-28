package AnandaRizkyDutoPamungkas.JFood;

/**
 * Kelas ini digunakan untuk getter data lokasi pada JFood.
 * 
 * @author Ananda Rizky Duto Pamungkas
 * @version 27 Februari 2020
 * 
 */

public class Location
{
    private String province;
    private String description;
    private String city;

    /**
     * Constructor untuk objek location
     * @param city
     * @param province
     * @param description
     */

    public Location(String city, String province, String description)
    {
        this.city = city;
        this.province = province;
        this.description = description;
    }

    /**
     * Metode untuk mendapatkan nama provinsi pada lokasi
     * @return province dari lokasi
     */
    
    public String getProvince()
    {
        return province;
    }

    /**
     * Metode untuk mendapatkan nama kota pada lokasi
     * @return city dari lokasi
     */
    
    public String getCity()
    {
        return city;
    }
    
    /**
     * Metode untuk mendapatkan deskripsi pada lokasi
     * @return description dari lokasi
     */
    
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Metode untuk merubah nama provinsi pada lokasi
     * @param province dari lokasi
     */
    
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    /**
     * Metode untuk merubah nama kota pada lokasi
     * @param city dari lokasi
     */
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    /**
     * Metode untuk merubah deskripsi pada lokasi
     * @param description dari lokasi
     */
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    /**
     * Metode untuk menampilkan data
     * @return string
     */
    
    public String toString()
    {
        return "Province = " + province + 
               "\nCity = " + city + 
               "\nDescription = " + description;
    }
}
