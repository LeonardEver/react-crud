import TextBox from '../../../components/textBox'
import './Forms.css'
import ListAuto from '../../../components/listAuto'
import ButtonsRc from '../../../components/buttonsRc'
import { Link } from "react-router-dom";

const Forms = ({onSubmit, currentVehicle, setCurrentVehicle}) =>  {

    const tipos = ['Carro', 'Moto']
    
    const aoSalvar = (evento) => {
        evento.preventDefault()
        console.log('Formulario enviado')
    }

    return (
        <section className="FormsCss">
            <form onClick={aoSalvar}>
                <h2>Cadastre seu novo veículo</h2>
                <TextBox label="Marca" placeholder="Digite a marca do veículo" onChange={(e) => {
                    setCurrentVehicle({
                        ...currentVehicle,
                        brand: e.target.value     
                    })
                }}/>
                <TextBox label="Modelo" placeholder="Digite o modelo do veículo" onChange={(e) => {
                    setCurrentVehicle({
                        ...currentVehicle,
                        model: e.target.value
                    })
                }}/>
                <TextBox label="Cor" placeholder="Digite a cor do veículo" onChange={(e) => {
                    setCurrentVehicle({
                        ...currentVehicle,
                        color: e.target.value
                    })
                }}/>
                <TextBox label="Placa" placeholder="Digite a placa do veículo" onChange={(e) => {
                    setCurrentVehicle({
                        ...currentVehicle,
                        carPlate: e.target.value
                    })
                }}/>
                <ListAuto label="Tipo" itens={tipos} onChange={(e) => {
                    setCurrentVehicle({
                        ...currentVehicle,
                        type: e.target.value
                    })
                }}/>
                <div className="dFlex">
                    <Link to={'/vehicles/'} className='backButton'>Voltar</Link>
                    <ButtonsRc texto="Criar entrada" onSubmit={onSubmit}/>
                </div>
            </form>
        </section>
    )
}

export default Forms
