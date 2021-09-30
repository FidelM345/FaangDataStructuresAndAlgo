package TrappingRainWater;

import ContainerWithMostWater.ContainerWithMostWater1;

public class TrappingRainWaterJava {

    //42. Trapping Rain Water
    //LeetCode link - https://leetcode.com/problems/trapping-rain-water/
/*
    Question
    Given n non-negative integers representing an elevation map where the width
    of each bar is 1, compute how much water it can trap after raining.*/
    public int trapRainWater_BruteForce(int[] height) {

        int totalArea = 0;
        int maxLeft = 0;
        int maxRight = 0;

        for (int pointer1 = 0; pointer1 < height.length; pointer1++) {
            int currentHeight = height[pointer1];

            for (int pointer2 = pointer1 + 1; pointer2 < height.length; pointer2++) {
                maxRight = Math.max(maxRight, height[pointer2]);

            }

            if (pointer1 > 0) {
                maxLeft = Math.max(maxLeft, height[pointer1 - 1]);
            }

            //calculate the volume of water above each bar (the volume of water above each position of pointer1)
            int tempArea = Math.min(maxLeft, maxRight) - currentHeight;

            System.out.println("The pointer is at " + pointer1 + " maxLeft: " + maxLeft + " maxRight: " + maxRight);
            System.out.println("Area of water at each iteration: " + tempArea);

            //reset the value of the maximumRight value in the array.
            maxRight = 0;

            if (tempArea > 0) {
                //only add to the total area when the value of tempArea is greater than 0. The area of water cannot be
                //-ve integer.
                totalArea += tempArea;
            }
        }
        return totalArea;
    }

    public int trapRainWater_Optimal(int[] height) {
        int maxLeft = 0;
        int maxRight = 0;
        int totalArea = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        while (leftPointer < rightPointer) {

            if (height[leftPointer] <= height[rightPointer]) {

                //the leftPointer value is less than the rightPointer value hence operate on the leftr side of the array.

                if (maxLeft > height[leftPointer]) {

                    totalArea += maxLeft - height[leftPointer];

                } else {
                    maxLeft = height[leftPointer];

                }
                leftPointer++;
            } else {

                //the rightPointer value is less than the leftPointer value hence operate on the right side of the array.
                if (maxRight > height[rightPointer]) {

                    totalArea += maxRight - height[rightPointer];

                } else {
                    maxRight = height[rightPointer];
                }

                rightPointer--;

            }


        }

        return totalArea;
    }

}
