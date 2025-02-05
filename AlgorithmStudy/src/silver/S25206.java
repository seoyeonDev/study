package AlgorithmStudy.src.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S25206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        float sum = 0;
        float gpaSum = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());

            // 변수에 담기
            String subject = st.nextToken();
            float gpa = Float.parseFloat(st.nextToken());
            String grade = st.nextToken();

            // gpa 가 P 일 경우 계산에서 제외
            if (grade.charAt(0) !='P') gpaSum += gpa;
            // 과목명이 길 경우 return
            if (subject.isEmpty() || subject.length() > 50) return;

            // grade 의 앞 점수 확인
            switch (grade.charAt(0)){
                case 'A':
                    sum += gpa * (4 +chkDetailScore(grade.charAt(1)));
                    break;
                case 'B':
                    sum += gpa * (3 +chkDetailScore(grade.charAt(1)));
                    break;
                case 'C':
                    sum += gpa * (2 +chkDetailScore(grade.charAt(1)));
                    break;
                case 'D':
                    sum += gpa * (1 +chkDetailScore(grade.charAt(1)));
                    break;
                case 'P':
                    break;
                default:
                    sum += 0;
                    break;

            }

        }
        // 전공과목별 합 / 학점의 총합
        System.out.println(sum/gpaSum);

    }

    // +,0 추가 점수 확인.
    private static float chkDetailScore(char detail) {
        float rtn = switch (detail) {
            case '+' -> 0.5f;
            case '0' -> 0;
            default -> 0;
        };
        return rtn;
    }
}
