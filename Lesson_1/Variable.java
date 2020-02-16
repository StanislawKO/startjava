public class Variable {
    public static void main(String[] args) {
        byte numberOfCores = 2;
        short threads = 4;
        int processorFrequency = 3500;
        long socket = 1151;
        double DRAM_Frequency = 1064.5;
        float NB_Frequency = 797.8f;
        char CPU_Model = 'E';
        boolean graphicsShader = false;

        System.out.println("numberOfCores = " + numberOfCores);
        System.out.println("threads = " + threads);
        System.out.println("processorFrequency = " + processorFrequency);
        System.out.println("socket = " + socket);
        System.out.println("DRAM_Frequency = " + DRAM_Frequency);
        System.out.println("NB_Frequency = " + NB_Frequency);
        System.out.println("CPU_Model = " + CPU_Model);
        System.out.println("graphicsShader = " + graphicsShader);
    }
}
