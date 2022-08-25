import { FormEvent, useState } from "react";
import { useNavigate } from "react-router-dom";
import { registerUser } from "../services/apiService";

export default function RegisterPage(){

    const [username, setUsername] = useState("")
    const [password, setPassword] = useState("")
    const [passwordRepeat, setPasswordRepeat] = useState("")
    const nav = useNavigate()

    function register(formEvent: FormEvent){
        formEvent.preventDefault()
        registerUser({username, password, passwordRepeat})
        .then(()=> nav("/"))
    }

    return(
        <div>
            <form onSubmit={register}>
                <div>
                    <input placeholder="Username" onChange={event => setUsername(event.target.value)}/>
                </div>
                <div>
                    <input type={"password"} placeholder="Password" onChange={event => setPassword(event.target.value)}/>
                </div>
                <div>
                    <input type={"password"} placeholder="Password" onChange={event => setPasswordRepeat(event.target.value)}/>
                </div>
                <div>
                    <button>Register</button>
                </div>
            </form>
        </div>
    )
}