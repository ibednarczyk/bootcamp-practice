public class FirstClass {
        public static void main(String[] args) {
                Notebook modernNotebook = new Notebook(1200, 700, 2019);
                System.out.println("Parameters of the modern notebook: price: " + modernNotebook.price + "pln, weight: " + modernNotebook.weight + "g, manufacture year: " + modernNotebook.year + "yr");
                modernNotebook.checkPrice();
                modernNotebook.checkWeight();
                modernNotebook.checkYear();


                Notebook oldNotebook = new Notebook(500, 2000, 2000);
                System.out.println("Parameters of the old notebook: " + oldNotebook.price + "pln, weight: " + oldNotebook.weight + "g, manufacture year: " + oldNotebook.year + "yr");
                oldNotebook.checkPrice();
                oldNotebook.checkWeight();
                oldNotebook.checkYear();


                Notebook averageNotebook = new Notebook(800, 1600, 2010);
                System.out.println("Parameters of the average notebook: price: " + averageNotebook.price + "pln, weight: " + averageNotebook.weight + "g, manufacture year: " + averageNotebook.year + "yr");
                averageNotebook.checkPrice();
                averageNotebook.checkWeight();
                averageNotebook.checkYear();


                Notebook smallNotebook = new Notebook(13.3, "portable");
                System.out.println("Parameters of small notebook: screen size: " + smallNotebook.screenSize + " inches");
                smallNotebook.checkScreenSize();
                smallNotebook.checkPurpose();

                Notebook mediumNotebook = new Notebook(15.6, "work");
                System.out.println("Parameters of medium notebook: screen size: " + mediumNotebook.screenSize + " inches");
                mediumNotebook.checkScreenSize();
                mediumNotebook.checkPurpose();

                Notebook bigNotebook = new Notebook(17.3, "gaming");
                System.out.println("Parameters of big notebook: screen size: " + bigNotebook.screenSize + " inches");
                bigNotebook.checkScreenSize();
                bigNotebook.checkPurpose();


        }

}





