import TextBox from '../../../components/textBox'
import './Forms.css'
import ButtonsRc from '../../../components/buttonsRc'
import { Link } from "react-router-dom";

const Forms = () =>  {

    return (
        <section className="FormsCss">
            <form>
                <h2>Cadastre uma nova empresa</h2>
                <TextBox label="Nome" placeholder="Digite o nome da empresa"/>
                <TextBox label="CNPJ" placeholder="Digite o CNPJ da empresa"/>
                <TextBox label="Endereco" placeholder="Digite o endereco da empresa"/>
                <TextBox label="Telefone" placeholder="Digite o telefone de contato"/>
                <TextBox label="Vagas para Carro" placeholder="Digite a quantidade de vagas para carros"/>
                <TextBox label="Vagas para Moto" placeholder="Digite a quantidade de vagas para motos"/>
                <div className="ButtonsComp">
                    <Link to={'/companies/'} className='backButton'>Voltar</Link>
                    <ButtonsRc texto="Criar empresa"/>
                </div>
            </form>
        </section>
    )
}

export default Forms
