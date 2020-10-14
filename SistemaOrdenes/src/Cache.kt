import javax.security.auth.login.LoginContext

class Cache {
    var order = Order()
    var auth = Auth()

    fun loginUser(userName: String, password: String, ip:String){
        auth.loginUser(userName,password, ip )
    }
    
    fun onLoginSuccess(){

    }

    fun onLoginFailure(){

    }

    fun createOrder(idOrder:String){
        order.createOrder(idOrder)
    }

    fun onOrderSuccess(){

    }

    fun onOrderFailure(){

    }
}