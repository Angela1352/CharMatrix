
public class CharMatrixDriver {
    public static void main (String[] args) {

        System.out.println("Create a CharMatrix filled with A's ...");
        CharMatrix matrix = new CharMatrix(3, 4, 'A');
        matrix.display();

        System.out.println("Testing setCharAt ...");
        System.out.println("  CharMatrix before method call:");
        matrix.display();

        matrix.setCharAt(0, 0, 'k');

        System.out.println("  CharMatrix after method call:");
        matrix.display();

        System.out.println("# rows: " + matrix.numRows());
        System.out.println("# cols: " + matrix.numCols());
        System.out.println(matrix.charAt(1, 2));
        System.out.println("empty: " + matrix.isEmpty(2, 2));

        System.out.println("# in row: " + matrix.countInRow(1));
        System.out.println("# in col: " + matrix.countInCol(1));

        matrix.fillRect(1, 1, 2, 2, 'B');
        matrix.display();

    } 
}
