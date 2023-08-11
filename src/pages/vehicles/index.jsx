import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import './vehicles.css'


export default function Vehicles() {
    const [mainList, setMainList] = useState([])

    const getList = () => {
        /*       Axios.get(
                   ${environments.catalog}/skus/${value.id}/providers // ROTA BACK
                 )
                   .then((response) => {
                     setMainList(response);
                     resolve();
                   })
                   .catch(() => {
                     reject(); // ALERT
                   }); */

    }

    useEffect( () => {
        getList()
    },[])

    return (
        <section>
            <p className="ListVeic">Listagem Veiculo</p>
            <Link to={'/add-vehicle/'} className="AddVec">Adicionar novo veiculo</Link>

            <ul>
                {mainList.length ? 
                mainList.map( (item) => {
                    return(
                        <div className="CardVeic">
                            <li>
                                {item?.brand}
                            </li>
                            <li>
                                {item?.model}
                            </li>
                            <li>
                                {item?.color}
                            </li>
                            <li>
                                {item?.carPlate}
                            </li>
                            <li>
                                {item?.type}
                            </li>
                        </div>
                    )
                })

            :<div>
                <p className="listND"> Nenhum item foi Encontrado</p>
            </div>}
            </ul>
            </section>
    )


}