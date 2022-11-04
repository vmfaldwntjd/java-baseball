package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private static void noticeStartGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }
    private static List<Integer> createComputerNumbers() {
        List<Integer> computerNumbers = new ArrayList<>();
        while (computerNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computerNumbers.contains(randomNumber)) {
                computerNumbers.add(randomNumber);
            }
        }
        return computerNumbers;
    }
    public static void main(String[] args) {
        noticeStartGame();
        List<Integer> computerNumbers = createComputerNumbers();
    }
}