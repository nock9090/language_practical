package test;

public class test {
	public static void main(String[] args) {
		final double TAX_NOMAL = 0.1001;
		int apple = 100;
		int peach = 120;
		System.out.println(TAX_NOMAL);
		
//		四則演算
//		足す　→　+
//		引く　→　-
//		掛ける　→　*
//		割る　→　/
//		あまり　→　%
		int result = 0;
		
//		キャスト　→　型変換
//		変数の前に(型)をつけるとできる
		result = (int)((double)apple * TAX_NOMAL);
		int tax_result = (int)1.56;
		System.out.println(tax_result);
		double count = 0;
		
		result = apple + peach;
		
		result = 0;
		System.out.println(result);
		result += apple;
		System.out.println(result);
		result += peach;
		System.out.println(result);
		result -= peach;
		System.out.println(result);
		
		count = result * (1+TAX_NOMAL);
		System.out.println(count);
		
		result *= 1+TAX_NOMAL;
		System.out.println(result);
		
//		文字列連結
//		+で数値
		String stringResult;
		stringResult = "今日の合計金額は"+count+"円です。";
		System.out.println(stringResult);
		
		String first = "今日は";
		String therd = "円使いました。";
		System.out.println(first+count+therd);
		
		System.out.println(result);
		int daise = ((int) (Math.random() * 100) )% 6 + 1;
		System.out.println(daise);
	}
}
