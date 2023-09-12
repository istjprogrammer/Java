class ControlTest { 
	public static void main(string[] args){
		/*
        1. 입력받은 값이 문자이면 "문자"라고 출력하고 그렇지 않으면 "기타"라고 출력
        int inputValue = System.in.read();
        
        if ((inputValue >= 'a' && inputValue <= 'z') || 
            (inputValue >= 'A' && inputValue <= 'Z')) {
            System.out.println("문자");
        } else {
            System.out.println("기타");
        }
        */

        /*
        2. 입력받은 값이 소문자이면 소문자라고 출력하고 대문자이면 대문자라고 출력하고
        숫자이면 숫자라고 출력하고 그 외에는 기타라고 출력
        int inputValue = System.in.read();

        if (inputValue >= 'a' && inputValue <= 'z') {
            System.out.println("소문자");
        } else if (inputValue >= 'A' && inputValue <= 'Z') {
            System.out.println("대문자");
        } else if (inputValue >= '0' && inputValue <= '9') {
            System.out.println("숫자");
        } else {
            System.out.println("기타");
        }
        */

        /*
        3. 간단한 전자계산기 (연산자에 q나 Q를 입력하면 종료)
        Scanner scanner = new Scanner(System.in);

        while (true) {
            char operator = scanner.next().charAt(0);
            
            if (operator == 'q' || operator == 'Q') {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("유효하지 않은 연산자입니다.");
                continue;
            }

            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue;
                    }
                    break;
            }

            System.out.println("결과: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
        */

        /*
        간단한 도움말 시스템을 만들자
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("도움말 시스템");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. for");
            System.out.println("0. 종료");
            System.out.print("번호선택: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("if (조건식) 문장;");
                    break;
                case 2:
                    System.out.println("switch (식) { case 값: 문장; break; }");
                    break;
                case 3:
                    System.out.println("while (조건식) 문장;");
                    break;
                case 4:
                    System.out.println("for (초기화; 조건식; 증감식) 문장;");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
            
            System.out.println();
        }
        */

        /*
        "." 입력이 될때까지 키보드 입력을 읽어서 입력된 공백의 갯수를 세고 그 합을 출력
        Scanner scanner = new Scanner(System.in);
        int totalSpaces = 0;

        System.out.println("문장을 입력하세요 (입력을 마치려면 Ctrl + Z(Windows) 또는 Ctrl + D(Mac)를 누르세요):");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int spacesInLine = countSpacesInString(line);
            totalSpaces += spacesInLine;
        }

        System.out.println("입력된 문장들에서 총 " + totalSpaces + "개의 공백이 있습니다.");
        */
    }
	}
}