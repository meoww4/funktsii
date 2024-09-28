import kotlin.random.Random

fun main() {

    println("Игра Камень-Ножницы-Бумага")
    println("1 - это камень, 2 - ножницы, 3 - бумага.")
    println("Введите цифру: ")

    val number_user = readLine()?.toIntOrNull()


    if (number_user == null || number_user !in 1..3) {
        println("Неверный ввод.")
        return
    }

    val number_comp = Random.nextInt(1, 4)
    println("Выбор компьютера: $number_comp.")

    if (number_user == number_comp) {
        println("Ничья")
    } else if (number_user == 1 && number_comp == 2) {
            println("Камень ломает ножницы. Вы победили")
        } else if (number_user == 2 && number_comp == 3) {
                println("Ножницы разрезают бумагу. Вы победили")
            } else if (number_user == 3 && number_comp == 1) {
                    println("Бумага обертывает камень. Вы победили")
                } else if (number_user == 2 && number_comp == 1) {
                        println("Камень ломает ножницы. Вы проиграли")
                    } else  if (number_user == 3 && number_comp == 2) {
                            println("Ножницы разрезают бумагу. Вы проиграли")
                        } else if (number_user == 1 && number_comp == 3) {
                                println("Бумага обертывает камень. Вы проиграли")
                            }
                        }
