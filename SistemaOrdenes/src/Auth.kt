class Auth :IAuth{

    var dirIpMap:HashMap<String,Int>?= HashMap()
    var userPrube = User("farango","password")

    override fun loginUser(userName: String, password: String, ip:String) {
        if(credentialsRigth(userName, password) && permitLogin(ip)){
            var typeUser = TypeUser("id001", "Normal", arrayListOf("permission_create_order"))
            onLoginSuccess(User(id="id001", userName, password, typeUser))
        }else{
            onLoginFailure("Usuario y contraseña erroneos o ya superó los intentos permitidos, intente más tarde",ip=ip)
        }
    }

    fun credentialsRigth(userName: String, password: String):Boolean{
        if(userName.equals(userPrube.userName) && password.equals(userPrube.password))return true
        else return false
    }

    override fun onLoginSuccess(user: User) {
        SingletonUser.getInstance().id = "id001"
        SingletonUser.getInstance().userName = user.userName
        SingletonUser.getInstance().password = user.password
        println("Login success")
    }

    override fun onLoginFailure(strErr: String, ip: String) {
        println(strErr)
        addAttempsAuth(ip)
    }

    override fun addAttempsAuth(ip: String){
        if(dirIpMap!![ip] != null){
            dirIpMap!![ip] = dirIpMap!![ip]!! +1
        }else{
            dirIpMap!!.put(ip,1)
        }
    }

    override fun permitLogin(ip: String):Boolean {
        if(dirIpMap!![ip] != null){
            if(dirIpMap!![ip]!! >= 3){
                return false
            }
        }
        return true
    }
}