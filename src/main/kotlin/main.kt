fun main() {
    while (true) {
        print("Введите количество лайков: ")
        val likes = readLine()?.toUInt()
        if (likes != null) if (likes % 10U == 1U && likes % 100U != 11U)
            print("Понравилось $likes человеку\n")
        else print("Понравилось $likes людям\n")
    }
}
