package AlgorithmStudy.src.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class S1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();

        // 초기값 입력
        for (int i = 0; i < testCases; i++) {
            String a = br.readLine();
            if (!list.contains(a)) {
                list.add(a);
            }
        }

        // 순서 정렬 1. 글자수 2. 같은 글자 오름차순
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                list.sort(Comparator.comparingInt(String::length));
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
