public class SkyView {
    private int numRows;
    private int numColumns;
    private double[] scan;
    double[][] view;
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
    public double getAverage(int startRow, int endRow, int startColumn, int endColumn)
    {
        double average = 0;
        int length = (endRow - startRow) * (endColumn - startColumn);
        for(int j = startRow; j < endRow; j++)
        {
            for(int i = startColumn; i < this.numColumns; i++)
            {
                average += view[i][j];
            }
        }
        average = average / length;
        return average;
    }
}
