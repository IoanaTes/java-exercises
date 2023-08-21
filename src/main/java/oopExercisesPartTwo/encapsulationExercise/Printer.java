package oopExercisesPartTwo.encapsulationExercise;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.duplex = duplex;
        this.pagesPrinted = 0;
        if (tonerLevel > -1 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount >= 100 || (tonerAmount + tonerLevel > 100)) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            if (pagesToPrint % 2 == 0) {
                pagesToPrint = pagesToPrint / 2;
                pagesPrinted = pagesToPrint;
            } else {
                pagesToPrint = (pagesToPrint / 2) + 1;
                pagesPrinted = pagesToPrint;
            }
        }
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
