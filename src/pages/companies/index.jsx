import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import './company.css'

export default function Companies() {
    const [mainListComp, setMainListComp] = useState([])

    const getListComp = () => {
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
        getListComp()
    },[])

    return (
        <section>
            <p className="ListComp">Listagem Empresa</p>
            <Link to={'/add-company/'} className="AddComp">Adicionar uma nova empresa</Link>

            <ul>
                {mainListComp.length ? 
                mainListComp.map( (item) => {
                    return(
                        <div className="CardComp">
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