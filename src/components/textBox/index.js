import './textBox.css'

const TextBox = ({label, placeholder, onChange}) => {
    return (
        <div className="register-css">
            <label>{label}</label>
            <input placeholder={placeholder} onChange={ (e) => onChange(e)} />
        </div>
    )
}

export default TextBox