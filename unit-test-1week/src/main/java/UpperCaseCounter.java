public class UpperCaseCounter {
    public int getNumberOfUpperCaseCharactersInString(String str) {
        if (str == null) {//만약 입력값이 NULL이라면 0을 리턴한다..
            return 0;
        }

        int numberOfUpperCaseChars = 0;
        for (int index=0; index < str.length(); index++) {
            char charAt = str.charAt(index);
            if (charAt >= 'A' && charAt <= 'Z') {
                numberOfUpperCaseChars++;
            }
        }
        return numberOfUpperCaseChars;
    }
}
