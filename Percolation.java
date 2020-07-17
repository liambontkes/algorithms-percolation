/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User index:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Percolation {

    private static final int CLOSED = 1;
    private static final int OPEN = 0;

    private int[] index;
    private int[] size;
    private int[] state;

    // creates n-by-n index, with all sites initially blocked
    public Percolation(int n) {
        index = new int[n];

        for (int i = 1; i < n+1; i++) {
            index[i] = CLOSED;
            size[i] = 0;
            state[i] = CLOSED;
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        if (index[row*col] == CLOSED)
            index[row*col] = OPEN;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        return index[row*col] == OPEN;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        return index[row*col] == FULL;
    }

    // returns the number of open sites
    public int numberOfOpenSites() {

    }

    // does the system percolate?
    public boolean percolates() {

    }

    // test client
    public static void main(String[] args) {

    }
}
