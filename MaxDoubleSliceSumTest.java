import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDoubleSliceSumTest {
    @Test
    void solution() {
        int[] A = {3,2,6,-1,4,5,-1,2};
        assertEquals(17,MaxDoubleSliceSum.solution(A));

        int[] B = {1,1,1};
        assertEquals(0,MaxDoubleSliceSum.solution(B));

        int[] C = {-1,-1,-100,-45,-2,-222,-65,-1112,-56,-5,-8,-7,-1224};
        assertEquals(0,MaxDoubleSliceSum.solution(C));

        int[] D = {-30,-25,-20,-15,-10,-5,0,5,10,15,20,25,30};
        assertEquals(75,MaxDoubleSliceSum.solution(D));

        int[] E = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(42,MaxDoubleSliceSum.solution(E));

        int[] F = new int[10000];
        for(int i = 0; i<F.length; i++){
            F[i] = i;
        }
        assertEquals(42,MaxDoubleSliceSum.solution(E));

    }
}