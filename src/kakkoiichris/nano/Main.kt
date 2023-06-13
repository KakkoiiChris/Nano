package kakkoiichris.nano

/**
 * Interpreters
 *
 * Copyright (C) 2023, KakkoiiChris
 *
 * File:    Main.kt
 *
 * Created: Tuesday, June 13, 2023, 00:15:01
 *
 * @author Christian Bryce Alexander
 */
fun main(args: Array<String>) {
    if (args.size < 2) {
        System.err.println("usage: nano {ast|asm|cmp|run} <fileName> -d")
    }
    
    val (mode, fileName) = args
    
    when (mode.lowercase()) {
        "ast" -> generateAST(fileName)
        
        "asm" -> generateAssembly(fileName)
        
        "cmp" -> compileFile(fileName)
        
        "run" -> runFile(fileName)
    }
}

private fun generateAST(fileName: String) {}

private fun generateAssembly(fileName: String) {}

private fun compileFile(fileName: String) {}

private fun runFile(fileName: String) {}