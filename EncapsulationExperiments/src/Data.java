public class Data {
    public String name;
    public String capital;
    public boolean sea;

    public Data(String name, String capital, boolean sea) {
        this.name = name;
        this.capital = capital;
        this.sea = sea;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public boolean isSea() {
        return sea;
    }

    public void setSea(boolean sea) {
        this.sea = sea;
    }


}
