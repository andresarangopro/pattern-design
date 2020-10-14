fun main(){
    var order = Order()
    var auth = Auth()
    auth.loginUser(userName = "farango",password = "passwor",ip="192.168.1.2")
    auth.loginUser(userName = "farango",password = "passwor",ip="192.168.1.2")
    auth.loginUser(userName = "farango",password = "passwo",ip="192.168.1.2")
    order.createOrder("22")
    auth.loginUser(userName = "farango",password = "password",ip="192.168.1.2")
    auth.loginUser(userName = "farango",password = "password",ip="192.168.1.3")
    order.createOrder("22")
}

