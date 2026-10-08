package ro.ScoalaInformala.Anca;

public class SalesRepresentative {
    private String name;
    private int numberOfSales;
    private double quotaPerSale;

    public SalesRepresentative(String name, int numberOfSales, double quotaPerSale) {
        this.name = name;
        this.numberOfSales = numberOfSales;
        this.quotaPerSale = quotaPerSale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }

    public double getQuotaPerSale() {
        return quotaPerSale;
    }

    public void setQuotaPerSale(double quotaPerSale) {
        this.quotaPerSale = quotaPerSale;
    }

    @Override
    public String toString() {
        return "SalesRepresentative{" +
                "name='" + getName() + '\'' +
                ", numberOfSales=" + getNumberOfSales() +
                ", quotaPerSale=" + getQuotaPerSale() +
                '}' + "\nRevenue: " + getRevenue() + "$";
    }

    public double getRevenue() {
        return getNumberOfSales() * getQuotaPerSale();
    }
}
