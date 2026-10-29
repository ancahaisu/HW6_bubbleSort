package ro.ScoalaInformala.Anca;

public class BubbleSortAlgorithm {
    public SalesRepresentative[] BubbleSort(SalesRepresentative[] sr) {
        for (int i = 0; i < sr.length - 1; i++) {
            for (int j = 0; j < sr.length - 1 - i; j++) {
                if (sr[j].getRevenue() < sr[j + 1].getRevenue()) {
                    SalesRepresentative temp = sr[j];
                    sr[j] = sr[j + 1];
                    sr[j + 1] = temp;
                }
            }
        }
        return sr;
    }
}
