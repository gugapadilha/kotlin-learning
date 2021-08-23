fun main () {
    // Dependenci Injection - get it from constructor or setter
    val fileSystem: FileSystem = getFileSystem()
    fileSystem.readFile() //actualReadFile
    fileSystem.readDir() //empty list
}

fun getFileSystem(): FileSystem {
    return Fat32FileSystem.MemoryFileSystem(listOf("path/to/file", "/another/path"), "file-contents-go-here")
}

interface FileSystem {
    fun readDir(): List<String>
    fun readFile(): String
}

class Fat32FileSystem: FileSystem {
    override fun readDir(): List<String> {
        return emptyList()
    }

    override fun readFile(): String {
        return "actuallReadFile"
    }

    class ExtFileSystem: FileSystem {
        override fun readFile(): String {
            TODO("Not yet implemented")
        }

        override fun readDir(): List<String> {
            TODO("Not yet implemented")
        }

    }

    class MemoryFileSystem(val files: List<String>, val fileContents: String): FileSystem {
        override fun readDir(): List<String> {
            return files
        }

        override fun readFile(): String {
            return fileContents
        }

    }

}

interface Mammal {
    var hasHands: Boolean
    fun walk()
}

interface Cow: Mammal {
    fun moo() {
        println("Mooooooooo")
    }
}

interface Humans: Mammal {
    fun speak()
}

class SpottedCow(override var hasHands: Boolean = false): Cow {
    override fun walk() {
        println("Walking on 4 legs")
    }
}
class SmartCow(override var hasHands: Boolean): Cow {
    override fun walk() {
        println("ridding a skateboard")
    }

    override fun moo() {
        println("Moo mooo mooo moo")
    }
}

