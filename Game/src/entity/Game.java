package entity;

public class Game {
    private String Tên;
    private String Môtả;
    private String Giá;
    private String Ngàypháthành;

    public Game(String s) {
    }

    public String getTên() {
        return Tên;
    }

    public void setTên(String tên) {
        Tên = tên;
    }

    public String getMôtả() {
        return Môtả;
    }

    public void setMôtả(String môtả) {
        Môtả = môtả;
    }

    public String getGiá() {
        return Giá;
    }

    public void setGiá(String giá) {
        Giá = giá;
    }

    public String getNgàypháthành() {
        return Ngàypháthành;
    }

    public void setNgàypháthành(String ngàypháthành) {
        Ngàypháthành = ngàypháthành;
    }

    public String getTrangchủ() {
        return Trangchủ;
    }

    public void setTrangchủ(String trangchủ) {
        Trangchủ = trangchủ;
    }

    private String Trangchủ;

    public Game(String tên, String môtả, String giá, String ngàypháthành, String trangchủ) {
        Tên = tên;
        Môtả = môtả;
        Giá = giá;
        Ngàypháthành = ngàypháthành;
        Trangchủ = trangchủ;
    }

    @Override
    public String toString() {
        return "Game{" +
                "Tên='" + Tên + '\'' +
                ", Môtả='" + Môtả + '\'' +
                ", Giá='" + Giá + '\'' +
                ", Ngàypháthành='" + Ngàypháthành + '\'' +
                ", Trangchủ='" + Trangchủ + '\'' +
                '}';
    }
}
