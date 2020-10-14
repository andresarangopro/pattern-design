class User() {
    var id:String?=null
    var userName:String?=null
    var password:String?=null
    var email:String?=null
    var name:String?=null
    var lastName:String?=null
    var address:String?=null
    var phone:String?=null
    var typeUser:TypeUser?=null

    constructor(userName: String?, password: String?):this() {
        this.userName = userName
        this.password = password
    }

    constructor(id:String, userName: String?, password: String?):this() {
        this.id = id
        this.userName = userName
        this.password = password
    }

    constructor(id:String, userName: String?, password: String?, typeUser: TypeUser):this() {
        this.id = id
        this.userName = userName
        this.password = password
        this.typeUser = typeUser

    }
}