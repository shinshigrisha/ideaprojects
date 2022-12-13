public class Country {
    private String name;
    private int people;
    private double square;
    private String capital;
    private boolean sea;

    public Country(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setSea(boolean sea) {
        this.sea = sea;
    }


    public String getName() {
        return name;
    }

    public int getPeople() {
        return people;
    }

    public double getSquare() {
        return square;
    }

    public String getCapital() {
        return capital;
    }

    public boolean isSea() {
        return sea;
    }


}
