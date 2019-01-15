public class SkyView {
    private int numRows;
    private int numColumns;
    private double[] scan;
    private double[][] view;
    //constructor
    public SkyView(int numRows, int numColumns, double[] scan)
    {
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.scan = scan;
        int scanCounter = 0;

        for(int i = 0; i < numRows; i++)
        {
            for(int j = 0; j < numColumns; j++)
            {
                view[j][i] = scan[scanCounter];
                scanCounter++;
            }
            scanCounter++;
        }
    }

    //methods
    public int getAverage(int startRow, int endRow, int startColumn, int endColumn)
    {
        int average = 0;
        return average;
    }
}
