package WzorceStrukturalne.Dekorator;

public class Main {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,10000000\nSteven Uijin,912999";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/decoded.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/decoded.txt");
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
