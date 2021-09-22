package ContainerWithMostWater

import java.util.ArrayList
import kotlin.math.max
import kotlin.math.min

class ContainerWithMostWater2 {
    //11. Container With Most Water
    //LeetCode link - https://leetcode.com/problems/container-with-most-water/
    /* Question Description Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines
      are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
      Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.*/

    val arrayElements = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)

    fun maxArea_BruteForce(height: IntArray): Int {
        var maximumArea = 0
        for (i in height.indices) {

            for (j in i + 1 until height.size) {
                val currentArea = (j - i) * Math.min(height[i], height[j])
                maximumArea = Math.max(maximumArea, currentArea)
            }
        }
        return maximumArea
    }

    fun maxArea_Optimal1(height: IntArray): Int {
        var maximumArea: Int = 0;

        var pointer1 = 0;
        var pointer2 = height.size - 1

        while (pointer1 < pointer2) {

            var currentArea = minOf(height[pointer1], height[pointer2]) * (pointer2 - pointer1)
            maximumArea = maxOf(currentArea, maximumArea)

            if (height[pointer1] < height[pointer2]) {
                pointer1++
            } else {
                pointer2--
            }

        }

        return maximumArea;
    }


}