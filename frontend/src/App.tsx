import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Game from './Game';
import RegisterPage from './pages/RegisterPage';
import WelcomePage from './pages/WelcomePage';

export default function App() {

    return (
        <div>
            <BrowserRouter>
                <Routes>
                    <Route path='/' element={<WelcomePage/>}/>
                    <Route path='/register' element={<RegisterPage/>}/>
                    <Route path='/game' element={<Game/>}/>
                </Routes>
            </BrowserRouter>
        </div>
    );
}
