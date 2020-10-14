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
            if(SingletonUser.getInstance().typeUser!!.type.equals("Normal")){
                orders!!.add(Order(SingletonUser.getInstance().id!!,idOrder))
                println("Orden creada")
            }else{
                println("Sin permisos para esta función")
            }
        }else{
            println("Loguearse por favor")
        }
    }

}