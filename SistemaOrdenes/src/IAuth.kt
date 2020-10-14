interface IAuth {
    fun loginUser(userName:String, password:String, ip:String)
    fun onLoginSuccess(user:User)
    fun onLoginFailure(strErr:String, ip: String)
    fun addAttempsAuth(ip: String)
    fun permitLogin(ip: String):Boolean
}