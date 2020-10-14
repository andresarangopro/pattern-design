class Order(){
    var idOrder:String?=null
    var idUser:String?=null
    var orders:ArrayList<Order>?= ArrayList()

    constructor(idOrder: String, idUser: String):this(){
        this.idOrder = idOrder
        this.idUser = idUser
    }

    fun createOrder(idOrder:String){
        if(SingletonUser.getInstance().id != null){
            orders!!.add(Order(SingletonUser.getInstance().id!!,idOrder))
            println("Orden creada")
        }else{
            println("Loguearse por favor")
        }
    }

}