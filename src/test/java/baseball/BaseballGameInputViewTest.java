package baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseballGameInputViewTest{

    @Test
    @DisplayName("사용자가 숫자 입력을 잘못했을때")
    @Disabled
    void wrongInputNumber() {
        // given
        BaseballGameInputView inputView = BaseballGameInputView.getInstance();
        // when, then
        //assertThrows(IllegalArgumentException.class , () -> inputView.validate(1455));
    }
}