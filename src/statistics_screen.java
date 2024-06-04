//This is a class used in the class diagramm and is not to be
//used for this scenarios
public class statistics_screen {
    private double data;
    private double results;

    public void print() {
        // Your print logic goes here
        System.out.println("Data: " + data);
        System.out.println("Results: " + results);
    }

    public void calculate() {
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public double getResults() {
        return results;
    }
}
