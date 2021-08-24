class RockPaperScissors(gameName: String): Game(), IGame {
    init {
        this.gameName = gameName
    }

    override fun startGame() {
        intro()
    }

    override fun intro() {
        println("==========================")
        println("GAME $gameName TERMINAL VERSION")
        println("==========================")
    }

}