package pl.gis.throughput;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by michalek on 10/01/15.
 */
public class MinMaxSolver {

    private class VertexBefore {
        int vertexIndex;
        int throughput;
    }

    private class NextVertex {
        int vertexIndex;
        boolean searchingMax;
        boolean searchingMin;


        public NextVertex(int vertexIndex, boolean searchingMax, boolean searchingMin) {
            this.vertexIndex = vertexIndex;
            this.searchingMax = searchingMax;
            this.searchingMin = searchingMin;
        }
    }

    private VertexBefore[] tableMax;
    private VertexBefore[] tableMin;
    private LinkedList<NextVertex> vertexList = new LinkedList<NextVertex>();

    public MinMaxSolver(){
    }


    private void checkForChange(AdjacencyMatrix p_matrix, NextVertex p_vertex){
        for(int i=0; i < p_matrix.getSize(); i++){
            int v_weight = p_matrix.get(p_vertex.vertexIndex, i);
            VertexBefore v_maxBefore = tableMax[i];
            VertexBefore v_minBefore = tableMax[i];

            NextVertex v_nextVertext = null;
            if (p_vertex.searchingMax){
                if (v_maxBefore == null){
                    vertexList.add(new NextVertex(i, true, false));
                }else if( v_weight > v_maxBefore.throughput ){
                    //update best throughput
                    v_maxBefore.throughput =
                }
            }

            if(p_vertex.searchingMin){
                if(v_minBefore == null){
                    vertexList.add(new NextVertex(i, false, true));
                }
            }

            vertexList.add(v_nextVertext);
        }

    }

    private boolean checkForCycle(VertexBefore[] p_array, int p_vertex, int p_previous){
        while(true){
            if(p_previous == p_vertex) return true;
            VertexBefore v_before = p_array[p_previous];
            if(v_before == null) break;
            p_previous = v_before.vertexIndex;

        }
        return false;
    }



    public void findResults(AdjacencyMatrix matrix, int start, int end){
        int size = matrix.getSize();
        tableMax = new VertexBefore[size];
        tableMin = new VertexBefore[size];

        vertexList.add(new NextVertex(start, true, true));

        while(vertexList.size() > 0){
            NextVertex v_vertexCheck = vertexList.removeFirst();
            if(v_vertexCheck.searchingMin) checkForMinimumChange(v_vertexCheck.);
        }

    }



}
