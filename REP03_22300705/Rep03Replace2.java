package org.example;

import javax.swing.*;

public class Rep03Replace2 {
    public static void main(String[] args) {
        double kcal = 0.0;
        int choco = 0;

        String gender = JOptionPane.showInputDialog("성별을 입력하세요(남자는 M m, 여자는 W w): ");

        if(gender.equals("M") || gender.equals("m") || gender.equals("w") || gender.equals("W")) {
            String weight = JOptionPane.showInputDialog("몸무게 입력하세요: ");
            String height = JOptionPane.showInputDialog("키를 입력하세요: ");
            String age = JOptionPane.showInputDialog("나이를 입력하세요: ");

            int weightInt = Integer.parseInt(weight);
            int heightInt = Integer.parseInt(height);
            int ageInt = Integer.parseInt(age);

            if(gender.equals("M") || gender.equals("m")) {
                kcal = (10 * weightInt) + (6.25 * heightInt) - (5 * ageInt) + 5;
            }
            else {
                kcal = (10 * weightInt) + (6.25 * heightInt) - (5 * ageInt) - 161;
            }

            choco = (int)(kcal / 200);

            JOptionPane.showMessageDialog(null, "성별 " + gender +"\n"
                    + "몸무게: " + weight + "\n"
                    + "키: " + height + "\n"
                    + "나이: " + age);
            JOptionPane.showMessageDialog(null, "하루에 필요한 칼로리: "
            + String.format("%.1f", kcal) + "\n" + "하루에 필요한 초콜릿 수: " + choco + "개");
        }
        else {
            JOptionPane.showMessageDialog(null, "성별이 잘못 입력되었습니다.");
        }

    }
}
