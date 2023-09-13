package assistedPracticeProject1;
public class stringBufferAndStringBuilder {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        StringBuffer stringBuffer = new StringBuffer(originalString);
        StringBuilder stringBuilder = new StringBuilder(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("StringBuffer Conversion: " + stringBuffer);
        System.out.println("StringBuilder Conversion: " + stringBuilder);
    }
}
