
public class Country {
    private String name;
    private double square;
    private double population;
    private String capital;
    private double populatCapital;

    public Country(String name, double square, double population, String capital, double populatCapital) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Название страны не может быть пустым");
        }
        if (square <= 0 || population <= 0) {
            throw new IllegalArgumentException("Площадь и население должны быть строго больше нуля");
        }

        this.name = name;
        this.square = square;
        this.population = population;
        this.capital = capital;
        this.populatCapital = populatCapital;
    }

    public Country(String name, double square, double population) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Название страны не может быть пустым");
        }
        if (square <= 0 || population <= 0) {
            throw new IllegalArgumentException("Площадь и население должны быть строго больше нуля");
        }
        this.name = name;
        this.square = square;
        this.population = population;
    }
    double Density() {
        return population / square;
    }
public String getName() {
    return name;
}

        public double getSquare() {
            return square;
        }

        public double getPopulation() {
            return population;
        }

        public String getCapital() {
                return capital;
        }

        public double getPopulatCapital() {
            return populatCapital;
        }

        public void setName(String Name) {
            if (!Name.isEmpty()) {
                this.name = Name;
            } else {
                System.out.println("Ошибка! Строка с именем не может быть пустой!");
            }
        }
        public void setSquare(double Square) {
            if (Square>0){
            this.square = Square;}
            else {System.out.println("Ошибка,площадь не может быть меньше 0");
            }}

        public void setPopulation(double Population) {
            if (Population>0){
            this.population = Population;}
            else {System.out.println("Ошибка,население страны не может быть меньше 0");
        }}
        public void setCapital(String capital) {
            if (!capital.isEmpty()) {
            this.capital = capital;
            }
            else {
                System.out.println("Ошибка,Строка с названием не может быть пустой");
            }
    }
    public void setCapital(String capitalName, Double capitalPopulation) {
        this.capital = capitalName;
        this.populatCapital = capitalPopulation;
    }
        public void setPopulatCapital(double PopulatCapital) {
            if (PopulatCapital > 0 && PopulatCapital != 0) {
                this.populatCapital = PopulatCapital;
            } else {
                System.out.println("Ошибка,площадь не может быть меньше и ровна 0");
            }
        }
    public void capitalCancel()
    {
        this.capital = null;
        this.populatCapital = 0;
    }
    public void print()
    {
        String s = " Название страны - " + this.getName() + ", площать страны " + this.getSquare() + "млн кв. км., население -  "
                + this.getPopulation() + "млн ч., Название столицы " + this.getCapital() + ", население столицы - " + this.getPopulatCapital() + "млн чел."+ "  Плотность населения - "+this.Density();
        System.out.println(s);
    }
    public static void printAll(Country[] countries) {
        for (Country fqwefqwcfqw: countries) {
            fqwefqwcfqw.print();
            System.out.println();
        }
    }
    public class Main {
        public static void main(String[] args) {
            Country Russia = new Country("Russia", 17.1, 145.7, "Moscow", 12.6);
            Russia.print();
            Russia.capitalCancel();
          //  Russia.print();
            Country Finland = new Country("Finland", 338000, 5500000, "Helsinki", 655);
            Country France = new Country("France", 643800, 67800000, "Paris", 2.1);
            Country Andorra = new Country("Andorra", 467, 85400, "Andorra la Vella", 22.6);
            Country Singapore = new Country("Singapore", 725, 5.7);
            Country[] countries = {Russia, Finland, France, Andorra, Singapore};
            Country.printAll(countries);
        }

    }
}



