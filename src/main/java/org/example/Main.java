package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  // 正規表現を使用して、ハイフン付きの国内携帯電話番号の有効性をチェックするプログラムを作成してください。
  // 有効な携帯電話番号の条件を自分で定義し、その条件に合致するかどうかを判定してください。

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 国内携帯電話番号の正規表現パターン
    String regex = "^0[789]0-\\d{4}-\\d{4}$";
    Pattern pattern = Pattern.compile(regex);

    System.out.println("ハイフン付きの国内携帯電話番号の有効性チェックプログラム");

    while (true) {
      System.out.print("携帯電話番号を入力してください (終了するには'終了'と入力): ");
      String input = scanner.nextLine();

      if (input.equals("終了")) {
        System.out.println("プログラムを終了します。");
        break;
      }

      Matcher matcher = pattern.matcher(input);

      if (matcher.matches()) {
        System.out.println("有効な携帯電話番号です。");
      } else {
        System.out.println("無効な携帯電話番号です。正しい形式: 090-1234-5678");
      }
    }

    scanner.close();
  }
}
