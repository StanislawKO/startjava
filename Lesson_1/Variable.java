public class Variable {
    public static void main(String[] args) {
        byte numberOfCores = 2;
        short threads = 4;
        int processorFrequency = 3500;
        long socket = 1151;
        double dramFrequency = 1064.5;
        float nbFrequency = 797.8f;
        char cpuModel = 'E';
        boolean graphicsShader = false;

        System.out.println("numberOfCores = " + numberOfCores);
        System.out.println("threads = " + threads);
        System.out.println("processorFrequency = " + processorFrequency);
        System.out.println("socket = " + socket);
        System.out.println("dramFrequency = " + dramFrequency);
        System.out.println("nbFrequency = " + nbFrequency);
        System.out.println("cpuModel = " + cpuModel);
        System.out.println("graphicsShader = " + graphicsShader);
    }
}
