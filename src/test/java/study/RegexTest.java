package study;

import java.util.regex.Pattern;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class RegexTest {

    @Test
    void test1() {
        Pattern pattern = Pattern.compile("ab.");
        assertThat(pattern.matcher("abc").matches()).isTrue();
        assertThat(pattern.matcher("ab").matches()).isFalse();

        pattern=Pattern.compile("ab\\s\\S");
        assertThat(pattern.matcher("ab  ").matches()).isFalse();
        assertThat(pattern.matcher("ab c").matches()).isTrue();
    }
    @Test
    void test2() {
        String day = "Day by day";
        assertThat(day.replaceAll("[Dd]ay", "!")).isEqualTo("! by !");
        assertThat(day.replaceAll("^[Dd]ay", "!")).isEqualTo("! by day");
        assertThat(day.replaceAll("[Dd]ay$", "!")).isEqualTo("Day by !");
    }
    @Test
    void test3() {
        String result = "this island is beautiful";
        assertThat(result.replaceAll("\\bis\\b", "!")).isEqualTo("this island ! beautiful");
    }
    @Test
    void test4() {
        Pattern pattern = Pattern.compile("[a-z1-5]");
        assertThat(pattern.matcher("a1").matches()).isFalse();
        assertThat(pattern.matcher("a").matches()).isTrue();
    }
    @Test
    void test5() {
        Pattern pattern = Pattern.compile("(?i)a");
        assertThat(pattern.matcher("A").matches()).isTrue();
    }
    @Test
    void test6() {
        Pattern pattern = Pattern.compile("a*\\d*");
        assertThat(pattern.matcher("aaa99").matches()).as("0회 이상 반복").isTrue();
        assertThat(pattern.matcher("").matches()).as("0회 이상 반복").isTrue();

        pattern = Pattern.compile("a+\\d+");
        assertThat(pattern.matcher("aaa99").matches()).as("1회이상반복").isTrue();
        assertThat(pattern.matcher("").matches()).as("1회이상반복").isFalse();

        pattern = Pattern.compile("a?\\d?");
        assertThat(pattern.matcher("aa99").matches()).as("0 또는 1회만").isFalse();
        assertThat(pattern.matcher("").matches()).as("0 또는 1회만").isTrue();
    }
    @Test
    public void test7() {
        String pattern = "(\\w)(\\s+)([\\w])";
        System.out.println("Hello     World".replaceAll(pattern, "$1-$3"));
    }
    @Test
    void test8() {
        Pattern pattern = Pattern.compile("\\d{6}-[1-4]\\d{6}");
        assertThat(pattern.matcher("900101-1223455").matches()).isTrue();
        assertThat(pattern.matcher("900101-5223455").matches()).isFalse();
        assertThat(pattern.matcher("900101-122345").matches()).isFalse();
        assertThat(pattern.matcher("90010-1223455").matches()).isFalse();
    }
    @Test
    void test9() {
        String result;
        result = "The cat sat on the mat.".replaceAll("c.+t", "*");
        System.out.println(result);

        result = "The cat sat on the mat.".replaceAll("c.+?t", "*");
        System.out.println(result);
    }
    @Test
    @DisplayName("문자열식이 올바른 패턴인지")
    void test10() {
        //(123 - ) 이 패턴을 1회이상 반복후 끝나는 문자열이 숫자가 되도록
        Pattern pattern = Pattern.compile("(\\d+\\s[\\-+*/]\\s)+\\d+$");
        assertThat(pattern.matcher("123 - 123 - 123").matches()).isTrue();
    }
    @Test
    @DisplayName("0은 되지만 01 은 안된다")
    void test11() {
        Pattern pattern = Pattern.compile("^0[0-9]+");
        assertThat(pattern.matcher("01").matches()).isTrue();
    }


}
