public class Main {

    public static void main(String[] args) {
        int mass_kg = 74;
        double height_meters = 1.72;
        System.out.println("Масса (кг): " + mass_kg + ", рост (м): " + height_meters);
        BmiService service = new BmiService();
        System.out.println("Индекс массы тела (кг/м²): " + service.calculate(mass_kg, height_meters));
    }
}