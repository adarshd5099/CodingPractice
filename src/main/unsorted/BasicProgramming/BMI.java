package main.unsorted.BasicProgramming;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <a href="https://www.codechef.com/problems/BMI">https://www.codechef.com/problems/BMI</a>
 * You are given the height H (in metres) and mass M (in kilograms) of Chef. The Body Mass Index (BMI) of a person is computed as MH2
 * Report the category into which Chef falls, based on his BMI:
 * <p>
 * Category 1: Underweight if BMI ≤18
 * <p>
 * Category 2: Normal weight if BMI ∈{19
 * , 20,…, 24}
 * Category 3: Overweight if BMI ∈{25
 * , 26,…, 29}
 * Category 4: Obesity if BMI ≥30
 */
class BMI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int bmi = arr[0] / (arr[1] * arr[1]), result;
            if (bmi <= 18) result = 1;
            else if (bmi >= 19 && bmi <= 24) result = 2;
            else if (bmi >= 25 && bmi <= 29) result = 3;
            else result = 4;
            System.out.println(result);
        }
    }
}
