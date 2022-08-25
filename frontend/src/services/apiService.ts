import axios from "axios"
import { MyUserCreationData } from "./models"

export function buyCar1000(){
    axios.post("/api/buy")
}



//-------------- login and register ------------//

export function registerUser(myUserCreationData: MyUserCreationData){
    return axios.post("/api/users", myUserCreationData)
}