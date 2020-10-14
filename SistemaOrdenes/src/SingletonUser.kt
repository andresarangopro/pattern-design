object SingletonUser {
    var singletonUser:User?=null

    fun getInstance(name:String, pass:String):User{
        if(singletonUser == null){
            singletonUser = User(name, pass)
        }
        return singletonUser!!
    }

    fun getInstance():User{
        if(singletonUser == null){
            singletonUser = User()
        }
        return singletonUser!!
    }

    fun unRegister(){
        this.singletonUser = null
    }

}