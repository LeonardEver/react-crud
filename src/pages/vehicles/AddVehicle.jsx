import { useState } from 'react';
import Forms from './forms';
import Axios from 'axios';

export default function AddVehicle() {
    const [currentVehicle, setCurrentVehicle] = useState()

    const submitVehicle = () => {
 /*       Axios.post(
            ${environments.catalog}/skus/${value.id}/providers, // ROTA BECK
            currentVehicle
          )
            .then(() => {
              setCurrentVehicle();
              resolve();
            })
            .catch(() => {
              reject(); // ALERT
            }); */
    } 

    return (
        <Forms onSubmit={submitVehicle} currentVehicle={currentVehicle} setCurrentVehicle={setCurrentVehicle}/>
        
        
    )
}