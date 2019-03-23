package entity;

public class Foods {
    private String Id;
    private String Name;
    private String Description;
    private String Prive;
    private String Date;

    public Foods(String id, String name, String description, String prive, String date) {
        Id = id;
        Name = name;
        Description = description;
        Prive = prive;
        Date = date;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrive() {
        return Prive;
    }

    public void setPrive(String prive) {
        Prive = prive;
    }

    public String getDate() {
        return Date;
    }

    @Override
    public String toString() {
        return "Foods{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", Prive='" + Prive + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }

    public void setDate(String date) {
        Date = date;
    }
}
