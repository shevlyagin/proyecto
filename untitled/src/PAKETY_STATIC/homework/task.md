## ДЗ 1: Магазин

Создайте пакет `almacen` с классом `Product`:
- Атрибуты: code (int), description (String), price (double)
- Конструктор с параметрами
- Метод `calculateSurcharge()` — возвращает 5% от цены
- Метод `calculateVAT()` — возвращает 21% от цены
- Метод `calculateFinalPrice()` — цена + наценка + НДС
- Метод `showProduct()` — выводит всю информацию о товаре

В Main создайте myProduct (code: 1, description: "Lamp", price: 100€) и вызовите showProduct().

**Ожидаемый вывод:**
```
Product: Lamp (code: 1)
Base price: 100.00€
Surcharge (5%): 5.00€
VAT (21%): 21.00€
Final price: 126.00€
```

## ДЗ 2: Кинотеатр — полная версия

Расширьте класс Movie из классной работы:
- Добавьте атрибут `national` (boolean) — отечественный ли фильм
- Добавьте static-счётчик `nationalMovies` (увеличивается в конструкторе, если national == true)
- Добавьте static-счётчик фильмов по жанрам: используйте подход, который считаешь правильным (подсказка: можно завести отдельные счётчики `comedyCount`, `dramaCount`... или подумать о другом способе)
- Добавьте static-методы: `getNationalMovies()`, `getGenreCount(String genre)`

В Main: создайте 5 фильмов разных жанров, из них 2 отечественных. Выведите всю статистику.

---