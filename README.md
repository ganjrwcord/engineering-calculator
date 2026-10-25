# Инженерный калькулятор для Android

Android-приложение с инженерным калькулятором на основе WebView. Исходный интерфейс находится в index.html, Android-версия загружает его из android/app/src/main/assets/index.html.

## Получить APK
1. Откройте вкладку Actions.
2. Выберите workflow Build Android APK и дождитесь успешного завершения.
3. Откройте запуск и скачайте artifact engineering-calculator-debug-apk.
4. Распакуйте архив — внутри находится app-debug.apk.

Workflow запускается при push в main/master и вручную через workflow_dispatch.

## Функции
- sin, cos, tan и обратные тригонометрические функции
- log, ln, квадратный корень и степени
- факториал, проценты, π, e, Ans
- режимы DEG/RAD, скобки и базовые арифметические операции
