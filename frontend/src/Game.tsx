import {buyCar1000} from "./services/apiService";


export default function Game(){

    function buyACar1000(){
        buyCar1000()
    }

    return(
        <div>
            <button onClick={buyACar1000}>Buy a car!</button>
        </div>
    )
}