# Тестовое задание от Tele2

# Используемые технологии в проекте:

### Java 21 - основной язык программирования.
### Spring Boot 3.2.3 - основной фреймворк.
### Gradle 8.6 - система сборки проекта.
### Spring MVC - основной WEB API. Он был выбран, поскольку не ожидается высокой нагрузки на приложение, соответственно, наш основной поток не будет блокироваться. Также наше API не требует доступа к базе данных или другим сервисам, в которых может понадобиться асинхронный подход.


# О проекте

### Приложенте представляет собой RESTful API, которое предоставляет текущее время сервера с точностью до секунд и указанием таймзоны в формате JSON:
```json
{
"timezone": "timezone",
"localTime": "localTime"
}
```

# Тесты

### JUnit 5 - фреймворк для модульного тестирования.
