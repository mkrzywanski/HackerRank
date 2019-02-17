public class DesignerPDFViewer {
    public static void main(String[] args) {
        int[] heights = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        String word = "zaba";
        System.out.println(designerPdfViewer(heights, word));
    }

    static int designerPdfViewer(int[] h, String word) {
        int maxHeight = 0;
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            int index = character - 97;
            int height = h[index];
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight * word.length();
    }
}
