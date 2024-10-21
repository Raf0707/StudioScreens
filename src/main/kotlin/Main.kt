import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application


@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Button(onClick = {
            text = "Hello, Desktop!"
        }) {
            Text(text)
        }
    }
}

@Composable
fun CourseScreen() {
    MaterialTheme {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            // Левый блок: Содержание
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.LightGray)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize()
                ) {
                    Text(
                        text = "Содержание",
                        style = MaterialTheme.typography.h5,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    // Прокручиваемый список для содержания
                    /*LazyColumn {
                        items(listOf("Глава 1", "Глава 2", "Глава 3", "Глава 4", "Глава 5", "Глава 6")) { chapter ->
                            Text(
                                text = chapter,
                                style = MaterialTheme.typography.body1,
                                modifier = Modifier.padding(vertical = 4.dp)
                            )
                        }
                    }*/
                }
            }

            // Центральный блок: Уроки
            Box(
                modifier = Modifier
                    .weight(3f)
                    .fillMaxHeight()
                    .padding(16.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Android Development",
                        style = MaterialTheme.typography.h4,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    Text(
                        text = "Андроид-разработка от нуля до профессионала",
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    val lessons = listOf(
                        "Раздел 1. Основы Kotlin",
                        "Раздел 2. Функциональное программирование",
                        "Раздел 3. Объектно-Ориентированное Программирование",
                        "Раздел 4. Обобщения",
                        "Раздел 5. Дополнительные возможности ООП",
                        "Раздел 6. Коллекции и последовательности",
                        "Раздел 7. Корутины",
                        "Раздел 8. Асинхронные потоки",


                        "Раздел 9. Введение в Jetpack Compose",
                        "Раздел 10. Модификаторы и визуальный интерфейс",
                        "Раздел 11. Контейнеры и компоновки",
                        "Раздел 12. Состояние компонентов",
                        "Раздел 13. Визуальные компоненты",
                        "Раздел 14. Ресурсы в Jetpack Compose",
                        "Раздел 15. Работа с изображениями",
                        "Раздел 16. Кастомные контейнеры компоновки",
                        "Раздел 17. ConstraintLayout",
                        "Раздел 18. Корутины и асинхронность",
                        "Раздел 19. Пагинация",
                        "Раздел 20. Анимация",
                        "Раздел 21. Рисование Canvas",
                        "Раздел 22. ViewModel",
                        "Раздел 23. Работа с базой данных",
                        "Раздел 24. Навигация",
                        "Раздел 25. Обработка жестов",
                        "Раздел 26. Доп возможности Compose"
                    )
                    // Прокручиваемый список для карточек уроков
                    LazyColumn(modifier = Modifier.fillMaxSize()) {
                        items(lessons.size) { sectionTitle ->
                            LessonCard(
                                sectionTitle = lessons[sectionTitle],
                                lessonCount = 12,
                                currentProgress = 0
                            )
                        }
                    }
                }
            }

            // Правый блок: Реклама
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.LightGray)
            ) {
                Text(
                    text = "Реклама",
                    modifier = Modifier.align(Alignment.Center),
                    style = MaterialTheme.typography.h6
                )
            }
        }
    }
}



