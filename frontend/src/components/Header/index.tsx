import logo from '../../assets/img/logo.svg'

import './styles.css'

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSMeta" />
                    <h1>Spring React Application</h1>
                <p>
                    <b>Desenvolvido por <a href="https://www.instagram.com/cauashmith/" target="_blank" >@cauashmith</a></b>
                </p>
            </div>
        </header>
    )
}

export default Header
