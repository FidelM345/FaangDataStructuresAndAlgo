package ContainerWithMostWater;

public class ContainerWithMostWater1 {
    //11. Container With Most Water
    //LeetCode link - https://leetcode.com/problems/container-with-most-water/
  /* Question Description:  Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines
    are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with
    the x-axis forms a container, such that the container contains the most water.*/

    // I have declared my member variables as public. Because the default visibility modifier also known as package-private modifier
    //is only visible to classes within its own package. And since we will be accessing the member variables in the main class.
    //which is in a different package-class then we must declare them as public.
    public int[] arrayNumbers = {1, 8, 6, 2, 5, 4, 8, 3, 7};

    public int maxArea_BruteForce(int[] height) {
        int maximumArea = 0;

        for (int i = 0; i < height.length; i++) {

            for (int j = i + 1; j < height.length; j++) {

                int currentArea = (j - i) * Math.min(height[i], height[j]);

                maximumArea = Math.max(maximumArea, currentArea);
            }
        }
        return maximumArea;
    }

    public int maxArea_Optimal(int[] height) {
        int maximumArea = 0;
        int startPointer = 0;
        int endPointer = height.length - 1;

        for (int i = 0; i < height.length; i++) {
            int currentArea = Math.min(height[startPointer], height[endPointer]) * (endPointer - startPointer);
            maximumArea = Math.max(currentArea, maximumArea);

            if (height[startPointer] < height[endPointer]) {
                startPointer++;
            } else {
                endPointer--;
            }
        }
        return maximumArea;
    }
}
