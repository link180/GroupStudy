public class ContinueTest {
    public static void main(String[] args) {
        final int MAX = 11;
        int i = 0;

        while(i < MAX) {
            i++;

            // Q: 4가 왜 빠지나요 ?
            // A: continue 하는 시점이 5
            //    continue를 하면 다시 루프로 올라간다.
            //    다시 올라가서 ++ 을 하므로 6
            if(i == 5) {
                System.out.println("걸렸다!");
                // continue를 수행하면
                // 현재 진행하던 작업을 멈추고 다시
                // 루프(반복)의 최상위로 이동한다.
                continue;
            }

            System.out.println("i = " + (i - 1));
        }

        System.out.println("이건 어디서나 동작하는 녀석");
    }
}
