import { useNavigate } from "react-router-dom"

export default function WelcomePage(){

    const nav = useNavigate()

    return(
        <div>
            <div>
                <input placeholder="Username"/>
            </div>
            <div>
                <input type={"password"} placeholder="Password"/>
            </div>
            <div>
                <button>Login</button>
            </div>
            <div>
                <button onClick={()=> nav("/register")}>Register</button>
            </div>
        </div>
    )
}