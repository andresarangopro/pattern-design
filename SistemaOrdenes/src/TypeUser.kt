class TypeUser() {
    var id:String?=null
    var type:String?=null
    var permits:ArrayList<String>?=null

    constructor(id:String, type:String, permits:ArrayList<String>):this(){
        this.id = id
        this.type = type
        this.permits = permits
    }

}