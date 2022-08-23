import axios from "axios"

export function buyCar1000(){
    axios.post("/api/buy")
}