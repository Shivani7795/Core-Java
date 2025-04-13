package casting;

public class GeneratorRunner {
    public static void main(String[] args) {
        Generator generator = new Generator();
        generator.generate();//parent

        Generator generator1 = new Inverter();
        generator1.generate();//child

        Inverter inverter2 = (Inverter)generator1;
        inverter2.backup();

        Inverter inverter = new Inverter();
        inverter.generate();//parent
        inverter.backup();
    }
}

