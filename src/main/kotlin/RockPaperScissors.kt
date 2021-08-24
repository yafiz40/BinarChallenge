class RockPaperScissors(gameName: String): Game(), IGame {
    private var isAgain: String? = null
    private var player1Input: String? = null
    private var player2Input: String? = null
    private var player1: String? = null
        set(value) {
            println("Nama pemain pertama menjadi $value")
            field = value
        }

    private var player2: String? = null
        set(value) {
            println("Nama pemain kedua menjadi $value")
            field = value
        }

    init {
        this.gameName = gameName
    }

    override fun startGame() {
        intro()
        inputPlayerName()
        do {
            play()
            do {
                print("Ingin bermain lagi (Y/N)? "); isAgain = readLine()?.uppercase()
            }  while (isAgain.equals("Y").not() && isAgain.equals("N").not())
        } while (isAgain.equals("Y"))
    }

    private fun inputPlayerName() {
        println("INPUT NAMA PEMAIN")
        println("==========================")
        print("Silahkan input nama pemain pertama: "); player1 = readLine() ?: "player1"
        println()
        print("Silahkan input nama pemain kedua: "); player2 = readLine() ?: "player2"
        println("==========================")
    }

    override fun intro() {
        println("==========================")
        println("GAME $gameName TERMINAL VERSION")
        println("==========================")
    }

    override fun play() {
        do {
            print("Masukkan $player1 (gunting/batu/kertas): "); player1Input = readLine()?.uppercase()
        } while ((player1Input in arrayListOf("GUNTING", "BATU", "KERTAS")).not())
        do {
            print("Masukkan $player2 (gunting/batu/kertas): "); player2Input = readLine()?.uppercase()
        } while ((player2Input in arrayListOf("GUNTING", "BATU", "KERTAS")).not())
        print("Hasil: ")

        if (player1Input.equals("GUNTING")) {
            when(player2Input) {
                "GUNTING" -> {
                    println("DRAW!")
                }
                "BATU" -> {
                    println("$player2 MENANG!")
                }
                "KERTAS" -> {
                    println("$player1 MENANG!")
                }
            }
        } else if (player1Input.equals("BATU")) {
            when(player2Input) {
                "GUNTING" -> {
                    println("$player1 MENANG!")
                }
                "BATU" -> {
                    println("DRAW!")
                }
                "KERTAS" -> {
                    println("$player2 MENANG!")
                }
            }

        } else if (player1Input.equals("KERTAS")) {
            when(player2Input) {
                "GUNTING" -> {
                    println("$player2 MENANG!")
                }
                "BATU" -> {
                    println("$player1 MENANG!")
                }
                "KERTAS" -> {
                    println("DRAW!")
                }
            }
        }
    }

}