import './buttonsRc.css'

const ButtonsRc = ({texto, onSubmit}) => {
    return (<div className ='SubButton' onClick={ () => onSubmit()}>
        {texto}
    </div>
    )
}

export default ButtonsRc