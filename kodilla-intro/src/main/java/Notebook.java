public class Notebook {
    int price;
    int weight;
    int year;
    double screenSize;
    String purpose;


    public Notebook(int price, int weight, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 800) {
            System.out.println("This notebook is light.");
        } else if (this.weight < 1700) {
            System.out.println("This notebook is quite light.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkYear() {
        if (this.year > 2018 && this.price > 1000) {
            System.out.println("It's a brand new notebook.");
        } else if (this.year >= 2010 && this.price > 600) {
            System.out.println("The price corresponds with a quality.");
        } else {
            System.out.println("This notebook is from older generation.");
        }
    }

    public Notebook(double screenSize, String purpose) {
        this.screenSize = screenSize;
        this.purpose = purpose;


    }

    public void checkScreenSize() {
        if (this.screenSize < 15.0) {
            System.out.println("This notebook has a small screen, but it's really convenient.");
        } else if (this.screenSize < 17.0) {
            System.out.println("This screen is bigger, so you can see wider picture.");
        } else {
            System.out.println("This notebook's screen is really big.");
        }
    }


    public void checkPurpose() {
        if ("portable".equals(this.purpose) && this.screenSize < 15.0) {
            System.out.println("This notebook is perfect if you work remotely.");
        } else if ("work".equals(this.purpose) && this.screenSize < 17.0) {
            System.out.println("This notebook if for people who work in the office.");
        } else {
            System.out.println("This notebook is the best choice for fans of games.");
        }
    }
}


