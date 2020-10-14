fun main(){
    var cache = Cache()
    cache.loginUser(userName = "farango",password = "passwor",ip="192.168.1.2")
    cache.loginUser(userName = "farango",password = "passwor",ip="192.168.1.2")
    cache.loginUser(userName = "farango",password = "passwo",ip="192.168.1.2")
    cache.createOrder("22")
    cache.loginUser(userName = "farango",password = "password",ip="192.168.1.2")
    cache.loginUser(userName = "farango",password = "password",ip="192.168.1.3")
    cache.createOrder("22")
}

