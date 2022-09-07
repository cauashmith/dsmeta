import logo from '../../assets/img/logo.svg'

import './styles.css'

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSMeta" />
                <h1>DSMeta</h1>
                <p>
                    <b>Desenvolvido por <a href="https://www.instagram.com/cauashmith/">@cauashmith</a></b>
                </p>
            </div>
        </header>
    )
}

export default Header
