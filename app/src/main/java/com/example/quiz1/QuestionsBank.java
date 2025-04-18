package com.example.quiz1;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> breadQuestions(){
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Что такое объект в объектно-ориентированном программировании?",
                "Набор функций", "Экземпляр класса, содержащий данные и методы", "Структура данных", "Ошибка в коде",
                "Экземпляр класса, содержащий данные и методы", "");

        final QuestionsList question2 = new QuestionsList("Какой из следующих принципов ООП описывает возможность создания новых классов на основе существующих?",
                "Инкапсуляция", "Полиморфизм", "Наследование", "Абстракция",
                "Наследование", "");

        final QuestionsList question3 = new QuestionsList("Что такое полиморфизм в ООП?",
                "Способ создания новых классов", "Возможность объектов разных классов обрабатывать данные одинаково", "Скрытие данных", "Наследование методов",
                "Возможность объектов разных классов обрабатывать данные одинаково", "");

        final QuestionsList question4 = new QuestionsList("Что такое абстрактный класс?",
                "Класс, который нельзя инстанцировать", "Класс с полными методами", "Класс, который всегда наследуется", "Класс с приватными свойствами",
                "Класс, который нельзя инстанцировать", "");

        final QuestionsList question5 = new QuestionsList("Какой из следующих модификаторов доступа делает член класса доступным только внутри этого класса?",
                "public", "internal", "protected", "private",
                "private", "");

        final QuestionsList question6 = new QuestionsList("Какой метод используется для создания объекта в Java?",
                "new", "create", "instantiate", "build",
                "new", "");

        final QuestionsList question7 = new QuestionsList("Что такое интерфейс в ООП?",
                "Реализация метода", "Конкретный класс", "Набор абстрактных методов", "Способ инкапсуляции",
                "Набор абстрактных методов", "");

        final QuestionsList question8 = new QuestionsList("Что такое композиция?",
                "Способ наследования", "Связь между классами, где один класс является частью другого", "Полиморфизм", "Создание интерфейсов",
                "Связь между классами, где один класс является частью другого", "");

        final QuestionsList question9 = new QuestionsList("Какой из следующих принципов не относится к ООП?",
                "Инкапсуляция", "Наследование", "Полиморфизм", "Синхронизация",
                "Синхронизация", "");

        final QuestionsList question10 = new QuestionsList("Какой метод вызывается при создании объекта класса в Python?",
                "init", "create", "new", "start",
                "init", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        return questionsList;
    }

    private static List<QuestionsList> PLQuestions(){
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Что такое реляционная база данных?",
                "База данных, основанная на иерархической модели", "База данных, использующая таблицы для хранения данных", "База данных, использующая графы", "База данных без структуры",
                "База данных, использующая таблицы для хранения данных", "");

        final QuestionsList question2 = new QuestionsList("Какой язык используется для работы с реляционными базами данных?",
                "HTML", "Python", "JavaScript", "SQL",
                "SQL", "");

        final QuestionsList question3 = new QuestionsList("Что такое первичный ключ?",
                "Поле, которое может быть пустым", "Поле, которое может содержать дубликаты", "Поле, уникально идентифицирующее запись", "Поле, не связанное с другими таблицами",
                "Поле, уникально идентифицирующее запись", "");

        final QuestionsList question4 = new QuestionsList("Что такое нормализация базы данных?",
                "Процесс удаления дубликатов", "Процесс оптимизации базы данных", "Процесс структурирования данных для уменьшения избыточности", "Процесс создания резервной копии",
                "Процесс структурирования данных для уменьшения избыточности", "");

        final QuestionsList question5 = new QuestionsList("Какой из следующих типов данных не является стандартным в SQL?",
                "INT", "VARCHAR", "DATE", "OBJECT",
                "OBJECT", "");

        final QuestionsList question6 = new QuestionsList("Что такое внешние ключи?",
                "Поля, которые могут содержать дубликаты", "Поля, которые ссылаются на первичный ключ другой таблицы", "Поля, которые могут быть пустыми", "Поля, которые не могут быть изменены",
                "Поля, которые ссылаются на первичный ключ другой таблицы", "");

        final QuestionsList question7 = new QuestionsList("Какой оператор используется для удаления данных из таблицы?",
                "SELECT", "DELETE", "REMOVE", "DROP",
                "DELETE", "");

        final QuestionsList question8 = new QuestionsList("Какой оператор используется для обновления данных в таблице?",
                "UPDATE", "MODIFY", "CHANGE", "EDIT",
                "UPDATE", "");

        final QuestionsList question9 = new QuestionsList("Что такое транзакция в контексте баз данных?",
                "Операция, которая может быть выполнена частично", "Процесс удаления данных", "Процесс резервного копирования данных", "Набор операций, которые выполняются как единое целое",
                "Набор операций, которые выполняются как единое целое", "");

        final QuestionsList question10 = new QuestionsList("Что такое индекс в базе данных?",
                "Тип базы данных", "Способ хранения данных", "Структура, ускоряющая поиск данных", "Метод резервного копирования",
                "Структура, ускоряющая поиск данных", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        return questionsList;
    }

    private static List<QuestionsList> carQuestions(){
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Что такое HTML?",
                "Язык программирования", "Фреймворк для разработки", "Протокол передачи данных", "Язык разметки для создания веб-страниц",
                "Язык разметки для создания веб-страниц", "");

        final QuestionsList question2 = new QuestionsList("Какой тег используется для создания гиперссылки в HTML?",
                "<link>", "<href>", "<a>", "<url>",
                "<a>", "");

        final QuestionsList question3 = new QuestionsList("Что такое CSS?",
                "Язык программирования", "Язык для стилизации веб-страниц", "Протокол передачи данных", "Фреймворк для разработки",
                "Язык для стилизации веб-страниц", "");

        final QuestionsList question4 = new QuestionsList("Какой метод HTTP используется для получения данных?",
                "POST", "GET", "PUT", "DELETE",
                "GET", "");

        final QuestionsList question5 = new QuestionsList("Что такое JavaScript?",
                "Язык программирования для создания интерактивности на веб-страницах", "Язык разметки", "Язык стилей", "Протокол передачи данных",
                "Язык программирования для создания интерактивности на веб-страницах", "");

        final QuestionsList question6 = new QuestionsList("Что такое AJAX?",
                "Метод шифрования данных", "Язык программирования", "Протокол передачи данных", "Технология для асинхронной загрузки данных на веб-странице",
                "Технология для асинхронной загрузки данных на веб-странице", "");

        final QuestionsList question7 = new QuestionsList("Какой атрибут используется для указания адреса ссылки в HTML?",
                "link", "url", "src", "href",
                "href", "");

        final QuestionsList question8 = new QuestionsList("Что такое REST?",
                "Архитектурный стиль для создания веб-сервисов", "Метод шифрования данных", "Язык программирования", "Протокол передачи данных",
                "Архитектурный стиль для создания веб-сервисов", "");

        final QuestionsList question9 = new QuestionsList("Что такое Bootstrap?",
                "Протокол передачи данных", "Язык программирования", "CSS-фреймворк для разработки адаптивных веб-сайтов", "Метод шифрования данных",
                "CSS-фреймворк для разработки адаптивных веб-сайтов", "");

        final QuestionsList question10 = new QuestionsList("Что такое DOM?",
                "Модель документа, представляющая структуру веб-страницы", "Протокол передачи данных", "Язык программирования", "Фреймворк для разработки",
                "Модель документа, представляющая структуру веб-страницы", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        return questionsList;
    }

    private static List<QuestionsList> favQuestions(){
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Что такое IP-адрес?",
                "Уникальный идентификатор устройства в сети", "Метод шифрования данных", "Протокол передачи данных", "Тип базы данных",
                "Уникальный идентификатор устройства в сети", "");

        final QuestionsList question2 = new QuestionsList("Что такое DNS?",
                "Метод шифрования данных", "Протокол передачи данных", "Система доменных имен, переводящая имена в IP-адреса", "Устройство для хранения данных",
                "Система доменных имен, переводящая имена в IP-адреса", "");

        final QuestionsList question3 = new QuestionsList("Какова основная функция маршрутизатора?",
                "Хранение данных", "Направление трафика между сетями", "Шифрование данных", "Создание резервных копий",
                "Направление трафика между сетями", "");

        final QuestionsList question4 = new QuestionsList("Что такое протокол TCP/IP?",
                "Протокол для передачи данных в сети", "Язык программирования", "Метод резервного копирования", "Устройство для защиты сети",
                "Протокол для передачи данных в сети", "");

        final QuestionsList question5 = new QuestionsList("Что такое NAT?",
                "Метод шифрования данных", "Протокол передачи данных", "Тип базы данных", "Преобразование сетевых адресов",
                "Преобразование сетевых адресов", "");

        final QuestionsList question6 = new QuestionsList("Что такое VPN?",
                "Виртуальная частная сеть, обеспечивающая защищенное соединение", "Метод резервного копирования данных", "Протокол передачи данных", "Метод шифрования данных",
                "Виртуальная частная сеть, обеспечивающая защищенное соединение", "");

        final QuestionsList question7 = new QuestionsList("Что такое DHCP?",
                "Метод шифрования данных", "Программное обеспечение для защиты данных", "Протокол для динамического назначения IP-адресов", "Метод шифрования данных",
                "Протокол для динамического назначения IP-адресов", "");

        final QuestionsList question8 = new QuestionsList("Что такое firewall?",
                "Устройство для хранения данных", "Система защиты сети от несанкционированного доступа", "Метод резервного копирования", "Протокол передачи данных",
                "Система защиты сети от несанкционированного доступа", "");

        final QuestionsList question9 = new QuestionsList("Что такое SSL?",
                "Протокол для шифрования данных в интернете", "Метод резервного копирования", "Протокол для передачи видео", "Язык программирования",
                "Протокол для шифрования данных в интернете", "");

        final QuestionsList question10 = new QuestionsList("Что такое сетевой мост?",
                "Устройство для шифрования данных", "Устройство, соединяющее две сети", "Протокол передачи данных", "Протокол для передачи видео",
                "Устройство, соединяющее две сети", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        return questionsList;
    }
    private static List<QuestionsList> cybersecurityQuestions() {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Что такое фишинг?",
                "Метод шифрования данных", "Атака, направленная на получение конфиденциальной информации", "Программа для анализа текста", "Система управления базами данных",
                "Атака, направленная на получение конфиденциальной информации", "");

        final QuestionsList question2 = new QuestionsList("Что такое межсетевой экран (firewall)?",
                "Устройство для хранения данных", "Система защиты сети от несанкционированного доступа", "Метод резервного копирования", "Протокол передачи данных",
                "Система защиты сети от несанкционированного доступа", "");

        final QuestionsList question3 = new QuestionsList("Что такое DDoS-атака?",
                "Метод шифрования данных", "Атака, направленная на перегрузку сервера множеством запросов", "Программа для анализа текста", "Система управления базами данных",
                "Атака, направленная на перегрузку сервера множеством запросов", "");

        final QuestionsList question4 = new QuestionsList("Что такое шифрование данных?",
                "Процесс преобразования данных в защищенный формат", "Метод резервного копирования", "Программа для анализа текста", "Система управления базами данных",
                "Процесс преобразования данных в защищенный формат", "");

        final QuestionsList question5 = new QuestionsList("Что такое двухфакторная аутентификация?",
                "Метод шифрования данных", "Дополнительный уровень защиты при входе в систему", "Программа для анализа текста", "Система управления базами данных",
                "Дополнительный уровень защиты при входе в систему", "");

        final QuestionsList question6 = new QuestionsList("Что такое вредоносное ПО?",
                "Программа для анализа текста", "Программное обеспечение, предназначенное для причинения вреда", "Метод шифрования данных", "Система управления базами данных",
                "Программное обеспечение, предназначенное для причинения вреда", "");

        final QuestionsList question7 = new QuestionsList("Что такое бэкдор?",
                "Метод шифрования данных", "Скрытый метод получения доступа к системе", "Программа для анализа текста", "Система управления базами данных",
                "Скрытый метод получения доступа к системе", "");

        final QuestionsList question8 = new QuestionsList("Что такое социальная инженерия?",
                "Метод шифрования данных", "Манипуляция людьми для получения конфиденциальной информации", "Программа для анализа текста", "Система управления базами данных",
                "Манипуляция людьми для получения конфиденциальной информации", "");

        final QuestionsList question9 = new QuestionsList("Что такое сертификат SSL/TLS?",
                "Метод шифрования данных", "Сертификат для безопасной передачи данных в интернете", "Программа для анализа текста", "Система управления базами данных",
                "Сертификат для безопасной передачи данных в интернете", "");

        final QuestionsList question10 = new QuestionsList("Что такое Zero Trust Security?",
                "Метод шифрования данных", "Модель безопасности, предполагающая недоверие ко всем участникам системы", "Программа для анализа текста", "Система управления базами данных",
                "Модель безопасности, предполагающая недоверие ко всем участникам системы", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        return questionsList;
    }
    private static List<QuestionsList> aiMlQuestions() {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Что такое искусственный интеллект?",
                "Технология создания систем, способных выполнять задачи, требующие человеческого интеллекта", "Метод шифрования данных", "Программа для анализа текста", "Система управления базами данных",
                "Технология создания систем, способных выполнять задачи, требующие человеческого интеллекта", "");

        final QuestionsList question2 = new QuestionsList("Что такое машинное обучение?",
                "Метод защиты данных", "Процесс обучения моделей на основе данных", "Программный код для анализа видео", "Алгоритм сжатия данных",
                "Процесс обучения моделей на основе данных", "");

        final QuestionsList question3 = new QuestionsList("Какой алгоритм используется для классификации данных?",
                "Линейная регрессия", "Градиентный спуск", "Дерево решений", "Метод главных компонент",
                "Дерево решений", "");

        final QuestionsList question4 = new QuestionsList("Что такое нейронная сеть?",
                "Модель, имитирующая работу биологических нейронов", "Система управления базами данных", "Программа для анализа текста", "Метод шифрования данных",
                "Модель, имитирующая работу биологических нейронов", "");

        final QuestionsList question5 = new QuestionsList("Что такое переобучение модели?",
                "Ошибка в программировании", "Ситуация, когда модель слишком хорошо учится на тренировочных данных", "Метод защиты данных", "Процесс оптимизации гиперпараметров",
                "Ситуация, когда модель слишком хорошо учится на тренировочных данных", "");

        final QuestionsList question6 = new QuestionsList("Что такое кросс-валидация?",
                "Метод оценки качества модели", "Программа для анализа текста", "Система управления базами данных", "Метод шифрования данных",
                "Метод оценки качества модели", "");

        final QuestionsList question7 = new QuestionsList("Что такое градиентный спуск?",
                "Метод шифрования данных", "Алгоритм оптимизации для минимизации функции потерь", "Программа для анализа видео", "Система управления базами данных",
                "Алгоритм оптимизации для минимизации функции потерь", "");

        final QuestionsList question8 = new QuestionsList("Что такое обучающая выборка?",
                "Набор данных, используемый для тестирования модели", "Набор данных, используемый для обучения модели", "Метод шифрования данных", "Программа для анализа текста",
                "Набор данных, используемый для обучения модели", "");

        final QuestionsList question9 = new QuestionsList("Что такое ансамблевые методы?",
                "Метод шифрования данных", "Комбинация нескольких моделей для повышения точности", "Программа для анализа видео", "Система управления базами данных",
                "Комбинация нескольких моделей для повышения точности", "");

        final QuestionsList question10 = new QuestionsList("Что такое глубокое обучение?",
                "Метод шифрования данных", "Подраздел машинного обучения, использующий многослойные нейронные сети", "Программа для анализа текста", "Система управления базами данных",
                "Подраздел машинного обучения, использующий многослойные нейронные сети", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return questionsList;
    }
    public static List<QuestionsList> getQuestions (String selectedTopicName){
        switch (selectedTopicName){
//            ООП
            case "ООП" : return breadQuestions();
//            БД
            case "Базы данных" : return PLQuestions();
//            ВЕБ
            case "Веб-программирование" : return carQuestions();
            case "Сетевые технологии" : return favQuestions();
            case "Искусственный интеллект" : return aiMlQuestions();
            default: return cybersecurityQuestions();
        }
    }
}
