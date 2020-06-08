fun main() {
    val listOfstrings = mutableListOf("Box", "Table", "Chair")
    listOfstrings[1] = "Bed"
    listOfstrings.add("Lamp")
    listOfstrings.add(2, "Pencil")
    listOfstrings.removeAt(2)
    val arr = arrayOf("Hey" ,"I'm","Upsite" )
    listOfstrings.addAll(arr)
    print(listOfstrings)
}