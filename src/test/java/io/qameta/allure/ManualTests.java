package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Layer("web")
@Owner("NeverFlyDog")
@Feature("Authorization")
public class ManualTests {

    @Test
    @Manual
    @Microservice("Auth")
    @Story("Authorization via GitHub")
    @Tags({@Tag("web"), @Tag("critical")})
    @DisplayName("Authorization with GitHub account")
    void authTest() {
        step("Открываем главную страницу");
        step("Авторизуемся как пользователь Test Testov", () -> {
            step("Вводим логин test_testov");
            step("Вводим пароль test1234");
            step("Нажимаем кнопку \"Войти\"");
        });
        step("Проверяем переход на страницу профиля");
    }
}
