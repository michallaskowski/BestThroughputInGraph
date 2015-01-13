package pl.gis.throughput;

/**
 * Created by michalek on 10/01/15.
 */
public class AdjacencyMatrix {

    private int[][] matrix;
    private int size;

    public AdjacencyMatrix(int size){
        matrix = new int[size][size];
        this.size = size;
    }

    public int get(int w, int h){
        return matrix[w][h];
    }
    public void set(int w, int h, int value){
        matrix[w][h] = value;
    }

    public int[] get(int w){
        return matrix[w];
    }

    public int getSize() {
        return size;
    }
}