@Composable
fun BasicKotlinLessonScreen() {
    MaterialTheme {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            // Левый блок: Содержание
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.LightGray)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize()
                ) {
                    Text(
                        text = "Содержание",
                        style = MaterialTheme.typography.h5,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    // Прокручиваемый список для содержания
                    /*LazyColumn {
                        items(listOf("Глава 1", "Глава 2", "Глава 3", "Глава 4", "Глава 5", "Глава 6")) { chapter ->
                            Text(
                                text = chapter,
                                style = MaterialTheme.typography.body1,
                                modifier = Modifier.padding(vertical = 4.dp)
                            )
                        }
                    }*/
                }
            }

            // Центральный блок: Уроки
            Box(
                modifier = Modifier
                    .weight(3f)
                    .fillMaxHeight()
                    .padding(16.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Раздел 1. Основы Kotlin",
                        style = MaterialTheme.typography.h4,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    Text(
                        text = "5 уроков",
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    val sections = listOf(
                        "Язык программирования Kotlin. Первая программа",
                        "Структура программы",
                        "Переменные",
                        "Типы данных",
                        "Консольный ввод и вывод",
                        "Операции с числами",
                        "Условные выражения",
                        "if...else",
                        "When",
                        "Циклы",
                        "Диапазоны",
                        "Массивы"
                    )

                    // Прокручиваемый список для карточек уроков
                    LazyColumn(modifier = Modifier.fillMaxSize()) {
                        items(sections.size) { sectionTitle ->
                            LessonCard(
                                sectionTitle = sections[sectionTitle],
                                lessonCount = 12,
                                currentProgress = 0
                            )
                        }
                    }
                }
            }

            // Правый блок: Реклама
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.LightGray)
            ) {
                Text(
                    text = "Реклама",
                    modifier = Modifier.align(Alignment.Center),
                    style = MaterialTheme.typography.h6
                )
            }
        }

    }
}

@Composable
fun CardLessonScreen() {
    MaterialTheme {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            // Левый блок: Содержание
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.LightGray)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize()
                ) {
                    Text(
                        text = "Содержание",
                        style = MaterialTheme.typography.h5,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )

                }
            }

            // Центральный блок: Уроки
            Box(
                modifier = Modifier
                    .weight(3f)
                    .fillMaxHeight()
                    .padding(16.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Язык программирования Kotlin. Первая программа",
                        style = MaterialTheme.typography.h4,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    Text(
                        text = "2 задания",
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    val sections = listOf(
                        "Видеоуроки",
                        "Конспект",
                        "Задания"
                    )

                    // Прокручиваемый список для карточек уроков
                    LazyColumn(modifier = Modifier.fillMaxSize()) {
                        items(sections.size) { sectionTitle ->
                            LessonViewCard(
                                sectionTitle = sections[sectionTitle]
                            )
                        }
                    }
                }
            }

            // Правый блок: Реклама
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.LightGray)
            ) {
                Text(
                    text = "Реклама",
                    modifier = Modifier.align(Alignment.Center),
                    style = MaterialTheme.typography.h6
                )
            }
        }

    }
}



@Composable
fun LessonCard(sectionTitle: String, lessonCount: Int, currentProgress: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(24.dp),
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = sectionTitle,
                style = MaterialTheme.typography.h6.copy(fontSize = 24.sp),
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "Прогресс: $currentProgress / $lessonCount",
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            LinearProgressIndicator(
                progress = currentProgress / lessonCount.toFloat(),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}


@Composable
fun LessonViewCard(sectionTitle: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = 4.dp
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Text(
                text = sectionTitle,
                style = MaterialTheme.typography.h6.copy(fontSize = 56.sp),
                modifier = Modifier.padding(top = 65.dp, bottom = 65.dp)
            )

        }
    }
}

@Composable
fun LessonViewCardMini(sectionTitle: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(24.dp),
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = sectionTitle,
                style = MaterialTheme.typography.h6.copy(fontSize = 24.sp),
                modifier = Modifier.padding(bottom = 8.dp)
            )

        }
    }
}


@Composable
fun VideoViewCard(sectionTitle: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = 4.dp
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Text(
                text = sectionTitle,
                style = MaterialTheme.typography.h6.copy(fontSize = 56.sp),
                modifier = Modifier.padding(bottom = 32.dp) // Убираем отступ сверху
            )

            // Кнопка Play
            Button(
                onClick = { /* Здесь добавьте логику для воспроизведения видео */ },
                modifier = Modifier
                    .size(100.dp) // Размер кнопки
                    .background(MaterialTheme.colors.primary) // Фоновый цвет кнопки
            ) {
                Text(text = "Play", fontSize = 24.sp) // Текст на кнопке
            }
        }
    }
}

