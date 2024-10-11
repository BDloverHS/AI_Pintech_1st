package Quiz;

public class Ex06 {
    public static void main(String[] args) {
        // Ex02 경섭님 코드
        int studentOfCount = 40;
        int roomNum = 0;
        int studentRealNumber = 0;
        int roomLimit = 4;

        for (int i = 0; i < studentOfCount; i++) {
            if (studentRealNumber % roomLimit == 0 && studentRealNumber != 0)
            {
                roomNum++;
            }
            System.out.println("학생" + (studentRealNumber + 1) + ", " + "방번호 " + roomNum + "번");
            studentRealNumber++;
        }


        // Ex02 내 코드 - i = 0으로 고침
        int room = 0;

        for (int i=0; i < 40; i++) {
            System.out.println("학생" + (i+1) + ", 방 번호 : " + room + "번");
            if ((i+1) % 4 == 0 && i != 0) {
                room++;
                System.out.println(" ");
            }
        }


        // Ex05 경섭님 코드
        for (int i = 1; i < 10; i++)
        {
            for (int j = 1; j < 10; j++)
            {
                if (i > j)
                {
                    continue;
                }
                System.out.println("구구단을 외자! " + i + "단. " + i + " x " + j + " = " + (i * j));
            }
            System.out.println("-----------------------------------");
        }
    }
}
