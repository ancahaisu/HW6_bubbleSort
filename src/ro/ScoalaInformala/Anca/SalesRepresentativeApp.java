package ro.ScoalaInformala.Anca;

public class SalesRepresentativeApp {
    public void run() {
        SalesRepresentative[] representatives = {
                new SalesRepresentative("Andrada", 10, 500),
                new SalesRepresentative("Eric", 7, 800),
                new SalesRepresentative("Delia", 12, 400),
                new SalesRepresentative("Andrei", 5, 1000)
        };
        BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();
        SalesRepresentative[] sortedRepresentatives =
                bubbleSort.BubbleSort(representatives);
        for (SalesRepresentative representative : sortedRepresentatives) {
            System.out.println(representative);
        }
    }
}