@Composable
fun VideoLessonScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Заголовок
        Text(
            text = "Основы Kotlin. Первая программа",
            style = MaterialTheme.typography.h4.copy(fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(vertical = 16.dp),
            textAlign = TextAlign.Center
        )

        // Жирный текст
        Text(
            text = "Добро пожаловать на урок по основам Kotlin!",
            style = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        )

        // Кнопки
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            OutlinedButton(onClick = { /* Обработчик нажатия для кнопки Назад */ }) {
                Text(text = "< Назад")
            }

            OutlinedButton(onClick = { /* Обработчик нажатия для кнопки Конспект */ }) {
                Text(text = "Конспект >")
            }
        }

        // Видеоплеер
        Spacer(modifier = Modifier.height(16.dp)) // Отступ между кнопками и видео
        /*AndroidView(
            factory = { context ->
                // Создайте экземпляр VideoView или другой плеер для отображения видео
                VideoView(context).apply {
                    setVideoPath("https://rutube.ru/video/your_video_id") // Укажите путь к видео на Rutube
                    start() // Начать воспроизведение видео
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp) // Задайте высоту видеоплеера
        )*/
        VideoViewCard("Видеоплеер")

    }
}

@Composable
fun TasksLessonScreen() {
    MaterialTheme {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            // Центральный блок: Уроки
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(16.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Раздел 1. Основы Kotlin",
                        style = MaterialTheme.typography.h4,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    Text(
                        text = "13 задач",
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    val classWork = listOf(
                        "Привет, Мир!",
                        "Тепло ли на улице?",
                        "Что больше?",
                        "Что меньше?",
                        "Телефон",
                        "Книги",
                        "Напитки"
                    )

                    val homeWork = listOf(
                        "Карандаши",
                        "Тетрадки",
                        "Шоколадки"
                    )

                    val dopTask = listOf(
                        "Выходи гулять",
                        "Любимый предмет",
                        "Школьная столовая"
                    )



                    // Прокручиваемый список для карточек классной работы
                    LazyColumn(modifier = Modifier.fillMaxSize()) {

                        item {
                            // Заголовок для классной работы
                            Text(
                                text = "Классная работа",
                                style = MaterialTheme.typography.h5.copy(fontWeight = FontWeight.Bold), // Жирный текст
                                modifier = Modifier.padding(bottom = 8.dp)
                            )
                        }

                        items(classWork.size) { index ->
                            LessonViewCardMini(
                                sectionTitle = classWork[index]
                            )
                        }

                        // Заголовок для домашней работы
                        item { // Используем item для добавления заголовка
                            Text(
                                text = "Домашняя работа",
                                style = MaterialTheme.typography.h5.copy(fontWeight = FontWeight.Bold), // Жирный текст
                                modifier = Modifier.padding(vertical = 16.dp)
                            )
                        }

                        // Прокручиваемый список для карточек домашней работы
                        items(homeWork.size) { index ->
                            LessonViewCardMini(
                                sectionTitle = homeWork[index]
                            )
                        }

                        // Заголовок для дополнительных заданий
                        item { // Используем item для добавления заголовка
                            Text(
                                text = "Дополнительные задания",
                                style = MaterialTheme.typography.h5.copy(fontWeight = FontWeight.Bold), // Жирный текст
                                modifier = Modifier.padding(vertical = 16.dp)
                            )
                        }

                        // Прокручиваемый список для карточек дополнительных заданий
                        items(dopTask.size) { index ->
                            LessonViewCardMini(
                                sectionTitle = dopTask[index]
                            )
                        }
                    }
                }
            }
        }
    }
}


/*
@Preview()
@Composable
fun PreviewCourseScreen() {
    CourseScreen()
}
*/

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        //App()
        //CourseScreen()
        //BasicKotlinLessonScreen()
        //CardLessonScreen()
        //VideoLessonScreen()
        TasksLessonScreen()
    }
}
