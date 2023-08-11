import './listAuto.css'

const ListAuto = ({label, itens, onChange}) => {

    return (
        <div className='list-veic'>
            <label>{label}</label>
            <select onChange={ (e) => onChange(e)}>
                {itens.map(item => {
                    return <option key={item}>{item}</option>})}
            </select>
        </div>
    )

}

export default ListAuto