package onboarding;

import java.util.List;

class Problem1 {

    public static final int START_PAGE = 1;
    public static final int FINAl_PAGE = 400;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        return answer;
    }

    private static int findMaxScore(int a, int b) {
        return Math.max(a, b);
    }

    private static int sumScore(List<Integer> pageList, int index) {
        int pageNumber = pageList.get(index);
        int sum = 0;

        while (pageNumber > 1) {
            sum += pageNumber % 10;
            pageNumber /= 10;
        }

        return sum;
    }

    private static int mulitplyScore(List<Integer> pageList, int index) {
        int pageNumber = pageList.get(index);
        int multiplication = 1;

        while (pageNumber > 1) {
            multiplication *= pageNumber % 10;
            pageNumber /= 10;
        }
        return multiplication;
    }

}