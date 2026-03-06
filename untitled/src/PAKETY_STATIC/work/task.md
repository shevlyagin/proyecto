## Задача 1

**Условие:**
Создайте класс `Movie` в пакете `cinema`.

Атрибуты объекта: title, genre, director, duration, price.
Атрибуты класса (static): totalMovies, totalAudience.

Методы:
- Конструктор (принимает все атрибуты объекта, увеличивает totalMovies)
- getters/setters
- addAudience(int people) — увеличивает totalAudience
- static getTotalMovies() — возвращает общее число фильмов
- static getTotalAudience() — возвращает общее число зрителей
- toString()

В Main: создайте 3 фильма, добавьте зрителей, выведите статистику.
