import ContainerWithMostWater.ContainerWithMostWater1;
import ContainerWithMostWater.ContainerWithMostWater2;
import TrappingRainWater.TrappingRainWaterJava;

public class Main {
    public static void main(String[] args) {
        //Test the Container with most Water expected values is 49
        ContainerWithMostWater2 containerWithMostWater2 = new ContainerWithMostWater2();
        int answer = containerWithMostWater2.maxArea_BruteForce(containerWithMostWater2.getArrayElements());
        //System.out.println("The maximum area is: " + answer);

        ContainerWithMostWater1 containerWithMostWater1 = new ContainerWithMostWater1();
        int answer2 = containerWithMostWater1.maxArea_Optimal(containerWithMostWater1.arrayNumbers);
       // System.out.println("The maximum area is: " + answer2);

        int answer3 = containerWithMostWater2.maxArea_Optimal1(containerWithMostWater2.getArrayElements());
      //  System.out.println("The maximum area is: " + answer3);



       int elemets[] = {0,1,0,2,1,0,3,1,0,1,2};
        TrappingRainWaterJava trappingRainWaterJava = new TrappingRainWaterJava();
        int ans5 = trappingRainWaterJava.trapRainWater_Optimal(elemets);
        System.out.println("The maximum area is: " + ans5);


    }
}
