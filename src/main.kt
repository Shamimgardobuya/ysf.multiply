fun main(){
    var triangle = triangle(4, 3)
    var base = 4
    var height =3
    var area = (1.5*base*height)
    println(area)

}
fun triangle(base:Int,height:Int):Double{
    var area = (1.5*base*height)
    return area
}